package edu.sisreserva.cia.Voos.application.service;

import org.springframework.stereotype.Service;

import edu.sisreserva.cia.Voos.application.api.VoosRequest;
import edu.sisreserva.cia.Voos.application.api.VoosResponse;
import edu.sisreserva.cia.Voos.application.repository.VoosRepository;
import edu.sisreserva.cia.Voos.domain.Voos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class VoosApplicationService implements VoosService {

	private final VoosRepository voosRepository;

	@Override
	public VoosResponse criaVoos(VoosRequest voosRequest) {
		log.info("[start] VoosApplicationService - criaVoos");
	Voos voos =	voosRepository.salva(new Voos(voosRequest));
		log.info("[finish] VoosApplicationService - criaVoos");
		return VoosResponse.builder().idVoos(voos.getIdVoos()).build();
	}

}
