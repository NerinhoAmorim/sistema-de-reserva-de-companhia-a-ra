package edu.sisreserva.cia.Voos.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/voos")
public interface VoosAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	VoosResponse postVoos( @Valid @RequestBody VoosRequest voosRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<VoosListResponse> buscarVoos();

	@GetMapping(value = "/{idVoos}")
	@ResponseStatus(code = HttpStatus.OK)
	VoosDetalhesResponse bucaVoosComId( @PathVariable UUID idVoos);

	@DeleteMapping(value = "/{idVoos}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deleteVoosComId( @PathVariable UUID idVoos);

	@PatchMapping(value = "/{idVoos}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void atualizaVoos(@PathVariable UUID idVoos,
			@Valid @RequestBody VoosAtualizacaoRequest voosAtualizacaoRequest);

}
