package br.com.petz.clientepet.cliente.infra;

import br.com.petz.clientepet.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, Long> {
}
