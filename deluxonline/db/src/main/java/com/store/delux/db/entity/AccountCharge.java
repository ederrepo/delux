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
@Table(name="dlx_accnt_chrg")
public class AccountCharge  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id 
    @Column(name="ACCNT_DISC_ID", unique=true, nullable=false)
	private int accntDiscId;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity=AccountType.class)
    @JoinColumn(name="ACCNT_ID", nullable=false)
	private AccountType accntType;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity=Utility.class)
    @JoinColumn(name="UTIL_ID", nullable=false)    
	private Utility utility;

	public int getAccntDiscId() {
		return accntDiscId;
	}

	public void setAccntDiscId(int accntDiscId) {
		this.accntDiscId = accntDiscId;
	}

	public AccountType getAccntType() {
		return accntType;
	}

	public void setAccntType(AccountType accntType) {
		this.accntType = accntType;
	}

	public Utility getUtility() {
		return utility;
	}

	public void setUtility(Utility utility) {
		this.utility = utility;
	}
       
}


