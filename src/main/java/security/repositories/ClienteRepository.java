package security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import security.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
