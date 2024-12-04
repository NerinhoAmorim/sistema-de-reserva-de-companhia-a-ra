package edu.sisreserva.cia.Voos.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import edu.sisreserva.cia.Voos.application.api.VoosAtualizacaoRequest;
import edu.sisreserva.cia.Voos.application.api.VoosDetalhesResponse;
import edu.sisreserva.cia.Voos.application.api.VoosListResponse;
import edu.sisreserva.cia.Voos.application.api.VoosRequest;
import edu.sisreserva.cia.Voos.application.api.VoosResponse;
import edu.sisreserva.cia.Voos.application.repository.VoosRepository;
import edu.sisreserva.cia.Voos.domain.Voos;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class VoosApplicationService implements VoosService {

	private final VoosRepository voosRepository;

	@Override
	public VoosResponse criaVoos( @Valid VoosRequest voosRequest) {
		log.info("[start] VoosApplicationService - criaVoos");
		Voos voos = voosRepository.salvaVoos(new Voos( voosRequest));
		log.info("[finish] VoosApplicationService - criaVoos");
		return  VoosResponse.builder().idVoos(voos.getIdVoos()).build();
	}

	@Override
	public List<VoosListResponse> buscarVoos() {
		log.info("[start] VoosApplicationService - buscarVoos");
		List<Voos> voosDetalhado = voosRepository.buscarVoos();
		log.info("[finish] VoosApplicationService - buscarVoos");
		return VoosListResponse.converte(voosDetalhado);
	}

	@Override
	public VoosDetalhesResponse buscarVoosComId( UUID idVoos) {
		log.info("[start] VoosApplicationService - buscarVoosComId");
		Voos voos = voosRepository.buscaVoosPeloId(idVoos);
		log.info("[finish] VoosApplicationService - buscarVoosComId");
		return new VoosDetalhesResponse(voos);
	}

	@Override
	public void deletaVoosComId( UUID idVoos) {
		log.info("[start] VoosApplicationService - deletaVoosComId");
		Voos voos = voosRepository.buscaVoosPeloId(idVoos);
		voosRepository.deletaVoos(voos);
		log.info("[finish] VoosApplicationService - deletaVoosComId");

	}

	@Override
	public void atualizaVoosComId(UUID idVoos,
			@Valid VoosAtualizacaoRequest voosAtualizacaoRequest) {
		log.info("[start] VoosApplicationService - atualizaVoosDoPassageiroComId");
		Voos voos = voosRepository.buscaVoosPeloId(idVoos);
		voosRepository.salvaVoos(voos);
		log.info("[finish] VoosApplicationService - atualizaVoosDoPassageiroComId");

	}

}
