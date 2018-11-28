package pe.edu.upeu.jdbc.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.jdbc.dao.OrdenTrabajoDao;
import pe.edu.upeu.jdbc.entity.OrdenTrabajo;

@Repository
public class OrdenTrabajoDaoImp implements OrdenTrabajoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(OrdenTrabajo r) {
		String sql = "{call SP_REGISTAROT (?,?)}";
		return jdbcTemplate.update(sql, r.getIdop(), r.getIdusuario());
	}

	@Override
	public int update(OrdenTrabajo r) {
		return 0;
	}

	@Override
	public int delete(int id) {
		return 0;
	}

	@Override
	public int deletePro(int id) {
		return 0;
	}

	@Override
	public OrdenTrabajo read(int id) {
		return null;
	}

	@Override
	public List<Map<String, Object>> readAllop() {
		return null;
	}

}
