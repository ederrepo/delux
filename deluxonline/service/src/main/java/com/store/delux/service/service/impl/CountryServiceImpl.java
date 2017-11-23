package com.store.delux.service.service.impl;

import com.store.delux.db.dao.CountryDAO;
import com.store.delux.db.dao.impl.CountryDAOImpl;
import com.store.delux.db.entity.Country;
import com.store.delux.db.utils.HibernateUtil;
import com.store.delux.service.dto.CountryDTO;
import com.store.delux.service.service.CountryService;

public class CountryServiceImpl implements CountryService {

	private CountryDAO countryDao = new CountryDAOImpl();
	
	public Integer save(CountryDTO country) throws Exception {
		Country countryDb = new Country();
		Integer result = null;
		System.out.println("SAVE 2");
		try{
			countryDb.setCountryId(country.getCountryId());
			countryDb.setCountryNm(country.getCountryNm());
			
			result = countryDao.save(countryDb);
			
			System.out.println("SAVE 5: " + result);
			
		}catch(Exception e){
			HibernateUtil.closeSession(false);
			System.out.println("SAVE 6");
		}finally{
			HibernateUtil.closeSession(true);
			System.out.println("SAVE 7");
		}	
		
		System.out.println("SAVE 8");

		return result;
	}

	public CountryDTO getVountry(Integer idCountry) throws Exception {
		CountryDTO countryDto = new CountryDTO();
		Country countryDb = new Country();
		
		countryDb = countryDao.getCountry(idCountry);
		
		countryDto.setCountryId(countryDb.getCountryId());
		countryDto.setCountryNm(countryDb.getCountryNm());
				
		return countryDto;
	}

}
