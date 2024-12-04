package edu.sisreserva.cia.cliente.application.service;

import java.util.List;
import java.util.UUID;

import edu.sisreserva.cia.cliente.application.api.AtualizacaoPassageirosRequest;
import edu.sisreserva.cia.cliente.application.api.PassageirosDetalhadoResponse;
import edu.sisreserva.cia.cliente.application.api.PassageirosListResponse;
import edu.sisreserva.cia.cliente.application.api.PassageirosRequest;
import edu.sisreserva.cia.cliente.application.api.PassageirosResponse;

public interface PassageirosService {
	PassageirosResponse criaPassageiros(PassageirosRequest passageirosRequest);
	List<PassageirosListResponse> buscaTodosPassageiros();
	PassageirosDetalhadoResponse buscaPassageirosPorId(UUID idPassageiros);
	void deletaPassageirosAtravesId(UUID idPassageiros);
	void atualizaPassageiros(UUID idPassageiros, AtualizacaoPassageirosRequest atualizacaoPassageirosRequest);

}
