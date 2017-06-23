package com.acme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.acme.constants.VistaConstante;



@Controller
public class UsuarioController {
	
	

	@GetMapping("/inicio")
	public ModelAndView inicio(){
		ModelAndView mav = new ModelAndView(VistaConstante.LOGIN);
		return mav;
	}
	

}
