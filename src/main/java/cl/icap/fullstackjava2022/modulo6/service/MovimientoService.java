package cl.icap.fullstackjava2022.modulo6.service;
import java.util.List;

import cl.icap.fullstackjava2022.modulo6.model.entity.Movimiento;


public interface MovimientoService {
	
	public Movimiento get(Integer idMovim);
	public Movimiento insert(Movimiento movimiento);
	public Movimiento update(Movimiento movimiento);
	public List<Movimiento> list();
	public List<Movimiento> listOrderByidMovim();
	public int delete(Integer idMovim);
	
}


