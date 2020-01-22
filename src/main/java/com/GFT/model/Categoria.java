package com.GFT.model;


public enum Categoria {
	ANTWEIGHT("ANTWEIGHT"),
	BEETLEWEIGHT("BEETLEWEIGHT"),
	HOBBYWEIGHT("HOBBYWEIGHT"),
	FEATHERWEIGHT("FEATHERWEIGHT"),
	LIGTHWEIGHT("LIGTHWEIGHT");
	
	
	private String cat;

	Categoria(String cat){
		this.cat = cat;
	}
	
	public void setCat(String cat) {
		this.cat = cat;
	}

	
	public String getCat() {
		return cat;
	}

}
