package pe.edu.upeu.jdbc.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.jdbc.dao.AlmacenDao;
import pe.edu.upeu.jdbc.entity.Kardex;
@Repository
public class AlmacenDaoImp implements AlmacenDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	@Override
	public int create(Kardex k) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Kardex k) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Kardex read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll(int id) {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForList("SELECT "+ 
				" a.ABREVIADO," + 
				" p.CODIGO," + 
				" p.NOMBRE," + 
				" k.STOCK" + 
				" FROM KARDEX k,ALMACEN a,PRODUCTO p" + 
				" WHERE k.IDALMACEN = a.IDALMACEN and k.IDPRODUCTO = p.IDPRODUCTO and k.IDALMACEN="+id);
	}

}
