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
import edu.sisreserva.cia.cliente.application.service.PassageirosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class VoosApplicationService implements VoosService {

	private final VoosRepository voosRepository;
	private final PassageirosService passageirosService;

	@Override
	public VoosResponse criaVoos(UUID idPassageiros, @Valid VoosRequest voosRequest) {
		log.info("[start] VoosApplicationService - criaVoos");
		passageirosService.buscaPassageirosPorId(idPassageiros);
		Voos voos = voosRepository.salvaVoos(new Voos(idPassageiros, voosRequest));
		log.info("[finish] VoosApplicationService - criaVoos");
		return new VoosResponse(voos.getIdVoos());
	}

	@Override
	public List<VoosListResponse> buscarVoosdpPassageiroComId(UUID idPassageiros) {
		log.info("[start] VoosApplicationService - buscarVoosdpPassageiroComId");
		passageirosService.buscaPassageirosPorId(idPassageiros);
		List<Voos> voosDoPassageiro = voosRepository.buscarVoosDoPassageiroComId(idPassageiros);
		log.info("[finish] VoosApplicationService - buscarVoosdpPassageiroComId");
		return VoosListResponse.converte(voosDoPassageiro);
	}

	@Override
	public VoosDetalhesResponse buscarVoosdoPassageiroComId(UUID idPassageiros, UUID idVoos) {
		log.info("[start] VoosApplicationService - buscarVoosdoPassageiroComId");
		passageirosService.buscaPassageirosPorId(idPassageiros);
		Voos voos = voosRepository.buscaVoosPeloId(idVoos);
		log.info("[finish] VoosApplicationService - buscarVoosdoPassageiroComId");
		return new VoosDetalhesResponse(voos);
	}

	@Override
	public void deletaVoosDoPassageiroComId(UUID idPassageiros, UUID idVoos) {
		log.info("[start] VoosApplicationService - deletaVoosDoPassageiroComId");
		passageirosService.buscaPassageirosPorId(idPassageiros);
		Voos voos = voosRepository.buscaVoosPeloId(idVoos);
		voosRepository.deletaVoos(voos);
		log.info("[finish] VoosApplicationService - deletaVoosDoPassageiroComId");

	}

	@Override
	public void atualizaVoosDoPassageiroComId(UUID idPassageiros, UUID idVoos,
			@Valid VoosAtualizacaoRequest voosAtualizacaoRequest) {
		log.info("[start] VoosApplicationService - atualizaVoosDoPassageiroComId");
		passageirosService.buscaPassageirosPorId(idPassageiros);
		Voos voos = voosRepository.buscaVoosPeloId(idVoos);
		voosRepository.salvaVoos(voos);
		log.info("[finish] VoosApplicationService - atualizaVoosDoPassageiroComId");

	}

}
