package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")

public class HelloController {

	@GetMapping
	public String helloWorld() {
		return "Hello World";

	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Hello World \n"
				+ "Orientacao ao futuro \n"
				+ "Responsabilidade pessoal \n"
				+ "Mentalidade de crescimento \n"
				+ "Persistencia \n"
				+ "Trabalho em equipe \n"
				+ "Atencao aos detalhes \n"
				+ "Proatividade \n"
				+ "Comunicacao";

	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "MYSQL \n"
				+ "Spring Boot \n"
				+ "DER \n"
				+ "JOIN";

	}



}
