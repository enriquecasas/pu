package pe.edu.upeu.jdbc.entity;

public class Almacen {
	private int idalmacen;
	private String nombre;
	private String abreviado;
	private double estado;
	public Almacen() {
		super();
	}
	public Almacen(int idalmacen, String nombre, String abreviado, double estado) {
		super();
		this.idalmacen = idalmacen;
		this.nombre = nombre;
		this.abreviado = abreviado;
		this.estado = estado;
	}
	public int getIdalmacen() {
		return idalmacen;
	}
	public void setIdalmacen(int idalmacen) {
		this.idalmacen = idalmacen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAbreviado() {
		return abreviado;
	}
	public void setAbreviado(String abreviado) {
		this.abreviado = abreviado;
	}
	public double getEstado() {
		return estado;
	}
	public void setEstado(double estado) {
		this.estado = estado;
	}

}
