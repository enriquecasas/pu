package pe.edu.upeu.jdbc.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.jdbc.entity.OrdenTrabajo;

public class OrdenTrabajoRowMapper implements RowMapper<OrdenTrabajo> {

	@Override
	public OrdenTrabajo mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrdenTrabajo ot = new OrdenTrabajo();
		ot.setIdot(rs.getInt(1));
		ot.setIdop(rs.getInt(2));
		ot.setFgeneracion(rs.getString(3));
		ot.setFentrega(rs.getString(4));
		ot.setCodigo(rs.getString(5));
		ot.setEstado(rs.getInt(6));
		ot.setIdusuario(rs.getInt(7));
		return ot;
	}

}
