package com.GFT.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.GFT.model.Robo;

@Controller
@RequestMapping("/Robos")
public class tituloscontroler {
	
	@RequestMapping("/novo")
	public String novo()	
	{
		return "CadastroRobo";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Robo Robo) {
		//TODO: Salvar no banco de dados
		System.out.println("\n>>" + Robo.getEquipe() + "\n>>" + Robo.getCategoria() + "\n>>" + Robo.getNome() + "\n>>" + Robo.getStatus());
		
		return "CadastroRobo";
	}
}