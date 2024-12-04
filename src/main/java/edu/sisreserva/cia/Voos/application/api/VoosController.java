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
	public VoosResponse postVoos( @Valid VoosRequest voosRequest) {
		log.info("[start] VoosController - postVoos ");
		VoosResponse voos = voosService.criaVoos( voosRequest);
		log.info("[finish] VoosController - postVoos ");
		return voos;
	}

	@Override
	public List<VoosListResponse> buscarVoos() {
		log.info("[start] VoosController - buscarVoosDoPassageiroComId ");
		List<VoosListResponse> detalhaVoos = voosService.buscarVoos();
		log.info("[finish] VoosController - buscarVoosDoPassageiroComId ");
		return detalhaVoos;
	}

	@Override
	public VoosDetalhesResponse bucaVoosComId( UUID idVoos) {
		log.info("[start] VoosController - buscaVoosDoPassageiroComId ");
		log.info(" [idVoos]", idVoos);
		VoosDetalhesResponse voos = voosService.buscarVoosComId( idVoos);
		log.info("[start] VoosController - buscaVoosDoPassageiroComId ");
		return voos;
	}

	@Override
	public void deleteVoosComId( UUID idVoos) {
		log.info("[start] VoosController - deleteVoosDoPassageiroComId ");
		log.info("[idVoos]",  idVoos);
		voosService.deletaVoosComId(idVoos);
		log.info("[finish] VoosController - deleteVoosDoPassageiroComId ");

	}

	@Override
	public void atualizaVoos(UUID idVoos, @Valid VoosAtualizacaoRequest voosAtualizacaoRequest) {
		log.info("[start] VoosController - atualizaVoos ");
		log.info("[idVoos]",  idVoos);
		voosService.atualizaVoosComId(idVoos, voosAtualizacaoRequest);
		log.info("[finish] VoosController - atualizaVoos ");

	}

}
