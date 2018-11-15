package pe.edu.upeu.jdbc.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.jdbc.entity.Usuario;

public class UsuarioRowMapper implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Usuario u = new Usuario();
		u.setIduser(rs.getInt("idusuario"));
		u.setNomuser(rs.getString("nom_user"));
		u.setClave(rs.getString("clave"));
		u.setEstado(rs.getString("estado"));
		return u;
	}

}
