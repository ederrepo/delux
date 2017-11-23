package com.store.delux.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dlx_sale_desc")
public class SaleDescription  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=IDENTITY)	    
	@Column(name="SL_DESC_ID", unique=true, nullable=false)
	private Integer slDescId;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity=Products.class)
    @JoinColumn(name="PRDCT_CD", nullable=false)
	private Products productId;
     
	@ManyToOne(fetch=FetchType.EAGER, targetEntity=Sale.class)
    @JoinColumn(name="SL_ID", nullable=false)
	private Sale saleId;

    @Column(name="PRDCT_TOT_AMNT", nullable=false, precision=2, scale=0)
    private BigDecimal prdctTotAmnt;
    
    @Column(name="QNTTY", nullable=false)
    private int qntty;
    
    @Column(name="PRDCT_DISC", precision=2, scale=0)
    private BigDecimal prdctDisc;

	public Integer getSlDescId() {
		return slDescId;
	}

	public void setSlDescId(Integer slDescId) {
		this.slDescId = slDescId;
	}

	public Products getProductId() {
		return productId;
	}

	public void setProductId(Products productId) {
		this.productId = productId;
	}

	public Sale getSaleId() {
		return saleId;
	}

	public void setSaleId(Sale saleId) {
		this.saleId = saleId;
	}

	public BigDecimal getPrdctTotAmnt() {
		return prdctTotAmnt;
	}

	public void setPrdctTotAmnt(BigDecimal prdctTotAmnt) {
		this.prdctTotAmnt = prdctTotAmnt;
	}

	public int getQntty() {
		return qntty;
	}

	public void setQntty(int qntty) {
		this.qntty = qntty;
	}

	public BigDecimal getPrdctDisc() {
		return prdctDisc;
	}

	public void setPrdctDisc(BigDecimal prdctDisc) {
		this.prdctDisc = prdctDisc;
	}

}


