package com.store.delux.db.dao.impl;

import java.math.BigInteger;

import org.hibernate.Session;

import com.store.delux.db.dao.HeadDAO;
import com.store.delux.db.entity.Customer;
import com.store.delux.db.utils.HibernateUtil;

public class HeadDAOImpl implements HeadDAO {
	
	Session session = new HibernateUtil().getCurrentSession();

	public Customer validateUser(BigInteger userName, String password) throws Exception {
		session = new HibernateUtil().getCurrentSession();		
		Customer result;
		
		result = (Customer) session.createQuery("FROM Customer WHERE cstmrId = :customerId "
				+ "and passwd = :password")
				.setParameter("customerId", userName)
				.setParameter("password", password)
				.uniqueResult();
		
		return result;		
	}

}
