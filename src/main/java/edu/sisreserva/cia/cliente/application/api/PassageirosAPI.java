package edu.sisreserva.cia.cliente.application.api;

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
@RequestMapping(value = "/public/v1/passageiros")
public interface PassageirosAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	PassageirosResponse postPassageiros(@Valid @RequestBody PassageirosRequest passageirosRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<PassageirosListResponse> buscarTodosPassageiros();

	@GetMapping(value = "/{idPassageiros}")
	@ResponseStatus(code = HttpStatus.OK)
	PassageirosDetalhadoResponse buscaPassageirosAtravesId(@PathVariable UUID idPassageiros);

	@DeleteMapping(value = "/{idPassageiros}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaPassageirosAtravesId(@PathVariable UUID idPassageiros);

	@PatchMapping(value = "/{idPassageiros}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void atualizaPassageiros(@PathVariable UUID idPassageiros,
			@Valid @RequestBody AtualizacaoPassageirosRequest atualizacaoPassageirosRequest);

}
