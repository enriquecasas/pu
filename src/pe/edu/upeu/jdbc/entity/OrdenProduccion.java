package pe.edu.upeu.jdbc.entity;

public class OrdenProduccion {

	private int idop;
	private int idusuario;
	private String codigo;
	private String fgeneracion;
	private String fentrega;
	private int estado;

	public OrdenProduccion() {
	}

	public OrdenProduccion(int idusuario, String fgeneracion, String fentrega) {
		super();
		this.idusuario = idusuario;
		this.fgeneracion = fgeneracion;
		this.fentrega = fentrega;
	}

	public int getIdop() {
		return idop;
	}

	public void setIdop(int idop) {
		this.idop = idop;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFgeneracion() {
		return fgeneracion;
	}

	public void setFgeneracion(String fgeneracion) {
		this.fgeneracion = fgeneracion;
	}

	public String getFentrega() {
		return fentrega;
	}

	public void setFentrega(String fentrega) {
		this.fentrega = fentrega;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
