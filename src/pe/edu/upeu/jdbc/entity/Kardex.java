package pe.edu.upeu.jdbc.entity;

public class Kardex {
	private int idkardex;
	private int idusuario;
	private int idproducto;
	private String codigo;
	private String descripcion;
	private double stock_min;
	private double stock_max;
	private double stock;
	private int estado;
	private int idunidadmedida;
	private String fecha;
	
	public Kardex() {
		super();
	}
	

	public Kardex(int idkardex, int idusuario, int idproducto) {
		super();
		this.idkardex = idkardex;
		this.idusuario = idusuario;
		this.idproducto = idproducto;
	}


	public Kardex(int idkardex, int idusuario, int idproducto, String codigo, String descripcion, double stock_min,
			double stock_max, double stock, int estado, int idunidadmedida, String fecha) {
		super();
		this.idkardex = idkardex;
		this.idusuario = idusuario;
		this.idproducto = idproducto;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.stock_min = stock_min;
		this.stock_max = stock_max;
		this.stock = stock;
		this.estado = estado;
		this.idunidadmedida = idunidadmedida;
		this.fecha = fecha;
	}

	public int getIdkardex() {
		return idkardex;
	}

	public void setIdkardex(int idkardex) {
		this.idkardex = idkardex;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getStock_min() {
		return stock_min;
	}

	public void setStock_min(double stock_min) {
		this.stock_min = stock_min;
	}

	public double getStock_max() {
		return stock_max;
	}

	public void setStock_max(double stock_max) {
		this.stock_max = stock_max;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getIdunidadmedida() {
		return idunidadmedida;
	}

	public void setIdunidadmedida(int idunidadmedida) {
		this.idunidadmedida = idunidadmedida;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
