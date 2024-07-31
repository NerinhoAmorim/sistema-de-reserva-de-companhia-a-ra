package edu.sisreserva.cia.cliente.application.service;

import java.util.List;

import edu.sisreserva.cia.cliente.application.api.PassageirosListResponse;
import edu.sisreserva.cia.cliente.application.api.PassageirosRequest;
import edu.sisreserva.cia.cliente.application.api.PassageirosResponse;

public interface PassageirosService {
	PassageirosResponse criaPassageiros(PassageirosRequest passageirosRequest);
	List<PassageirosListResponse> buscaTodosPassageiros();

}
