package com.store.delux.db.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dlx_products")
public class Products  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id    
	@Column(name="PRDCT_CD", unique=true, nullable=false, length=10)
	private String prdctCd;

	@ManyToOne(fetch=FetchType.EAGER, targetEntity=Category.class)
    @JoinColumn(name="CATEGORY")
    private Category categoryId;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity=Provider.class)
    @JoinColumn(name="PROVIDER", nullable=false)	
    private Provider providerId;
	
    @Column(name="PRDCT_NM", nullable=false, length=60)
	private String prdctNm;
    
    @Column(name="PRDCT_DESC", length=200)
    private String prdctDesc;
    
    @Column(name="PRDCT_WRTY", nullable=false)
    private int prdctWrty;
    
    @Column(name="DATE_REG", nullable=false, length=19)
    private Timestamp dateReg;
    
    @Column(name="PRICE_BUY", nullable=false, precision=2, scale=0)
    private byte priceBuy;
    
    @Column(name="SERIAL_CODE", length=50)
    private String serialCode;
    
    @Column(name="DATE_PRCHS", length=19)
    private Date datePrchs;
    
    @Column(name="QUANTITY")
    private Integer quantity;
    
    @Column(name="AVBLE")
    private Integer avble;

	public String getPrdctCd() {
		return prdctCd;
	}

	public void setPrdctCd(String prdctCd) {
		this.prdctCd = prdctCd;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

	public Provider getProviderId() {
		return providerId;
	}

	public void setProviderId(Provider providerId) {
		this.providerId = providerId;
	}

	public String getPrdctNm() {
		return prdctNm;
	}

	public void setPrdctNm(String prdctNm) {
		this.prdctNm = prdctNm;
	}

	public String getPrdctDesc() {
		return prdctDesc;
	}

	public void setPrdctDesc(String prdctDesc) {
		this.prdctDesc = prdctDesc;
	}

	public int getPrdctWrty() {
		return prdctWrty;
	}

	public void setPrdctWrty(int prdctWrty) {
		this.prdctWrty = prdctWrty;
	}

	public Timestamp getDateReg() {
		return dateReg;
	}

	public void setDateReg(Timestamp dateReg) {
		this.dateReg = dateReg;
	}

	public byte getPriceBuy() {
		return priceBuy;
	}

	public void setPriceBuy(byte priceBuy) {
		this.priceBuy = priceBuy;
	}

	public String getSerialCode() {
		return serialCode;
	}

	public void setSerialCode(String serialCode) {
		this.serialCode = serialCode;
	}

	public Date getDatePrchs() {
		return datePrchs;
	}

	public void setDatePrchs(Date datePrchs) {
		this.datePrchs = datePrchs;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getAvble() {
		return avble;
	}

	public void setAvble(Integer avble) {
		this.avble = avble;
	}
}


