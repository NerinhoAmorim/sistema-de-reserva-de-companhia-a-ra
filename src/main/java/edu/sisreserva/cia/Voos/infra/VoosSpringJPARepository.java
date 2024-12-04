package edu.sisreserva.cia.Voos.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.sisreserva.cia.Voos.domain.Voos;

public interface VoosSpringJPARepository extends JpaRepository<Voos, UUID>{

	 List<Voos> findByIdPassageiroCliente(UUID idPassageiroCliente);

}
