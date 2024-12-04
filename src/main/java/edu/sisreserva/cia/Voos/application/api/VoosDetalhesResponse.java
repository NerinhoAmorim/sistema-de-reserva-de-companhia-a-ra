package edu.sisreserva.cia.Voos.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import edu.sisreserva.cia.Voos.domain.Voos;
import lombok.Value;

@Value
public class VoosDetalhesResponse {
	private UUID idVoos;
	private String numeroVoo;
	private String origem;
	private String destino;
	private LocalDateTime dataHoraPartida;
	private LocalDateTime dataHoraChegada;
	private String companhiaAerea;
	private String aeronave;
	private int capacidade;
	private int assentosDisponiveis;
	private double precoPassagem;

	public VoosDetalhesResponse(Voos voos) {
		this.idVoos = voos.getIdVoos();
		this.numeroVoo = voos.getNumeroVoo();
		this.origem = voos.getOrigem();
		this.destino = voos.getDestino();
		this.dataHoraPartida = voos.getDataHoraPartida();
		this.dataHoraChegada = voos.getDataHoraChegada();
		this.companhiaAerea = voos.getCompanhiaAerea();
		this.aeronave = voos.getAeronave();
		this.capacidade = voos.getCapacidade();
		this.assentosDisponiveis = voos.getAssentosDisponiveis();
		this.precoPassagem = voos.getPrecoPassagem();
	}

}
