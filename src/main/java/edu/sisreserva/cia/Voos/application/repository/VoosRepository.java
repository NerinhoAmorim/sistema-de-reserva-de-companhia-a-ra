package edu.sisreserva.cia.Voos.application.repository;

import java.util.List;
import java.util.UUID;

import edu.sisreserva.cia.Voos.domain.Voos;

public interface VoosRepository {
	Voos salvaVoos(Voos voos);
	List<Voos> buscarVoos();
	Voos buscaVoosPeloId(UUID idVoos);
	void deletaVoos(Voos voos);

}
