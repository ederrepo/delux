package com.store.delux.db.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dlx_accounts")
public class Accounts  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id    
	@Column(name="ACCNT_ID", unique=true, nullable=false, length=7)
	private String accntId;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity=AccountType.class)
    @JoinColumn(name="ACCNT_TYPE", nullable=false)	
    private AccountType accntType;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity=Customer.class)
    @JoinColumn(name="CSTMR_ID")
	private Customer customerId;
	
	@Column(name="DATE_REG", length=19)
	private Timestamp dateReg;
   
	@Column(name="ACUM", precision=2, scale=0)
	private BigDecimal acum;
	
    @Column(name="DATE_UPDT", length=19)
    private Timestamp dateUpdt;

	public String getAccntId() {
		return accntId;
	}

	public void setAccntId(String accntId) {
		this.accntId = accntId;
	}
	
	public AccountType getAccntType() {
		return accntType;
	}

	public void setAccntType(AccountType accntType) {
		this.accntType = accntType;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public Timestamp getDateReg() {
		return dateReg;
	}

	public void setDateReg(Timestamp dateReg) {
		this.dateReg = dateReg;
	}

	public BigDecimal getAcum() {
		return acum;
	}

	public void setAcum(BigDecimal acum) {
		this.acum = acum;
	}

	public Timestamp getDateUpdt() {
		return dateUpdt;
	}

	public void setDateUpdt(Timestamp dateUpdt) {
		this.dateUpdt = dateUpdt;
	}
}


