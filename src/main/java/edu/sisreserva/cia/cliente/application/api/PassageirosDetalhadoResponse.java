package edu.sisreserva.cia.cliente.application.api;

import java.util.UUID;

import edu.sisreserva.cia.cliente.domain.Passageiros;
import lombok.Value;

@Value
public class PassageirosDetalhadoResponse {
	private UUID idPassageiros;
	private String primeiroNome;
	private String ultimoNome;
	private int idade;
	private String genero;
	private String telefone;

	public PassageirosDetalhadoResponse(Passageiros passageiros) {
		this.idPassageiros = passageiros.getIdPassageiros();
		this.primeiroNome = passageiros.getPrimeiroNome();
		this.ultimoNome = passageiros.getUltimoNome();
		this.idade = passageiros.getIdade();
		this.genero = passageiros.getGenero();
		this.telefone = passageiros.getTelefone();
	}

}
