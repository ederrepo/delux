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
		System.out.println("SAVE 3");
		result = (Integer) session.save(country);
		System.out.println("SAVE 4");
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
