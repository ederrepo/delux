package com.store.delux.db.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dlx_rol")
public class Role  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ROL_ID", unique=true, nullable=false)
	private int rolId;
	
	@Column(name="ROL_NM", nullable=false, length=45)
    private String rolNm;

	public int getRolId() {
		return rolId;
	}

	public void setRolId(int rolId) {
		this.rolId = rolId;
	}

	public String getRolNm() {
		return rolNm;
	}

	public void setRolNm(String rolNm) {
		this.rolNm = rolNm;
	}
}


