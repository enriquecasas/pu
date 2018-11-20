package pe.edu.upeu.jdbc.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.jdbc.dao.OrdenProduccionDao;
import pe.edu.upeu.jdbc.entity.OrdenProduccion;

@Repository
public class OrdenProduccionDaoImp implements OrdenProduccionDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(OrdenProduccion r) {
		String sql = "{call SP_REGISTRAROP (?)}";
		return jdbcTemplate.update(sql, r.getIdusuario());
	}

	@Override
	public int update(OrdenProduccion r) {
		// TODO Auto-generated method stub
		return 0 ;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM ORDEN_PRODUCCION WHERE IDOP=?";
		return jdbcTemplate.update(sql,id);
	}

	@Override
	public OrdenProduccion read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAllop() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("Select * from orden_produccion");
	}

}
