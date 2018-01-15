package com.store.delux.service.service;

import java.math.BigInteger;

import com.store.delux.service.dto.CustomerDTO;

public interface HeadService {
	
	public CustomerDTO validateUser(BigInteger userName, String password)throws Exception;

}
