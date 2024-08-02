package edu.sisreserva.cia.Voos.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.sisreserva.cia.Voos.domain.Voos;

public interface VoosSpringJPARepository extends JpaRepository<Voos, UUID>{

}
