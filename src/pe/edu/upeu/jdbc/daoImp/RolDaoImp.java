package pe.edu.upeu.jdbc.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.jdbc.dao.RolDao;
import pe.edu.upeu.jdbc.entity.Rol;

public class RolDaoImp implements RolDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int create(Rol r) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call SP_INGRESAR_ROL(?)", r.getNomrol());
	}

	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call SP_MODIFICAR_ROL(?,?)", r.getIdrol(), r.getNomrol());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub SP_DELETE_ROL
		return jdbcTemplate.update("call SP_DELETE_ROL(?)", id);
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub

		 return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub	
		return jdbcTemplate.queryForList("Select *from rol");
	}

}
