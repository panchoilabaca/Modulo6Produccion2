package cl.icap.fullstackjava2022.modulo6.service;

import java.util.List;

import cl.icap.fullstackjava2022.modulo6.model.entity.Lote;


public interface LoteService {

	public Lote get(Integer idMovim);
	public  Lote insert( Lote lote);
	public  Lote update( Lote lote);
	public List< Lote> list();
	public int delete(Integer idInvent);
	
}