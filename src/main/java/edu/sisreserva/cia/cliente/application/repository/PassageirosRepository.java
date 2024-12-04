package edu.sisreserva.cia.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import edu.sisreserva.cia.cliente.domain.Passageiros;

public interface PassageirosRepository{
	Passageiros salva(Passageiros passageiros);
	List<Passageiros> buscaTodosPassageiros();
	Passageiros buscaPassageirosPorId(UUID idPassageiros);
	void deletaPassageiros(Passageiros passageiros);

}
