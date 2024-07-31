package edu.sisreserva.cia.cliente.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.sisreserva.cia.cliente.application.repository.PassageirosRepository;
import edu.sisreserva.cia.cliente.domain.Passageiros;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PassageirosInfraRepository implements PassageirosRepository {

	private final PassageirosSpringJPARepository passageirosSpringJPARepository;

	@Override
	public Passageiros salva(Passageiros passageiros) {
		log.info("[start] PassageirosInfraRepository - salva");
		passageirosSpringJPARepository.save(passageiros);
		log.info("[finish] PassageirosInfraRepository - salva");
		return passageiros;
	}

	@Override
	public List<Passageiros> buscaTodosPassageiros() {
		log.info("[start] PassageirosInfraRepository - buscaTodosPassageiros");
		List<Passageiros> todosPassageiros = passageirosSpringJPARepository.findAll();
		log.info("[finish] PassageirosInfraRepository - buscaTodosPassageiros");
		return todosPassageiros;
	}

}
