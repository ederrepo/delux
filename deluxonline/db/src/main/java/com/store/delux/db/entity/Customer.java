package com.store.delux.db.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dlx_customer")
public class Customer  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	 
	@Id @GeneratedValue(strategy=IDENTITY)	    
    @Column(name="CSTMR_ID", unique=true, nullable=false)
	private Integer cstmrId;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity=State.class)
    @JoinColumn(name="STATE")
	private State state;
	
	@Column(name="CSTMR_NM", nullable=false, length=45)
    private String cstmrNm;
	
	@Column(name="CSTMR_LNM", nullable=false, length=45)
	private String cstmrLnm;
	
	@Column(name="EMAIL", length=45)
	private String email;
	
    @Column(name="LCL_PHONE", length=45)
    private String lclPhone;
    
    @Column(name="CEL_PHONE", length=45)
    private String celPhone;
    
    @Column(name="STREET", length=100)
    private String street;
    
    @Column(name="COLONY", length=45)
    private String colony;
    
    @Column(name="PSTL_CD")    
    private Integer pstlCd;
    
    @Column(name="DATE_REG", length=19)
    private Timestamp dateReg;

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

	public Timestamp getDateReg() {
		return dateReg;
	}

	public void setDateReg(Timestamp dateReg) {
		this.dateReg = dateReg;
	}
	
}


