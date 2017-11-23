package com.store.delux.db.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dlx_provider")
public class Provider  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="PRVDR_ID", unique=true, nullable=false)	
	private int prvdrId;

	@ManyToOne(fetch=FetchType.EAGER, targetEntity= State.class)
	@JoinColumn(name="STATE")
    private State stateId;
     
	@Column(name="PRVDR_NM", nullable=false, length=45)
    private String prvdrNm;
	
	@Column(name="PRVDR_STREET", length=45)
    private String prvdrStreet;
	
	@Column(name="PRVDR_COLONY", length=45)
	private String prvdrColony;
	
    @Column(name="PSTL_CD")
	private Integer pstlCd;
    
    @Column(name="LCL_PHONE", length=45)
    private String lclPhone;
    
    @Column(name="CEL_PHONE", length=45)
    private String celPhone;

	public int getPrvdrId() {
		return prvdrId;
	}

	public void setPrvdrId(int prvdrId) {
		this.prvdrId = prvdrId;
	}

	public State getStateId() {
		return stateId;
	}

	public void setStateId(State stateId) {
		this.stateId = stateId;
	}

	public String getPrvdrNm() {
		return prvdrNm;
	}

	public void setPrvdrNm(String prvdrNm) {
		this.prvdrNm = prvdrNm;
	}

	public String getPrvdrStreet() {
		return prvdrStreet;
	}

	public void setPrvdrStreet(String prvdrStreet) {
		this.prvdrStreet = prvdrStreet;
	}

	public String getPrvdrColony() {
		return prvdrColony;
	}

	public void setPrvdrColony(String prvdrColony) {
		this.prvdrColony = prvdrColony;
	}

	public Integer getPstlCd() {
		return pstlCd;
	}

	public void setPstlCd(Integer pstlCd) {
		this.pstlCd = pstlCd;
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
}


