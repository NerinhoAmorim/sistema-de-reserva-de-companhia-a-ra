package edu.sisreserva.cia.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import edu.sisreserva.cia.cliente.application.api.AtualizacaoPassageirosRequest;
import edu.sisreserva.cia.cliente.application.api.PassageirosDetalhadoResponse;
import edu.sisreserva.cia.cliente.application.api.PassageirosListResponse;
import edu.sisreserva.cia.cliente.application.api.PassageirosRequest;
import edu.sisreserva.cia.cliente.application.api.PassageirosResponse;
import edu.sisreserva.cia.cliente.application.repository.PassageirosRepository;
import edu.sisreserva.cia.cliente.domain.Passageiros;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PassageirosApplicationService implements PassageirosService {
	private final PassageirosRepository passageirosRepository;

	@Override
	public PassageirosResponse criaPassageiros(PassageirosRequest passageirosRequest) {
		log.info("[start] PassageirosApplicationService - criaPassageiros");
		Passageiros passageiros = passageirosRepository.salva(new Passageiros(passageirosRequest));
		log.info("[finish] PassageirosApplicationService - criaPassageiros");
		return PassageirosResponse.builder().idPassageiros(passageiros.getIdPassageiros()).build();
	}

	@Override
	public List<PassageirosListResponse> buscaTodosPassageiros() {
		log.info("[start] PassageirosApplicationService - buscaTodosPassageiros");
		List<Passageiros> passageiros = passageirosRepository.buscaTodosPassageiros();
		log.info("[finish] PassageirosApplicationService - buscaTodosPassageiros");
		return PassageirosListResponse.converte(passageiros);
	}

	@Override
	public PassageirosDetalhadoResponse buscaPassageirosPorId(UUID idPassageiros) {
		log.info("[start] PassageirosApplicationService - buscaPassageirosPorId");
		Passageiros passageiros = passageirosRepository.buscaPassageirosPorId(idPassageiros);
		log.info("[finish] PassageirosApplicationService - buscaPassageirosPorId");
		return new PassageirosDetalhadoResponse(passageiros);
	}

	@Override
	public void deletaPassageirosAtravesId(UUID idPassageiros) {
		log.info("[start] PassageirosApplicationService - deletaPassageirosAtravesId");
		Passageiros passageiros = passageirosRepository.buscaPassageirosPorId(idPassageiros);
		passageirosRepository.deletaPassageiros(passageiros);
		log.info("[finish] PassageirosApplicationService - deletaPassageirosAtravesId");

	}

	@Override
	public void atualizaPassageiros(UUID idPassageiros, AtualizacaoPassageirosRequest atualizacaoPassageirosRequest) {
		log.info("[start] PassageirosApplicationService - atualizaPassageiros");
		Passageiros passageiros = passageirosRepository.buscaPassageirosPorId(idPassageiros);
		passageiros.atualiza(atualizacaoPassageirosRequest);
		passageirosRepository.salva(passageiros);
		log.info("[finish] PassageirosApplicationService - atualizaPassageiros");

	}

}
