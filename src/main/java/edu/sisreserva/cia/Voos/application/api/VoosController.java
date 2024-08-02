package edu.sisreserva.cia.Voos.application.api;

import org.springframework.web.bind.annotation.RestController;

import edu.sisreserva.cia.Voos.application.service.VoosService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class VoosController implements VoosAPI {

	private final VoosService voosService;

	@Override
	public VoosResponse postVoos(VoosRequest voosRequest) {
		log.info("[start] VoosController - postVoos ");
		VoosResponse voosCriado = voosService.criaVoos(voosRequest);
		log.info("[finish] VoosController - postVoos ");
		return voosCriado;
	}

}
