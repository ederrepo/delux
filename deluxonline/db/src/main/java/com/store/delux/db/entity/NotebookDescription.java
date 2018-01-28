package com.store.delux.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dlx_desc_notebook")
public class NotebookDescription implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id    
	@Column(name="NB_DESC_ID", unique=true, nullable=false)
	private Integer nbDescriptionId;
	
	@Column(name="PRDCT_CD")
	private String productCode;
	
	@Column(name="NB_MODELO")
	private String ldModelo;
	
	@Column(name="NB_OS")
	private String ldSO;
	
	@Column(name="NB_MARCA")
	private String ldMarca;
	
	@Column(name="NB_TARJETA_GRAF")
	private String ldTarjteGraficos;
	
	@Column(name="NB_DIMENSIONES")
	private String ldDimensiones;
	
	@Column(name="NB_PESO")
	private String ldPeso;
	
	@Column(name="NB_ACCESORIOS")
	private String ldAccesorios;
	
	@Column(name="NB_BLUETHT")
	private String ldBluetooth;
	
	@Column(name="NB_CACHE_RAM")
	private String ldCacheRam;
	
	@Column(name="NB_DISCO_DURO")
	private String ldDiscoDuro;
	
	@Column(name="NB_COLOR")
	private String ldColor;
	
	@Column(name="NB_TIPO")
	private String ldTipoComputadora;
	
	@Column(name="NB_BATERIA_DURACION")
	private String ldDuracionBateria;
	
	@Column(name="NB_MEMORIA_RAM")
	private String ldMemoriaRam;
	
	@Column(name="NB_PROCESADOR")
	private String ldModeloProcesador;
	
	@Column(name="NB_NUM_PUERTOS")
	private String ldNumeroPuertosUSB;
	
	@Column(name="NB_TIPO_PANTALLA")
	private String ldPantalla;
	
	@Column(name="NB_TAM_PANTALLA")
	private String ldTipoPantalla;
	
	@Column(name="NB_CAM_WEB")
	private String camareWeb;
	
	@Column(name="NB_PUERTOS")
	private String ldPertos;
	
	@Column(name="NB_OTRA_INFO")
	private String ldOtraInformacion;

	public Integer getNbDescriptionId() {
		return nbDescriptionId;
	}

	public void setNbDescriptionId(Integer nbDescriptionId) {
		this.nbDescriptionId = nbDescriptionId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getLdModelo() {
		return ldModelo;
	}

	public void setLdModelo(String ldModelo) {
		this.ldModelo = ldModelo;
	}

	public String getLdSO() {
		return ldSO;
	}

	public void setLdSO(String ldSO) {
		this.ldSO = ldSO;
	}

	public String getLdMarca() {
		return ldMarca;
	}

	public void setLdMarca(String ldMarca) {
		this.ldMarca = ldMarca;
	}

	public String getLdTarjteGraficos() {
		return ldTarjteGraficos;
	}

	public void setLdTarjteGraficos(String ldTarjteGraficos) {
		this.ldTarjteGraficos = ldTarjteGraficos;
	}

	public String getLdDimensiones() {
		return ldDimensiones;
	}

	public void setLdDimensiones(String ldDimensiones) {
		this.ldDimensiones = ldDimensiones;
	}

	public String getLdPeso() {
		return ldPeso;
	}

	public void setLdPeso(String ldPeso) {
		this.ldPeso = ldPeso;
	}

	public String getLdAccesorios() {
		return ldAccesorios;
	}

	public void setLdAccesorios(String ldAccesorios) {
		this.ldAccesorios = ldAccesorios;
	}

	public String getLdBluetooth() {
		return ldBluetooth;
	}

	public void setLdBluetooth(String ldBluetooth) {
		this.ldBluetooth = ldBluetooth;
	}

	public String getLdCacheRam() {
		return ldCacheRam;
	}

	public void setLdCacheRam(String ldCacheRam) {
		this.ldCacheRam = ldCacheRam;
	}

	public String getLdDiscoDuro() {
		return ldDiscoDuro;
	}

	public void setLdDiscoDuro(String ldDiscoDuro) {
		this.ldDiscoDuro = ldDiscoDuro;
	}

	public String getLdColor() {
		return ldColor;
	}

	public void setLdColor(String ldColor) {
		this.ldColor = ldColor;
	}

	public String getLdTipoComputadora() {
		return ldTipoComputadora;
	}

	public void setLdTipoComputadora(String ldTipoComputadora) {
		this.ldTipoComputadora = ldTipoComputadora;
	}

	public String getLdDuracionBateria() {
		return ldDuracionBateria;
	}

	public void setLdDuracionBateria(String ldDuracionBateria) {
		this.ldDuracionBateria = ldDuracionBateria;
	}

	public String getLdMemoriaRam() {
		return ldMemoriaRam;
	}

	public void setLdMemoriaRam(String ldMemoriaRam) {
		this.ldMemoriaRam = ldMemoriaRam;
	}

	public String getLdModeloProcesador() {
		return ldModeloProcesador;
	}

	public void setLdModeloProcesador(String ldModeloProcesador) {
		this.ldModeloProcesador = ldModeloProcesador;
	}

	public String getLdNumeroPuertosUSB() {
		return ldNumeroPuertosUSB;
	}

	public void setLdNumeroPuertosUSB(String ldNumeroPuertosUSB) {
		this.ldNumeroPuertosUSB = ldNumeroPuertosUSB;
	}

	public String getLdPantalla() {
		return ldPantalla;
	}

	public void setLdPantalla(String ldPantalla) {
		this.ldPantalla = ldPantalla;
	}

	public String getLdTipoPantalla() {
		return ldTipoPantalla;
	}

	public void setLdTipoPantalla(String ldTipoPantalla) {
		this.ldTipoPantalla = ldTipoPantalla;
	}

	public String getCamareWeb() {
		return camareWeb;
	}

	public void setCamareWeb(String camareWeb) {
		this.camareWeb = camareWeb;
	}

	public String getLdPertos() {
		return ldPertos;
	}

	public void setLdPertos(String ldPertos) {
		this.ldPertos = ldPertos;
	}

	public String getLdOtraInformacion() {
		return ldOtraInformacion;
	}

	public void setLdOtraInformacion(String ldOtraInformacion) {
		this.ldOtraInformacion = ldOtraInformacion;
	}

}
