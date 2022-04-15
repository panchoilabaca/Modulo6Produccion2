package cl.icap.fullstackjava2022.modulo6.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.icap.fullstackjava2022.modulo6.model.entity.Lote;


@Repository
public interface LoteRepository extends JpaRepository<Lote, String>{

	Optional<Lote> findByIdInvent(Integer idInvent);
	
}