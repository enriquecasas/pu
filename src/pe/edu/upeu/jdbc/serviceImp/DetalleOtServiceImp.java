package pe.edu.upeu.jdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.jdbc.dao.DetalleOpDao;
import pe.edu.upeu.jdbc.dao.DetalleotDao;
import pe.edu.upeu.jdbc.entity.DetalleOp;
import pe.edu.upeu.jdbc.entity.DetalleOt;
import pe.edu.upeu.jdbc.service.DetalleOtService;
@Service
public class DetalleOtServiceImp implements DetalleOtService {

	@Autowired private DetalleotDao detalleotDao;
	
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
		return detalleotDao.readAll();
	}




}
