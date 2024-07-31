package edu.sisreserva.cia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class SistemaDeReservaApplication {
	@GetMapping
	public String getHomeTeste(){
		return "Sistema Reserva de Companhia Aérea _ API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeReservaApplication.class, args);
	}

}
