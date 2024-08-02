package edu.sisreserva.cia.Voos.application.api;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import edu.sisreserva.cia.Voos.domain.Voos;
import lombok.Value;

@Value
public class VoosListResponse {
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

	public static List<VoosListResponse> converte(List<Voos> voos) {
		return voos.stream()
				.map(VoosListResponse::new)
				.collect(Collectors.toList());
	}

	public VoosListResponse(Voos voos) {
		this.idVoos = voos.getIdVoos();
		this.numeroVoo = voos.getNumeroVoo();
		this.origem = voos.getOrigem();
		this.destino = voos.getDestino();
		this.dataHoraPartida = voos.getDataHoraChegada();
		this.dataHoraChegada = voos.getDataHoraChegada();
		this.companhiaAerea = voos.getCompanhiaAerea();
		this.aeronave = voos.getAeronave();
		this.capacidade = voos.getCapacidade();
		this.assentosDisponiveis = voos.getAssentosDisponiveis();
		this.precoPassagem = voos.getPrecoPassagem();

	}

}
