package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping ("/hallo")
public class HalloController {

		
		@GetMapping
		public String hallo() {
			return "Hallo Generation!!!\n"
			        +"\nMENTALIDADES\n"
					+ "\nOrientação ao futuro\n"
					+ "Responsabilidade pessoal\n"
					+ "Mentalidade de crescimento\n"
					+ "Persistência\n"
					+ "\n"
					+ "HABILIDADES\n"
					+ "\nOrientação ao detalhe\n"
					+ "Comunicação\n"
					+ "Pró-atividade\n"
					+ "Trabalho em equipe\n"
					+"\nObjetivos da semana\n"
			        +"\nAprender mais sobre Spring"
			        +"\nTerminar minha apresentação do pitch";
		}
}
