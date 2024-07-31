package edu.sisreserva.cia.cliente.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import edu.sisreserva.cia.cliente.application.service.PassageirosService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PassageirosController implements PassageirosAPI {
	private final PassageirosService passageirosService;

	@Override
	public PassageirosResponse postPassageiros(PassageirosRequest passageirosRequest) {
		log.info("[start] PassageirosController -postPassageiros");
		PassageirosResponse passageirosCriado = passageirosService.criaPassageiros(passageirosRequest);
		log.info("[finish] PassageirosController - postPassageiros");
		return passageirosCriado;
	}

	@Override
	public List<PassageirosListResponse> buscarTodosPassageiros() {
		log.info("[start] PassageirosController -buscarTodosPassageiros");
		List<PassageirosListResponse> passageiros = passageirosService.buscaTodosPassageiros();
		log.info("[finish] PassageirosController -buscarTodosPassageiros");
		return passageiros;
	}

}
