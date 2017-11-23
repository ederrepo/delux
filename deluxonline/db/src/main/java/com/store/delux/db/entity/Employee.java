package com.store.delux.db.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dlx_employee")
public class Employee  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id    
	@Column(name="EMPLY_ID", unique=true, nullable=false, length=10)
	private String emplyId;

	@ManyToOne(fetch=FetchType.EAGER, targetEntity=Role.class)
    @JoinColumn(name="ROL_ID", nullable=false)
	private Role roleId;
	
	@ManyToOne(fetch=FetchType.EAGER, targetEntity=State.class)
    @JoinColumn(name="STATE")
    private State state;
	
    @Column(name="EMPLY_NM", nullable=false, length=45)
	private String emplyNm;

    @Column(name="EMPLY_LNM", nullable=false, length=45)
    private String emplyLnm;

    @Column(name="EMAIL", length=45)
    private String email;
    
    @Column(name="LCL_PHONE", length=45)
    private String lclPhone;
    
    @Column(name="CEL_PHONE", length=45)
    private String celPhone;
    
    @Column(name="STREET", length=45)
    private String street;
    
    @Column(name="COLONY", length=45)
    private String colony;
    
    @Column(name="PSTL_CD")
    private Integer pstlCd;
    
    @Column(name="DATE_REG", length=19)
    private Timestamp dateReg;
}


