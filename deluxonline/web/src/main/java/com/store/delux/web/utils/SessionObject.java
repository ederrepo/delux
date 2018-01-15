package com.store.delux.web.utils;

public enum SessionObject {
    Customer("Customer"); 
        
    private String value;
	
	private SessionObject(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
};   

