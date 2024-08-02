package edu.sisreserva.cia.Voos.infra;

import org.springframework.stereotype.Repository;

import edu.sisreserva.cia.Voos.application.repository.VoosRepository;
import edu.sisreserva.cia.Voos.domain.Voos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class VoosInfraRepository implements VoosRepository {

	private final VoosSpringJPARepository voosSpringJPARepository;

	@Override
	public Voos salva(Voos voos) {
		log.info("[start] VoosInfraRepository - salva");
		voosSpringJPARepository.save(voos);
		log.info("[finish] VoosInfraRepository - salva");
		return voos;
	}

}
