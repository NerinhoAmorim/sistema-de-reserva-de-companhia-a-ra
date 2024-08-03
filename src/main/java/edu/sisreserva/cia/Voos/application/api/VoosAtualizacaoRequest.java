package edu.sisreserva.cia.Voos.application.api;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
@Value
public class VoosAtualizacaoRequest {
	@NotBlank
	private String numeroVoo;
	@NotBlank
	private String origem;
	@NotBlank
	private String destino;
	private LocalDateTime dataHoraPartida;
	private LocalDateTime dataHoraChegada;
	@NotBlank
	private String companhiaAerea;
	@NotBlank
	private String aeronave;
	private int capacidade;
	private int assentosDisponiveis;
	@NotNull
	private double precoPassagem;

}
