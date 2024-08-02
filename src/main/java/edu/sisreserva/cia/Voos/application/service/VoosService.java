package edu.sisreserva.cia.Voos.application.service;

import edu.sisreserva.cia.Voos.application.api.VoosRequest;
import edu.sisreserva.cia.Voos.application.api.VoosResponse;

public interface VoosService {
	VoosResponse criaVoos(VoosRequest voosRequest);

}
