package com.store.delux.db.dao.impl;

import org.hibernate.Session;

import com.store.delux.db.dao.CountryDAO;
import com.store.delux.db.entity.Country;
import com.store.delux.db.utils.HibernateUtil;

public class CountryDAOImpl implements CountryDAO {

	Session session = new HibernateUtil().getCurrentSession();
	
	public Integer save(Country country) throws Exception {
		session = new HibernateUtil().getCurrentSession();
		Integer result;
		 
		result = (Integer) session.save(country);
		 
		return result;
	}

	public Country getCountry(Integer idCountry) throws Exception {
		session = new HibernateUtil().getCurrentSession();
		Country result = null;
		
		result = (Country) session.createQuery("FROM Country WHERE countryId = :country")
				.setParameter("country", idCountry)
				.uniqueResult();
				
		return result;
		
	}

}
