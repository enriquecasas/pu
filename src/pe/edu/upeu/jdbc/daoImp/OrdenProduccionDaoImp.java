package pe.edu.upeu.jdbc.daoImp;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
		String sql = "{call SP_REGISTAROP (?)}";
		return jdbcTemplate.update(sql, r.getIdusuario());
	}

	@Override
	public int update(OrdenProduccion r) {
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("{call SP_ELMINARCASCADAOP(?)}", id);
	}

	@Override
	public OrdenProduccion read(int id) {
		String sql = "select * from orden_produccion where idop = ?";
		OrdenProduccion op = jdbcTemplate.queryForObject(sql, new OrdenProduccionRowMapper(), id);
		return op;
	}

	@Override
	public List<Map<String, Object>> readAllop() {
		return jdbcTemplate.queryForList("SELECT*FROM ORDEN_PRODUCCION");
	}

	@Override
	public List<Map<String, Object>> getLast() {
		// TODO Auto-generated method stub
		String sql = "select * from ORDEN_PRODUCCION  where IDOP = ( select max(IDOP) from ORDEN_PRODUCCION )";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public int deletePro(int id) {
		// TODO Auto-generated method stub
		System.out.println("aqui estas22");
		String sql = "DELETE FROM detalle_op WHERE iddetalleop=?";
		return jdbcTemplate.update(sql, id);
	}

}
