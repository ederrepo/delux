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
@Table(name="dlx_state")
public class State  implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @Id     
    @Column(name="STT_ID", unique=true, nullable=false, length=5)
	private String sttId;

    @ManyToOne(fetch=FetchType.LAZY, targetEntity=Country.class)
    @JoinColumn(name="CNTRY_ID")
    private Country country;
    
    @Column(name="STT_NM", length=45)
    private String sttNm;

	public String getSttId() {
		return sttId;
	}

	public void setSttId(String sttId) {
		this.sttId = sttId;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getSttNm() {
		return sttNm;
	}

	public void setSttNm(String sttNm) {
		this.sttNm = sttNm;
	}
}


