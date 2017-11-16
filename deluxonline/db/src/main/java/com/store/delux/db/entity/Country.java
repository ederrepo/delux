package com.store.delux.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DLX_COUNTRY")
public class Country implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CNTRY_ID", nullable=false)
	private Integer countryId;
	
	@Column(name="CNTRY_NM")
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
