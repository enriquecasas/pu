package pe.edu.upeu.jdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.jdbc.dao.DetalleOpDao;
import pe.edu.upeu.jdbc.entity.DetalleOp;
import pe.edu.upeu.jdbc.service.DetalleOpService;

@Service
public class DetalleOpServiceImpl implements DetalleOpService {

	@Autowired
	private DetalleOpDao detalleOpDao;

	@Override
	public void saveDetalleOp(DetalleOp detalleOp) {
		detalleOpDao.saveDetalleOp(detalleOp);
	}

	@Override
	public List<Map<String, Object>> readAll(int id) {
		return detalleOpDao.readAll(id);
	}

	@Override
	public int create(DetalleOp d) {
		return detalleOpDao.create(d);
	}

	@Override
	public List<Map<String, Object>> read(int id) {
		return detalleOpDao.read(id);
	}

	@Override
	public int delete(int id) {
		return detalleOpDao.delete(id);
	}

	@Override
	public int update(DetalleOp d) {
		return detalleOpDao.update(d);
	}

}
