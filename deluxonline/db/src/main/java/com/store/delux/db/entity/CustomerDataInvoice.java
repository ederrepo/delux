package com.store.delux.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dlx_cstmr_data_inv")
public class CustomerDataInvoice  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=IDENTITY)
	@Column(name="DATA_INV_ID", unique=true, nullable=false)
	private Integer dataInvId;

	@ManyToOne(fetch=FetchType.EAGER, targetEntity=Customer.class)
	@JoinColumn(name="CSTMR_ID", nullable=false)
    private Customer customerId;

    @Column(name="STREET", length=45)
    private String street;
    
    @Column(name="COLONY", length=45)
    private String colony;
    
    @Column(name="PSTL_CD", length=45)
    private String pstlCd;
    
    @Column(name="STATE", length=45)
    private String state;
    
    @Column(name="COUNTRY", length=45)
    private String country;
    
    @Column(name="RFC", length=11)
    private String rfc;
    
    @Column(name="TAXPAYER", length=45)
    private String taxpayer;

	public Integer getDataInvId() {
		return dataInvId;
	}

	public void setDataInvId(Integer dataInvId) {
		this.dataInvId = dataInvId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
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

	public String getPstlCd() {
		return pstlCd;
	}

	public void setPstlCd(String pstlCd) {
		this.pstlCd = pstlCd;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getTaxpayer() {
		return taxpayer;
	}

	public void setTaxpayer(String taxpayer) {
		this.taxpayer = taxpayer;
	}
}


