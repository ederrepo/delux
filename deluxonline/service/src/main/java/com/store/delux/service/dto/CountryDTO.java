package com.store.delux.service.dto;

import java.io.Serializable;

public class CountryDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer countryId;
	private String countryNm;
	
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public String getCountryNm() {
		return countryNm;
	}
	public void setCountryNm(String countryNm) {
		this.countryNm = countryNm;
	}
}
