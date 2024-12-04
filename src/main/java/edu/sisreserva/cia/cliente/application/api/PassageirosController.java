package edu.sisreserva.cia.cliente.application.api;

import java.util.List;
import java.util.UUID;

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

	@Override
	public PassageirosDetalhadoResponse buscaPassageirosAtravesId(UUID idPassageiros) {
		log.info("[start] PassageirosController - buscaPassageirosAtravesId");
		log.info("[idPassageiros] {}", idPassageiros);
		PassageirosDetalhadoResponse passageirosDetalhado = passageirosService.buscaPassageirosPorId(idPassageiros);
		log.info("[finish] PassageirosController - buscaPassageirosAtravesId");
		return passageirosDetalhado;
	}

	@Override
	public void deletaPassageirosAtravesId(UUID idPassageiros) {
		log.info("[start] PassageirosController -deletaPassageirosAtravesId");
		log.info("[idPassageiros] {}", idPassageiros);
		passageirosService.deletaPassageirosAtravesId(idPassageiros);
		log.info("[finish] PassageirosController -deletaPassageirosAtravesId");

	}

	@Override
	public void atualizaPassageiros(UUID idPassageiros,
			 AtualizacaoPassageirosRequest atualizacaoPassageirosRequest) {
		log.info("[start] PassageirosController - atualizaPassageiros");
		log.info("[idPassageiros] {}", idPassageiros);
		passageirosService.atualizaPassageiros(idPassageiros, atualizacaoPassageirosRequest);
		log.info("[finish] PassageirosController - atualizaPassageiros");

	}

}
