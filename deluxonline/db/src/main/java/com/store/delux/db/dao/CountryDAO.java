package com.store.delux.db.dao;

import com.store.delux.db.entity.Country;

public interface CountryDAO {
	
	public Integer save(Country country)throws Exception;
	public Country getCountry(Integer idCountry)throws Exception;

}
