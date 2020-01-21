package com.GFT.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.GFT.model.Robo;
import com.GFT.repository.Robos;

@Controller
@RequestMapping("/Robos")
public class tituloscontroler {
	
	@Autowired
	private Robos robos; 
	
	@RequestMapping("/novo")
	public String novo()	
	{
		return "CadastroRobo";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Robo Robo) {
		//TODO: Salvar no banco de dados
		//System.out.println("\n>>" + Robo.getEquipe() + "\n>>" + Robo.getCategoria() + "\n>>" + Robo.getNome() + "\n>>" + Robo.getStatus());
		
		robos.save(Robo);
		
		return "CadastroRobo";
	}
}