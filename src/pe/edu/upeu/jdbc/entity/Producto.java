package pe.edu.upeu.jdbc.entity;

public class Producto {

	private int idproducto;
	private int idcategoria;
	private int idpesentacion;
	private String codigo;
	private String nombre;
	private int estado;
	private int tipo;
	
	public Producto() {
		super();
	}

	public Producto(int idproducto, String codigo, String nombre) {
		super();
		this.idproducto = idproducto;
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Producto(int idproducto, int idcategoria, int idpesentacion, String codigo, String nombre, int estado,
			int tipo) {
		super();
		this.idproducto = idproducto;
		this.idcategoria = idcategoria;
		this.idpesentacion = idpesentacion;
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
		this.tipo = tipo;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public int getIdpesentacion() {
		return idpesentacion;
	}

	public void setIdpesentacion(int idpesentacion) {
		this.idpesentacion = idpesentacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
