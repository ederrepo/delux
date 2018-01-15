package com.store.delux.web.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "homeBean")
@ViewScoped
public class HomeBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	HeadBean headBean;
	
	public HomeBean(){
		headBean = new HeadBean();
		
	}

	public HeadBean getHeadBean() {
		return headBean;
	}

	public void setHeadBean(HeadBean headBean) {
		this.headBean = headBean;
	}
	
	

}
