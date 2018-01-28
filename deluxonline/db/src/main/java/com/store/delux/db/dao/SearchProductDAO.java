package com.store.delux.db.dao;

import java.util.List;

import com.store.delux.db.entity.Category;
import com.store.delux.db.entity.Products;

public interface SearchProductDAO {
	
	public List<Products> getProducts(Category categoryId);
	public Object[] getProductDescription(String productCode);

}
