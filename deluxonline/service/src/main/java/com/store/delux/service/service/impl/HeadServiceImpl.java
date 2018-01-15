package com.store.delux.service.service.impl;

import java.math.BigInteger;

import com.store.delux.db.dao.HeadDAO;
import com.store.delux.db.dao.impl.HeadDAOImpl;
import com.store.delux.db.entity.Customer;
import com.store.delux.db.utils.HibernateUtil;
import com.store.delux.service.dto.CustomerDTO;
import com.store.delux.service.service.HeadService;

public class HeadServiceImpl implements HeadService {

	private HeadDAO headDao = new HeadDAOImpl();
	
	public CustomerDTO validateUser(BigInteger userName, String password) throws Exception {
		Customer customer = null;
		CustomerDTO customerDto = null;
		
		try{
			customer = headDao.validateUser(userName, password);
			if(customer!=null){
				customerDto = this.convertToDto(customer);				
			}
		}catch(Exception e){
			System.out.println("ERROR: " + e);
			HibernateUtil.closeSession(false);
		}finally{
			HibernateUtil.closeSession(true);			
		}	
		
		return customerDto;
	}
	
	private CustomerDTO convertToDto(Customer customerDb){
		CustomerDTO customer = new CustomerDTO();
		
		customer.setCstmrId(customerDb.getCstmrId().intValue());
		customer.setCstmrNm(customerDb.getCstmrNm());
		customer.setCstmrLnm(customerDb.getCstmrLnm());
		
		return customer;
		
	}

}
