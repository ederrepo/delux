package com.store.delux.db.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="dlx_utility")
public class Utility  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="UTIL_ID", unique=true, nullable=false)
	private int utilId;
	
	@Column(name="UTIL_NM", nullable=false, length=45)
	private String utilNm;
	
    @Column(name="UTIL_VAL", nullable=false, precision=2, scale=0)
    private BigDecimal utilVal;

	public int getUtilId() {
		return utilId;
	}

	public void setUtilId(int utilId) {
		this.utilId = utilId;
	}

	public String getUtilNm() {
		return utilNm;
	}

	public void setUtilNm(String utilNm) {
		this.utilNm = utilNm;
	}

	public BigDecimal getUtilVal() {
		return utilVal;
	}

	public void setUtilVal(BigDecimal utilVal) {
		this.utilVal = utilVal;
	}
}


