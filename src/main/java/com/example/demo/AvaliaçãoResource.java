package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "avaliacao")


public class AvaliaçãoResource {
	
	@RequestMapping (method = RequestMethod.GET)
	
	public String listar () {
		return "Avaliacao terminada, professor CHIMPA!";
	
		
	}


}

