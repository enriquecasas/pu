package pe.edu.upeu.jdbc.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.jdbc.dao.ProductoDao;
import pe.edu.upeu.jdbc.entity.Producto;
@Repository
public class ProductoDaoImp implements ProductoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Producto u) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call SP_INGRESAR_ROL(?)", u.getNombre());
	}

	@Override
	public int update(Producto u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		 return this.jdbcTemplate.queryForList("SELECT P.IDPRODUCTO idproducto,P.CODIGO codigo,P.NOMBRE nombre " + 
		 		"FROM KARDEX K, PRODUCTO P, ALMACEN A " + 
		 		"where P.IDPRODUCTO = K.IDPRODUCTO AND K.IDALMACEN = A.IDALMACEN AND A.IDALMACEN=4 ");
	}

}
