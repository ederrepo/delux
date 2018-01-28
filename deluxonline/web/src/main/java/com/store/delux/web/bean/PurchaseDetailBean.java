package com.store.delux.web.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.store.delux.service.dto.PurchasedProductDTO;
import com.store.delux.service.dto.PurchasesDTO;

@ManagedBean(name = "detailBean")
@ViewScoped
public class PurchaseDetailBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	
	private PurchasesDTO purchases;
	
	private HeadBean headBean;
	
	public PurchaseDetailBean(){
		headBean = new HeadBean();
		purchases = new PurchasesDTO();
		
		List<PurchasedProductDTO> products = new ArrayList<PurchasedProductDTO>();
		purchases.setProductsList(products);
	}

	public HeadBean getHeadBean() {
		return headBean;
	}

	public void setHeadBean(HeadBean headBean) {
		this.headBean = headBean;
	}

	public PurchasesDTO getPurchases() {
		return purchases;
	}

	public void setPurchases(PurchasesDTO purchases) {
		this.purchases = purchases;
	}
}
