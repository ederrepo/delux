package com.store.delux.db.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dlx_category")
public class Category  implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @Id @GeneratedValue(strategy=IDENTITY)    
    @Column(name="CTG_ID", unique=true, nullable=false)
	private Integer ctgId;
     
    @Column(name="CTG_CD", nullable=false, length=5)
    private String ctgCd;
    
    @Column(name="CTG_NM", nullable=false, length=45)
    private String ctgNm;

	public Integer getCtgId() {
		return ctgId;
	}

	public void setCtgId(Integer ctgId) {
		this.ctgId = ctgId;
	}

	public String getCtgCd() {
		return ctgCd;
	}

	public void setCtgCd(String ctgCd) {
		this.ctgCd = ctgCd;
	}

	public String getCtgNm() {
		return ctgNm;
	}

	public void setCtgNm(String ctgNm) {
		this.ctgNm = ctgNm;
	}
}


