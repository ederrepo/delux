package com.store.delux.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class PurchasesDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long customerId;
	private List<PurchasedProductDTO> productsList;
	private BigDecimal total;
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public List<PurchasedProductDTO> getProductsList() {
		return productsList;
	}
	public void setProductsList(List<PurchasedProductDTO> productsList) {
		this.productsList = productsList;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
