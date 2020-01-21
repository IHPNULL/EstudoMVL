package com.GFT.model;


public enum Statusrobo {
	ATIVO("ATIVO"),
	APOSENTADO("APOSENTADO"),
	PROJETO("PROJETO");

	
	private String desc;
	
	Statusrobo(String desc){
		this.desc = desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
	

}
