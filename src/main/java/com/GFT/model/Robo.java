package com.GFT.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Robo {
	
	Date cadastro = new Date();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private String nome;
	@Enumerated(EnumType.STRING)
	private Statusrobo statusrobo;
	
	private String equipe;
	
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
	
	
	public Statusrobo getStatusrobo() {
		return statusrobo;
	}
	public void setStatusrobo(Statusrobo statusrobo) {
		this.statusrobo = statusrobo;
	}
	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Date getCadastro()
	{
		return this.cadastro;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robo other = (Robo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
