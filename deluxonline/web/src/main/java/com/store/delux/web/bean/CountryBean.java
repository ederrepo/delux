package com.store.delux.web.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.store.delux.service.dto.CountryDTO;
import com.store.delux.service.service.CountryService;
import com.store.delux.service.service.impl.CountryServiceImpl;

@ManagedBean(name = "countryBean")
@ViewScoped
public class CountryBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private CountryDTO country;
	private Integer countryId;
	
	private CountryService countryService;
	
	public CountryBean(){
		country = new CountryDTO();
		countryService = new CountryServiceImpl();
		
		
	}
	
	public String save() throws Exception{
		System.out.println("SAVE 1"); 
		countryService.save(country);
		
		return null;
	}
	
	public String getCountrys() throws Exception{
		country = countryService.getVountry(countryId);
		
		return null;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
		
	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}
	
	

}
