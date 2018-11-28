package pe.edu.upeu.jdbc.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.jdbc.dao.DetalleotDao;
import pe.edu.upeu.jdbc.entity.DetalleOt;

public class DetalleOtDaoImp implements DetalleotDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int create(DetalleOt u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DetalleOt u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DetalleOt read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("SELECT " + 
				"D1.IDPRODUCTO," + 
				"P.NOMBRE, " + 
				"sum(D2.CANTIDAD) as total," + 
				"U.NOMBRE " + 
				"FROM DETALLE_RP D1, DETALLE_OT D2, PRODUCTO P,KARDEX K, ALMACEN A,UNIDAD_MEDIDA U " + 
				"WHERE D2.IDDETALLERP=D1.IDDETALLERP AND D1.IDPRODUCTO = P.IDPRODUCTO " + 
				"AND K.IDPRODUCTO = P.IDPRODUCTO AND K.IDALMACEN=A.IDALMACEN AND K.IDUNIDADMEDIDA=U.IDUNIDADMEDIDA AND D2.IDOT=3 " + 
				"group by D1.IDPRODUCTO," + 
				"P.NOMBRE, " + 
				"U.NOMBRE ");
	}

}
