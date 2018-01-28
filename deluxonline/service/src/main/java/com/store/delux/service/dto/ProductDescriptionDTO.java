package com.store.delux.service.dto;

import com.store.delux.service.description.dto.LaptopDescriptionDTO;

public class ProductDescriptionDTO extends LaptopDescriptionDTO {
	
	private String categoria;
	private String decricionGeneral;
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDecricionGeneral() {
		return decricionGeneral;
	}
	public void setDecricionGeneral(String decricionGeneral) {
		this.decricionGeneral = decricionGeneral;
	}
	
	

}
