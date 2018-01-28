package com.store.delux.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProductDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String prodCode;
	private String prodName;
	private String prodDesc;
	private String prodImg;
	private Integer prodWrty;
	private Date regDate;
	private BigDecimal priceBuy;
	private String serialCode;
	private Integer provider;
	private Date datePurchs;
	private Integer category;
	private Integer qntty;
	private Integer aviableFlg;
	
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}	
	public String getProdImg() {
		return prodImg;
	}
	public void setProdImg(String prodImg) {
		this.prodImg = prodImg;
	}
	public Integer getProdWrty() {
		return prodWrty;
	}
	public void setProdWrty(Integer prodWrty) {
		this.prodWrty = prodWrty;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public BigDecimal getPriceBuy() {
		return priceBuy;
	}
	public void setPriceBuy(BigDecimal priceBuy) {
		this.priceBuy = priceBuy;
	}
	public String getSerialCode() {
		return serialCode;
	}
	public void setSerialCode(String serialCode) {
		this.serialCode = serialCode;
	}
	public Integer getProvider() {
		return provider;
	}
	public void setProvider(Integer provider) {
		this.provider = provider;
	}
	public Date getDatePurchs() {
		return datePurchs;
	}
	public void setDatePurchs(Date datePurchs) {
		this.datePurchs = datePurchs;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
	public Integer getQntty() {
		return qntty;
	}
	public void setQntty(Integer qntty) {
		this.qntty = qntty;
	}
	public Integer getAviableFlg() {
		return aviableFlg;
	}
	public void setAviableFlg(Integer aviableFlg) {
		this.aviableFlg = aviableFlg;
	}

}
