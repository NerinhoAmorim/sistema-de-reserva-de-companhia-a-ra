package edu.sisreserva.cia.Voos.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import edu.sisreserva.cia.Voos.application.api.VoosRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Getter
@Table(name = "voos")
public class Voos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idVoos", updatable = false, unique = true, nullable = false)
	private UUID idVoos;
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

	public Voos(VoosRequest voosRequest) {
		this.numeroVoo = voosRequest.getNumeroVoo();
		this.origem = voosRequest.getOrigem();
		this.destino = voosRequest.getDestino();
		this.dataHoraPartida = voosRequest.getDataHoraChegada();
		this.dataHoraChegada = voosRequest.getDataHoraChegada();
		this.companhiaAerea = voosRequest.getCompanhiaAerea();
		this.aeronave = voosRequest.getAeronave();
		this.capacidade = voosRequest.getCapacidade();
		this.assentosDisponiveis = voosRequest.getAssentosDisponiveis();
		this.precoPassagem = voosRequest.getPrecoPassagem();
	}

}
