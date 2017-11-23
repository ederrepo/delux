package com.store.delux.db.utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Logger LOGGER = LogManager.getLogger(HibernateUtil.class);
	private static final ThreadLocal<Session> session = new ThreadLocal<Session>();
	private static final ThreadLocal<Transaction> transaction = new ThreadLocal<Transaction>();
	public static SessionFactory sessionFactory;
	
	
     public HibernateUtil(){ 
        try {
        	
        if(sessionFactory==null || sessionFactory.isClosed()){ 	
        	Configuration configuration = new Configuration();	
        	configuration.configure("hibernate-commons.cfg.xml");        	
        	sessionFactory = configuration.buildSessionFactory();
        	
        }	        
        
        
        }catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

   
    
    public  Session getCurrentSession() throws HibernateException {
		Session s = session.get();
		// Open a new Session, if this Thread has none yet
		if (s == null) {
			s = sessionFactory.openSession();
			session.set(s);
		}

		if (transaction.get() == null || !transaction.get().isActive()) {
			Transaction tx = s.beginTransaction();
			transaction.set(tx);
		}
		return s;
	}
    
    public static void closeSession(boolean isSuccess) throws Exception {
		Session s = (Session) session.get();
		Transaction tx = transaction.get();
		session.set(null);
		transaction.set(null);

		if (s != null) {
			try {
				if (tx != null) {
					if (isSuccess) {
						try {							
							tx.commit();//							
						} catch (Exception e) {
							LOGGER.debug("Problems commiting the transaction! " + e.getMessage());
							try {
								LOGGER.debug("Rollbacking transaction...");
								tx.rollback();
								LOGGER.debug("Rollback completed.");
							} catch (Exception ex) {
								LOGGER.error("ERROR IN ROLLBACK AFTER COMMIT!! "+ex.getMessage(), ex);
								throw new Exception(ex.getMessage());
							}
							throw new Exception(e.getMessage());
						}
					} else {
						try {
							LOGGER.debug("Rollbacking transaction...");
							tx.rollback();
							LOGGER.debug("Rollback completed.");
						} catch (Exception ex) {
							LOGGER.error("ERROR IN ROLLBACK!! "+ex.getMessage(), ex);
							throw new Exception(ex.getMessage());
						}
					}
				}
			} catch (Exception exc) {
				throw exc;
			} finally {
				try{
					s.close();
				} catch(Exception e){
					LOGGER.error("EXCEPTION CLOSSING SESSION!!! "+e.getMessage(), e);
					throw new Exception(e.getMessage());
				}
			}
		}
	}


	
   
}
