package cl.icap.fullstackjava2022.modulo6.model.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movimiento")
public class Movimiento {
	
	@Column(name = "id_movim")
	@Id
	private Integer idMovim;
	

	
	

	@Column(name = "id_invent")
	private Integer idInvent;
	
	@Column(name = "tipo_movim")
	private String tipoMovim;
	
	@Column(name = "cant_movida")
	private Integer cantMovida;
	
	@Column(name = "fecha_movim")
	private String fechaMovim;
	
	@Column(name = "id_rut")
	private String idRut;
	
	@Column(name = "ubic_origen")
	private String ubicOrigen;
	
	@Column(name = "ubic_destino")
	private String ubicDestino;
	
	public Movimiento() {
	}
		

	public Movimiento(Integer id_movim, Integer id_invent, String tipo_movim, Integer cant_movida, String fecha_movim, String id_rut, String ubic_origen, String ubic_destino) {
		this.idMovim = id_movim;
		this.idInvent = id_invent;
		this.tipoMovim = tipo_movim;
		this.cantMovida = cant_movida;
		this.fechaMovim = fecha_movim;
		this.idRut = id_rut;
		this.ubicOrigen = ubic_origen;
		this.ubicDestino = ubic_destino;
		
	}


	public Integer getId_movim() {
		return idMovim;
	}


	public void setId_movim(Integer id_movim) {
		this.idMovim = id_movim;
	}


	public Integer getIdinvent() {
		return idInvent;
	}


	public void setIdinvent(Integer idinvent) {
		this.idInvent = idinvent;
	}


	public String getTipomovim() {
		return tipoMovim;
	}


	public void setTipomovim(String tipomovim) {
		this.tipoMovim = tipomovim;
	}


	public Integer getCantmovida() {
		return cantMovida;
	}


	public void setCantmovida(Integer cantmovida) {
		this.cantMovida = cantmovida;
	}


	public String getFechamovim() {
		return fechaMovim;
	}


	public void setFechamovim(String fechamovim) {
		this.fechaMovim = fechamovim;
	}


	public String getIdrut() {
		return idRut;
	}


	public void setIdrut(String idrut) {
		this.idRut = idrut;
	}


	public String getUbicorigen() {
		return ubicOrigen;
	}


	public void setUbicorigen(String ubicorigen) {
		this.ubicOrigen = ubicorigen;
	}


	public String getUbicdestino() {
		return ubicDestino;
	}


	public void setUbicdestino(String ubicdestino) {
		this.ubicDestino = ubicdestino;
	}

	
	
}
