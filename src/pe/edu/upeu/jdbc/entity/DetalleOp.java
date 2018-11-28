package pe.edu.upeu.jdbc.entity;

public class DetalleOp {
	private int iddetalleop;
	private int idop;
	private int idproducto;
	private String observacion;
	private double cantidad;
	private int estado;
	private boolean check;

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public int getIddetalleop() {
		return iddetalleop;
	}

	public void setIddetalleop(int iddetalleop) {
		this.iddetalleop = iddetalleop;
	}

	public int getIdop() {
		return idop;
	}

	public void setIdop(int idop) {
		this.idop = idop;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
