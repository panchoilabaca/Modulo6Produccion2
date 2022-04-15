package cl.icap.fullstackjava2022.modulo6.model.repository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.icap.fullstackjava2022.modulo6.model.entity.Movimiento;

@Repository
public interface MovimientoRepository extends JpaRepository<Movimiento, String> {
	
	Optional<Movimiento> findByIdMovim(Integer idMovim);
	
	/*List<Movimiento> findAllByOrderById_movim();*/


}