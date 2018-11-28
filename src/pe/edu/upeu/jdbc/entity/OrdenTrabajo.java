package pe.edu.upeu.jdbc.entity;

public class OrdenTrabajo {

	private int idot;
	private int idop;
	private String fgeneracion;
	private String fentrega;
	private String codigo;
	private int estado;
	private int idusuario;

	public OrdenTrabajo() {
	}

	public OrdenTrabajo(int idop, int idusuario) {
		super();
		this.idop = idop;
		this.idusuario = idusuario;
	}

	public int getIdot() {
		return idot;
	}

	public void setIdot(int idot) {
		this.idot = idot;
	}

	public int getIdop() {
		return idop;
	}

	public void setIdop(int idop) {
		this.idop = idop;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

}
