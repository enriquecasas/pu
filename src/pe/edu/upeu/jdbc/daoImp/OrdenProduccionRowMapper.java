package pe.edu.upeu.jdbc.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.jdbc.entity.OrdenProduccion;

public class OrdenProduccionRowMapper implements RowMapper<OrdenProduccion>{

	@Override
	public OrdenProduccion mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrdenProduccion op = new OrdenProduccion();
		op.setIdop(rs.getInt(1));
		op.setIdusuario(rs.getInt(2));
		op.setCodigo(rs.getString(3));
		op.setFgeneracion(rs.getString(4));
		op.setFentrega(rs.getString(5));
		op.setEstado(rs.getInt(6));
		return op;
	}

}
