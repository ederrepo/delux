package com.store.delux.db.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dlx_pay_type")
public class PaymentType  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="PAY_ID", unique=true, nullable=false)
	private int payId;
	
    @Column(name="PAY_TYPE", nullable=false, length=45)
    private String payType;

	public int getPayId() {
		return payId;
	}

	public void setPayId(int payId) {
		this.payId = payId;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}
}


