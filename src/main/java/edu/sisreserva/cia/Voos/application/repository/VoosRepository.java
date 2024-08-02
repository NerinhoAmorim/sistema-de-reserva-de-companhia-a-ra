package edu.sisreserva.cia.Voos.application.repository;

import java.util.List;

import edu.sisreserva.cia.Voos.domain.Voos;

public interface VoosRepository {
	Voos salva(Voos voos);
	List<Voos> buscarTodosVoos();

}
