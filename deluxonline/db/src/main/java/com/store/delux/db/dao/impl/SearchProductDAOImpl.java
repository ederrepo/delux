package com.store.delux.db.dao.impl;

import java.util.List;

import org.hibernate.Session;
import com.store.delux.db.dao.SearchProductDAO;
import com.store.delux.db.entity.Category;
import com.store.delux.db.entity.Products;
import com.store.delux.db.utils.HibernateUtil;

public class SearchProductDAOImpl implements SearchProductDAO {
	
	Session session = new HibernateUtil().getCurrentSession();

	public List<Products> getProducts(Category categoryId) {
		session = new HibernateUtil().getCurrentSession();
		List<Products> result;
		
		result = (List<Products>) session.createQuery("FROM Products WHERE categoryId = :category ")				
				.setParameter("category", categoryId)
				.list();				
		
		return result;
	}
	
	public Object[] getProductDescription(String productCode) {
		session = new HibernateUtil().getCurrentSession();
		
		
		return null;
	}
	
}
