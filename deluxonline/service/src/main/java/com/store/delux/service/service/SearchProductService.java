package com.store.delux.service.service;

import java.util.List;

import com.store.delux.service.dto.ProductDTO;

public interface SearchProductService {
	
	public List<ProductDTO> getProductsByCategory(Integer category) throws Exception;

}
