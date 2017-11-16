package com.store.delux.service.service;

import com.store.delux.service.dto.CountryDTO;

public interface CountryService {
	
	public Integer save(CountryDTO country)throws Exception;
	public CountryDTO getVountry(Integer idCountry)throws Exception;

}
