package com.store.delux.db.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name="dlx_sale")
public class Sale  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=IDENTITY)	    
	@Column(name="SL_ID", unique=true, nullable=false)
	private Integer slId;

	@ManyToOne(fetch=FetchType.EAGER, targetEntity=Accounts.class)
    @JoinColumn(name="SL_ACCNT_CSTMR")
    private Accounts accountsId;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity=Customer.class)
    @JoinColumn(name="SL_CSTMR")
	private Customer customerId;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity=Employee.class)
    @JoinColumn(name="SL_SALESMAN")
	private Employee employeeId;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity=PaymentType.class)
    @JoinColumn(name="SL_PYMT_TYPE", nullable=false)
	private PaymentType payTypeId;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity=SaleMethod.class)
    @JoinColumn(name="SL_METHOD", nullable=false)	
	private SaleMethod saleMethodId;
	
	@Column(name="SL_AMNT_TOT", nullable=false, precision=2, scale=0)
	private BigDecimal slAmntTot;
	
	@Column(name="SL_AMNT_SUB", nullable=false, precision=2, scale=0)
	private BigDecimal slAmntSub;
	
	@Column(name="DISCOUNT", nullable=false, precision=2, scale=0)
	private BigDecimal discount;
    
	@Column(name="VAT", nullable=false, precision=2, scale=0)
	private BigDecimal vat;
	
    @Column(name="SL_DATE", nullable=false, length=19)
	private Timestamp slDate;
    
    @Column(name="SL_PACK_AWB")
    private Integer slPackAwb;

	public Integer getSlId() {
		return slId;
	}

	public void setSlId(Integer slId) {
		this.slId = slId;
	}

	public Accounts getAccountsId() {
		return accountsId;
	}

	public void setAccountsId(Accounts accountsId) {
		this.accountsId = accountsId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}

	public PaymentType getPayTypeId() {
		return payTypeId;
	}

	public void setPayTypeId(PaymentType payTypeId) {
		this.payTypeId = payTypeId;
	}

	public SaleMethod getSaleMethodId() {
		return saleMethodId;
	}

	public void setSaleMethodId(SaleMethod saleMethodId) {
		this.saleMethodId = saleMethodId;
	}

	public BigDecimal getSlAmntTot() {
		return slAmntTot;
	}

	public void setSlAmntTot(BigDecimal slAmntTot) {
		this.slAmntTot = slAmntTot;
	}

	public BigDecimal getSlAmntSub() {
		return slAmntSub;
	}

	public void setSlAmntSub(BigDecimal slAmntSub) {
		this.slAmntSub = slAmntSub;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getVat() {
		return vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	public Timestamp getSlDate() {
		return slDate;
	}

	public void setSlDate(Timestamp slDate) {
		this.slDate = slDate;
	}

	public Integer getSlPackAwb() {
		return slPackAwb;
	}

	public void setSlPackAwb(Integer slPackAwb) {
		this.slPackAwb = slPackAwb;
	}
    

}


