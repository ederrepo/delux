package com.store.delux.service.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.store.delux.db.dao.SearchProductDAO;
import com.store.delux.db.dao.impl.SearchProductDAOImpl;
import com.store.delux.db.entity.Category;
import com.store.delux.db.entity.Products;
import com.store.delux.db.utils.HibernateUtil;
import com.store.delux.service.dto.ProductDTO;
import com.store.delux.service.service.SearchProductService;

public class SearchProductServiceImpl implements SearchProductService {
	
	private SearchProductDAO productDao = new SearchProductDAOImpl();
		
	public List<ProductDTO> getProductsByCategory(Integer category) throws Exception{
		List<ProductDTO> products = new ArrayList<ProductDTO>(); 
		List<Products> productsDb = new ArrayList<Products>();
		try{
			Category categoryDb = new Category();
			categoryDb.setCtgId(category);
			
			productsDb = productDao.getProducts(categoryDb);
			
			if(!productsDb.isEmpty()){
				for(Products prod: productsDb){
					products.add(convertToDto(prod));
				}
			}
			
		}catch(Exception e){
			System.out.println("ERROR: " + e);
			HibernateUtil.closeSession(false);
		}finally{
			HibernateUtil.closeSession(true);			
		}		
		
		System.out.println("PRODUCTS return: " + products.size());
		return products;
	}
	
	private ProductDTO convertToDto(Products productDb){
		ProductDTO product = new ProductDTO();
		
		product.setProdCode(productDb.getPrdctCd());
		product.setProdName(productDb.getPrdctNm());
		product.setProdDesc(productDb.getPrdctDesc());
		product.setQntty(productDb.getQuantity());
		product.setPriceBuy(productDb.getPriceBuy());
		product.setProdImg("lap_01");
		
		return product;
	}

}
