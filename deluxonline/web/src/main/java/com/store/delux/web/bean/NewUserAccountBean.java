package com.store.delux.web.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "nwAccntBean")
@ViewScoped
public class NewUserAccountBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private HeadBean headBean;

	public NewUserAccountBean(){
		headBean = new HeadBean(); 
		
	}

	public HeadBean getHeadBean() {
		return headBean;
	}

	public void setHeadBean(HeadBean headBean) {
		this.headBean = headBean;
	}
	
	
	
}
