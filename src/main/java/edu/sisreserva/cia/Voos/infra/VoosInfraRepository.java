package edu.sisreserva.cia.Voos.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import edu.sisreserva.cia.Voos.application.repository.VoosRepository;
import edu.sisreserva.cia.Voos.domain.Voos;
import edu.sisreserva.cia.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class VoosInfraRepository implements VoosRepository {

	private final VoosSpringJPARepository voosSpringJPARepository;

	@Override
	public Voos salvaVoos(Voos voos) {
		log.info("[start] VoosInfraRepository - salvaVoos");
		voosSpringJPARepository.save(voos);
		log.info("[finish] VoosInfraRepository - salvaVoos");
		return voos;
	}

	@Override
	public List<Voos> buscarVoosDoPassageiroComId(UUID idPassageiros) {
		log.info("[start] VoosInfraRepository - buscarVoosDoPassageiroComId");
		var voos = voosSpringJPARepository.findByIdPassageiroCliente(idPassageiros);
		log.info("[finish] VoosInfraRepository - buscarVoosDoPassageiroComId");
		return voos;
	}

	@Override
	public Voos buscaVoosPeloId(UUID idVoos) {
		log.info("[start] VoosInfraRepository - buscaVoosPeloId");
		var voos = voosSpringJPARepository.findById(idVoos).orElseThrow(
				() -> APIException.build(HttpStatus.NOT_FOUND, "Voo não encontrado para o idVoos =" + idVoos));
		log.info("[finish] VoosInfraRepository - buscaVoosPeloId");
		return voos;
	}

	@Override
	public void deletaVoos(Voos voos) {
		log.info("[start] VoosInfraRepository - deletaVoos");
		voosSpringJPARepository.delete(voos);
		log.info("[finish] VoosInfraRepository - deletaVoos");

	}

}
