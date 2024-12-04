package edu.sisreserva.cia.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.sisreserva.cia.cliente.domain.Passageiros;

public interface PassageirosSpringJPARepository extends JpaRepository<Passageiros, UUID> {

}
