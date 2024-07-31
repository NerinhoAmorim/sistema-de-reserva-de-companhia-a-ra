package edu.sisreserva.cia.cliente.domain;

import java.util.UUID;

import edu.sisreserva.cia.cliente.application.api.PassageirosRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Getter
@Table(name = "passageiros")
public class Passageiros {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idPassageiros", updatable = false, unique = true, nullable = false)
	private UUID idPassageiros;
	@NotBlank
	private String primeiroNome;
	@NotBlank
	private String ultimoNome;
	private int idade;
	private String genero;
	@NotBlank
	private String telefone;

	public Passageiros(PassageirosRequest passageirosRequest) {
		this.primeiroNome = passageirosRequest.getPrimeiroNome();
		this.ultimoNome = passageirosRequest.getUltimoNome();
		this.idade = passageirosRequest.getIdade();
		this.genero = passageirosRequest.getGenero();
		this.telefone = passageirosRequest.getTelefone();

	}

}
