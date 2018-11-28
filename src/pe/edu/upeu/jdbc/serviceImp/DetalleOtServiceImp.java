package pe.edu.upeu.jdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.jdbc.dao.DetalleotDao;
import pe.edu.upeu.jdbc.entity.DetalleOp;
import pe.edu.upeu.jdbc.service.DetalleOpService;

@Service
public class DetalleOtServiceImp implements DetalleOpService {
	@Autowired
	private DetalleotDao detalleotDao;

	@Override
	public void saveDetalleOp(DetalleOp d) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Map<String, Object>> readAll(int id) {
		// TODO Auto-generated method stub
		return detalleotDao.readAll();
	}

	@Override
	public int create(DetalleOp d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DetalleOp d) {
		// TODO Auto-generated method stub
		return 0;
	}

}
