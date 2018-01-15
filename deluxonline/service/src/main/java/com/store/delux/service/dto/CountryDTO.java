package com.store.delux.service.dto;

import java.io.Serializable;

public class CountryDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String countryId;
	private String countryNm;
	
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryNm() {
		return countryNm;
	}
	public void setCountryNm(String countryNm) {
		this.countryNm = countryNm;
	}
}
