package edu.sisreserva.cia.Voos.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import edu.sisreserva.cia.Voos.application.service.VoosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class VoosController implements VoosAPI {

	private final VoosService voosService;

	@Override
	public VoosResponse postVoos(UUID idPassageiros, @Valid VoosRequest voosRequest) {
		log.info("[start] VoosController - postVoos ");
		log.info("[idPassageiros] {}", idPassageiros);
		VoosResponse voos = voosService.criaVoos(idPassageiros, voosRequest);
		log.info("[finish] VoosController - postVoos ");
		return voos;
	}

	@Override
	public List<VoosListResponse> buscarVoosDoPassageiroComId(UUID idPassageiros) {
		log.info("[start] VoosController - buscarVoosDoPassageiroComId ");
		log.info("[idPassageiros] {}", idPassageiros);
		List<VoosListResponse> voosDoPassageiro = voosService.buscarVoosdpPassageiroComId(idPassageiros);
		log.info("[finish] VoosController - buscarVoosDoPassageiroComId ");
		return voosDoPassageiro;
	}

	@Override
	public VoosDetalhesResponse bucaVoosDoPassageiroComId(UUID idPassageiros, UUID idVoos) {
		log.info("[start] VoosController - buscaVoosDoPassageiroComId ");
		log.info("[idPassageiros] {} - [idVoos]", idPassageiros, idVoos);
		VoosDetalhesResponse voos = voosService.buscarVoosdoPassageiroComId(idPassageiros, idVoos);
		log.info("[start] VoosController - buscaVoosDoPassageiroComId ");
		return voos;
	}

	@Override
	public void deleteVoosDoPassageiroComId(UUID idPassageiros, UUID idVoos) {
		log.info("[start] VoosController - deleteVoosDoPassageiroComId ");
		log.info("[idPassageiros] {} - [idVoos]", idPassageiros, idVoos);
		voosService.deletaVoosDoPassageiroComId(idPassageiros, idVoos);
		log.info("[finish] VoosController - deleteVoosDoPassageiroComId ");

	}

	@Override
	public void atualizaVoos(UUID idPassageiros, UUID idVoos, @Valid VoosAtualizacaoRequest voosAtualizacaoRequest) {
		log.info("[start] VoosController - atualizaVoos ");
		log.info("[idPassageiros] {} - [idVoos]", idPassageiros, idVoos);
		voosService.atualizaVoosDoPassageiroComId(idPassageiros, idVoos, voosAtualizacaoRequest);
		log.info("[finish] VoosController - atualizaVoos ");

	}

}
