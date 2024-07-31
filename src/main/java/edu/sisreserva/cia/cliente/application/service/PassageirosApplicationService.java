package edu.sisreserva.cia.cliente.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

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
}
