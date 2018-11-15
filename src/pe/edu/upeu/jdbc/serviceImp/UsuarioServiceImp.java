package pe.edu.upeu.jdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.jdbc.dao.UsuarioDao;
import pe.edu.upeu.jdbc.daoImp.UsuarioDaoImp;
import pe.edu.upeu.jdbc.entity.Usuario;
import pe.edu.upeu.jdbc.service.UsuarioService;
@Service
public class UsuarioServiceImp implements UsuarioService{
	@Autowired
    private UsuarioDao usuarioDao;
 	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.create(u);
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.delete(id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return usuarioDao.readAll();
	}

	@Override
	public List<Map<String, Object>> validaUser(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.validarUser(u);
	}

}
