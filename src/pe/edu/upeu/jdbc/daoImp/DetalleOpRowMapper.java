package pe.edu.upeu.jdbc.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.jdbc.entity.DetalleOp;

public class DetalleOpRowMapper implements RowMapper<DetalleOp>{

	@Override
	public DetalleOp mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		DetalleOp detop = new DetalleOp();
		detop.setIddetalleop(rs.getInt(1));
		detop.setIdop(rs.getInt(2));
		detop.setIdproducto(rs.getInt(3));
		detop.setObservacion(rs.getString(4));
		detop.setCantidad(rs.getInt(5));
		detop.setEstado(rs.getInt(6));
		return detop;
	}

}
