package com.store.delux.db.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dlx_accnt_type")
public class AccountType  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id   
	@Column(name="ACCNT_TYPE", unique=true, nullable=false)
	private int accntType;
	
    @Column(name="ACCNT_NM", nullable=false, length=45)
    private String accntNm;
    
    @Column(name="ACCNT_MIN_AMOUNT", nullable=false, precision=2, scale=0)
    private BigDecimal accntMinAmount;
    
    @Column(name="ACCNT_MAX_AMOUNT", nullable=false, precision=2, scale=0)
    private BigDecimal accntMaxAmount;

	public int getAccntType() {
		return accntType;
	}

	public void setAccntType(int accntType) {
		this.accntType = accntType;
	}

	public String getAccntNm() {
		return accntNm;
	}

	public void setAccntNm(String accntNm) {
		this.accntNm = accntNm;
	}

	public BigDecimal getAccntMinAmount() {
		return accntMinAmount;
	}

	public void setAccntMinAmount(BigDecimal accntMinAmount) {
		this.accntMinAmount = accntMinAmount;
	}

	public BigDecimal getAccntMaxAmount() {
		return accntMaxAmount;
	}

	public void setAccntMaxAmount(BigDecimal accntMaxAmount) {
		this.accntMaxAmount = accntMaxAmount;
	}
}


