package cl.icap.fullstackjava2022.modulo6.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lote")
public class Lote {

	@Column(name = "id_invent")
	@Id
	private Integer idInvent;
	
	@Column(name = "lote")
	private String lote;
	
	@Column(name = "stock_cant")
	private Integer stockCant;
	
	@Column(name = "fecha_ingreso")
	private String fechaIngreso;
	
	@Column(name = "fecha_caducidad")
	private String fechaCaducidad;
	
	@Column(name = "id_prod")
	private Integer idProd;
	
	
	public Lote() {
		
	}


	public Lote(Integer id_invent, String lote, Integer stock_cant, String fecha_ingreso, String fecha_caducidad,
			Integer id_prod) {
		
		this.idInvent = id_invent;
		this.lote = lote;
		this.stockCant = stock_cant;
		this.fechaIngreso = fecha_ingreso;
		this.fechaCaducidad = fecha_caducidad;
		this.idProd = id_prod;
	}


	public Integer getIdInvent() {
		return idInvent;
	}


	public void setIdInvent(Integer idInvent) {
		this.idInvent = idInvent;
	}


	public String getLote() {
		return lote;
	}


	public void setLote(String lote) {
		this.lote = lote;
	}


	public Integer getStockCant() {
		return stockCant;
	}


	public void setStockCant(Integer stockCant) {
		this.stockCant = stockCant;
	}


	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public String getFechaCaducidad() {
		return fechaCaducidad;
	}


	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}


	public Integer getIdProd() {
		return idProd;
	}


	public void setIdProd(Integer idProd) {
		this.idProd = idProd;
	}


	
	

}
