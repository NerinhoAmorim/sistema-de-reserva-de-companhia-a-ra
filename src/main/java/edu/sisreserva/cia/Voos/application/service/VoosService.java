package edu.sisreserva.cia.Voos.application.service;

import java.util.List;

import edu.sisreserva.cia.Voos.application.api.VoosListResponse;
import edu.sisreserva.cia.Voos.application.api.VoosRequest;
import edu.sisreserva.cia.Voos.application.api.VoosResponse;

public interface VoosService {
	VoosResponse criaVoos(VoosRequest voosRequest);
	List<VoosListResponse> buscarTodosVoos();

}
