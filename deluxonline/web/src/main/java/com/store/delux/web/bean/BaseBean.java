package com.store.delux.web.bean;

import java.io.Serializable;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public abstract class BaseBean implements Serializable {

	private static final long serialVersionUID = 4966072029155119760L;

	protected void setSessionAttribute(String attrName, Object value) {				
		getSession().setAttribute(attrName, value);
	}

	@SuppressWarnings("unchecked")
	protected <T> T getSessionAttribute(String attrName, Class<T> clazz) {
		return (T) getSession().getAttribute(attrName);
	}
	
	private HttpSession getSession() {
		return getRequest().getSession(false);
	}

	protected FacesContext getContext() {
		return FacesContext.getCurrentInstance();
	}


	private HttpServletRequest getRequest() {
		return (HttpServletRequest) getContext().getExternalContext().getRequest();
	}

	protected String getParameter(String param) {
		Map<String, String> paramMap = getContext().getExternalContext().getRequestParameterMap();
		return paramMap.get(param);
	}
	
	protected void showMessage(Integer type, String message){
		FacesMessage facesMessage = new FacesMessage((FacesMessage.Severity) FacesMessage.VALUES.get(type), null, message);
		getContext().addMessage(message, facesMessage);
		
		//FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "PrimeFaces Rocks."));        
	}
	
}
