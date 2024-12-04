package edu.sisreserva.cia.cliente.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;
@Value
public class AtualizacaoPassageirosRequest {
	@NotBlank
	private String primeiroNome;
	@NotBlank
	private String ultimoNome;
	private int idade;
	private String genero;
	@NotBlank
	private String telefone;

}
