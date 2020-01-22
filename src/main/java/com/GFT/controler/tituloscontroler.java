package com.GFT.controler;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.GFT.model.Robo;
import com.GFT.model.Statusrobo;
import com.GFT.repository.Robos;

@Controller
@RequestMapping("/Robos")
public class tituloscontroler {
	
	@Autowired
	private Robos robos; 
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("Cadastrorobo");
		mv.addObject("todosStatusrobo", Statusrobo.values());
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Robo Robo) {	
		robos.save(Robo);
		ModelAndView mv = new ModelAndView("Cadastrorobo");
		mv.addObject("mensagem", "Robo salvo com sucesso!");
		return mv;
	}
	
	@ModelAttribute("todosStatusrobo")
	public List<Statusrobo> todosStatusrobo(){
		return  Arrays.asList(Statusrobo.values());
	}
}