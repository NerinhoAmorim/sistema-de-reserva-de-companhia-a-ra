package edu.sisreserva.cia.cliente.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import edu.sisreserva.cia.cliente.domain.Passageiros;
import lombok.Value;

@Value
public class PassageirosListResponse {
	private UUID idPassageiros;
	private String primeiroNome;
	private String ultimoNome;
	private int idade;
	private String genero;
	private String telefone;

	public static List<PassageirosListResponse> converte(List<Passageiros> passageiros) {
		return passageiros.stream().map(PassageirosListResponse::new).collect(Collectors.toList());
	}

	private PassageirosListResponse(Passageiros passageiros) {
		this.idPassageiros = passageiros.getIdPassageiros();
		this.primeiroNome = passageiros.getPrimeiroNome();
		this.ultimoNome = passageiros.getUltimoNome();
		this.idade = passageiros.getIdade();
		this.genero = passageiros.getGenero();
		this.telefone = passageiros.getTelefone();
	}

}
