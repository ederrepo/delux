package com.store.delux.service.dto;

import java.io.Serializable;
import java.util.Date;
import com.store.delux.db.entity.State;

public class CustomerDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer cstmrId;
	private State state;
    private String cstmrNm;
	private String cstmrLnm;
	private String email;
    private String lclPhone;
    private String celPhone;
    private String street;
    private String colony;
    private Integer pstlCd;
    private Date dateReg;
    private String passwd;
    private String numExt;
    private String numInt;
	public Integer getCstmrId() {
		return cstmrId;
	}
	public void setCstmrId(Integer cstmrId) {
		this.cstmrId = cstmrId;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public String getCstmrNm() {
		return cstmrNm;
	}
	public void setCstmrNm(String cstmrNm) {
		this.cstmrNm = cstmrNm;
	}
	public String getCstmrLnm() {
		return cstmrLnm;
	}
	public void setCstmrLnm(String cstmrLnm) {
		this.cstmrLnm = cstmrLnm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLclPhone() {
		return lclPhone;
	}
	public void setLclPhone(String lclPhone) {
		this.lclPhone = lclPhone;
	}
	public String getCelPhone() {
		return celPhone;
	}
	public void setCelPhone(String celPhone) {
		this.celPhone = celPhone;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public Integer getPstlCd() {
		return pstlCd;
	}
	public void setPstlCd(Integer pstlCd) {
		this.pstlCd = pstlCd;
	}
	public Date getDateReg() {
		return dateReg;
	}
	public void setDateReg(Date dateReg) {
		this.dateReg = dateReg;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getNumExt() {
		return numExt;
	}
	public void setNumExt(String numExt) {
		this.numExt = numExt;
	}
	public String getNumInt() {
		return numInt;
	}
	public void setNumInt(String numInt) {
		this.numInt = numInt;
	}

}
