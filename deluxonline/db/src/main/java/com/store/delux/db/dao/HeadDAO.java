package com.store.delux.db.dao;

import java.math.BigInteger;

import com.store.delux.db.entity.Customer;

public interface HeadDAO {
	
	public Customer validateUser(BigInteger userName, String password)throws Exception;

}
