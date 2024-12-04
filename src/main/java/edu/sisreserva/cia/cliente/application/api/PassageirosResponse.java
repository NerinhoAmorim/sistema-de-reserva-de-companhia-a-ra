package edu.sisreserva.cia.cliente.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PassageirosResponse {
	private UUID idPassageiros;

}
