package cl.icap.fullstackjava2022.modulo6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.fullstackjava2022.modulo6.model.entity.Lote;
import cl.icap.fullstackjava2022.modulo6.model.repository.LoteRepository;

@Service
public class LoteServiceImpl implements LoteService {

	
	@Autowired
	LoteRepository loteRepository;
	
	public LoteServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Lote get(Integer id_invent) {
		return loteRepository.findByIdInvent(id_invent).get();
	}

	@Override
	public Lote insert(Lote lote) {
		return loteRepository.save(lote);
	}

	@Override
	public Lote update(Lote lote) {
		return loteRepository.save(lote);
	}

	@Override
	public List<Lote> list() {
		return loteRepository.findAll();
	}

	@Override
	public int delete(Integer id_invent) {
		int vret = 0;

		try {
			loteRepository.delete(new Lote(id_invent, null, null, null, null, null));
			vret = 1;
		} catch (Exception e) {
			e.printStackTrace();
			vret = 0;
		}

		return vret;
	}

}
