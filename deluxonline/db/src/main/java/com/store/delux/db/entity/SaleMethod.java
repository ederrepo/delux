package com.store.delux.db.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dlx_sale_method")
public class SaleMethod  implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @Column(name="SL_MTHD_ID", unique=true, nullable=false)
	private int slMthdId;
    
    @Column(name="SL_MTHD_NM", nullable=false, length=45)
    private String slMthdNm;

	public int getSlMthdId() {
		return slMthdId;
	}

	public void setSlMthdId(int slMthdId) {
		this.slMthdId = slMthdId;
	}

	public String getSlMthdNm() {
		return slMthdNm;
	}

	public void setSlMthdNm(String slMthdNm) {
		this.slMthdNm = slMthdNm;
	}
}


