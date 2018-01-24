package com.store.delux.web.bean;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.store.delux.commons.Constants;
import com.store.delux.service.dto.CustomerDTO;
import com.store.delux.service.dto.PurchasedProductDTO;
import com.store.delux.service.dto.PurchasesDTO;
import com.store.delux.service.service.HeadService;
import com.store.delux.service.service.impl.HeadServiceImpl;


public class HeadBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private String message;
	
	private String sessionName;
	
	private boolean loged;
	
	private CustomerDTO customer;
	private PurchasesDTO purchases;
	
	private HeadService headService;
	
	public HeadBean(){
		message = "";		
		username = "";
		password = "";
		loged = false;
		
		headService = new HeadServiceImpl();
		
		purchases = new PurchasesDTO();
		List<PurchasedProductDTO> pchProduct = new ArrayList<PurchasedProductDTO>();
		purchases.setProductsList(pchProduct);
	}
	
	public String signIn() throws NumberFormatException, Exception{		
		customer = headService.validateUser(new BigInteger(username), password);
		
		if(customer==null){
			System.out.println("Incorrecto");
			message = "Datos de usuario incorrectos";
			showMessage(Constants.MESSAGE_TYPE_ERROR ,message);
		}else{
			System.out.println("Correcto");
			loged = true;
			sessionName = customer.getCstmrNm() + " " + customer.getCstmrLnm();
			message = "Acceso correcto: " + sessionName + " bienvenido a Delux computación." ;
			showMessage(Constants.MESSAGE_TYPE_INFO ,message);
		}	
		
		return null;
	}
	
	public void reset(){		
		username = "";
		password = "";
	}
	
	public String newUserAccount(){		
		return "/pages/online/newUserAccount?faces-redirect=true";
	}
	
	public String finalPurch(){
		return "/pages/online/purchaseDetail?faces-redirect=true";
		
	}
	
	public String goProducts(){
		return "/pages/online/products?faces-redirect=true";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public PurchasesDTO getPurchases() {
		return purchases;
	}

	public void setPurchases(PurchasesDTO purchases) {
		this.purchases = purchases;
	}

	public boolean isLoged() {
		return loged;
	}

	public void setLoged(boolean loged) {
		this.loged = loged;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	
	
}
