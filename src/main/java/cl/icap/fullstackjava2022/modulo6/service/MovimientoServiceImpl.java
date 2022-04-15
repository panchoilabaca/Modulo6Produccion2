package cl.icap.fullstackjava2022.modulo6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.fullstackjava2022.modulo6.model.entity.Movimiento;
import cl.icap.fullstackjava2022.modulo6.model.repository.MovimientoRepository;
import cl.icap.fullstackjava2022.modulo6.service.MovimientoService;

@Service
public class MovimientoServiceImpl implements MovimientoService {
	@Autowired
	MovimientoRepository movimientoRepository;

	public MovimientoServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Movimiento get(Integer id_movim) {
		return movimientoRepository.findByIdMovim(id_movim).get();
	}

	@Override
	public Movimiento insert(Movimiento movimiento) {
		return movimientoRepository.save(movimiento);
	}

	@Override
	public int delete(Integer id_movim) {
		int vret = 0;

		try {
			movimientoRepository.delete(new Movimiento(id_movim, null, null, null, null, null, null, null));
			vret = 1;
		} catch (Exception e) {
			e.printStackTrace();
			vret = 0;
		}

		return vret;
	}

	@Override
	public List<Movimiento> list() {
		return movimientoRepository.findAll();

	}

	@Override
	public Movimiento update(Movimiento movimiento) {
		return movimientoRepository.save(movimiento);
	}

	@Override
	public List<Movimiento> listOrderByidMovim() {
		// TODO Auto-generated method stub
		return null;
	}

}
