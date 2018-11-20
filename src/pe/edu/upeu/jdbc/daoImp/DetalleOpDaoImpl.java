package pe.edu.upeu.jdbc.daoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.jdbc.dao.DetalleOpDao;
import pe.edu.upeu.jdbc.entity.DetalleOp;

@Repository
public class DetalleOpDaoImpl implements DetalleOpDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void saveDetalleOp(DetalleOp detalleOp) {
		jdbcTemplate.update("insert into detalle_op(idop, idproducto, cantidad) values(:idop, :idproducto, :cantidad)", new BeanPropertySqlParameterSource(detalleOp));		
	}

}
