package pe.edu.upeu.jdbc.daoImp;

import java.util.List;
import java.util.Map;

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

	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "{call SP_REGISTARDETOP(?,?,?,?)}";
		return jdbcTemplate.queryForList("Select * from detalle_op");
	}

	@Override
	public int create(DetalleOp d) {
		String sql = "{call SP_REGISTARDETOP(?,?,?,?)}";
		return jdbcTemplate.update(sql, d.getIdop(), d.getIdproducto(), "PRODUCCION", d.getCantidad());
	}

}
