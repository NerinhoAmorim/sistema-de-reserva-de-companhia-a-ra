package edu.sisreserva.cia.Voos.application.service;

import java.util.List;
import java.util.UUID;

import edu.sisreserva.cia.Voos.application.api.VoosAtualizacaoRequest;
import edu.sisreserva.cia.Voos.application.api.VoosDetalhesResponse;
import edu.sisreserva.cia.Voos.application.api.VoosListResponse;
import edu.sisreserva.cia.Voos.application.api.VoosRequest;
import edu.sisreserva.cia.Voos.application.api.VoosResponse;
import jakarta.validation.Valid;

public interface VoosService {
	VoosResponse criaVoos(@Valid VoosRequest voosRequest);
	List<VoosListResponse> buscarVoos();
	VoosDetalhesResponse buscarVoosComId(UUID idVoos);
	void deletaVoosComId(UUID idVoos);
	void atualizaVoosComId(UUID idVoos, @Valid VoosAtualizacaoRequest voosAtualizacaoRequest);
	

}
