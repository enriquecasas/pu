package pe.edu.upeu.jdbc.entity;

public class DetalleOt {
	private int iddetalleot;
	private int idhd;
	private int iddetallerp;
	private int idot;
	private double cantidad;
	private int empaque;
	private int kilo;
	private int estado;
	private int idproducto;

	public DetalleOt() {
		super();
	}

	public DetalleOt(int idot, double cantidad, int idproducto) {
		super();
		this.idot = idot;
		this.cantidad = cantidad;
		this.idproducto = idproducto;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public int getIddetalleot() {
		return iddetalleot;
	}

	public void setIddetalleot(int iddetalleot) {
		this.iddetalleot = iddetalleot;
	}

	public int getIdhd() {
		return idhd;
	}

	public void setIdhd(int idhd) {
		this.idhd = idhd;
	}

	public int getIddetallerp() {
		return iddetallerp;
	}

	public void setIddetallerp(int iddetallerp) {
		this.iddetallerp = iddetallerp;
	}

	public int getIdot() {
		return idot;
	}

	public void setIdot(int idot) {
		this.idot = idot;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public int getEmpaque() {
		return empaque;
	}

	public void setEmpaque(int empaque) {
		this.empaque = empaque;
	}

	public int getKilo() {
		return kilo;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
