package pe.edu.upeu.jdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.jdbc.dao.OrdenProduccionDao;
import pe.edu.upeu.jdbc.entity.OrdenProduccion;
import pe.edu.upeu.jdbc.service.OrdenProduccionService;

@Service
public class OrdenProduccionServiceImp implements OrdenProduccionService {
	@Autowired
	private OrdenProduccionDao ordenProduccionDao;

	@Override
	public int create(OrdenProduccion r) {
		return ordenProduccionDao.create(r);
	}

	@Override
	public int update(OrdenProduccion r) {
		return 0;
	}

	@Override
	public int delete(int id) {
		return ordenProduccionDao.delete(id);
	}

	@Override
	public OrdenProduccion read(int id) {
		return ordenProduccionDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAllop() {
		return ordenProduccionDao.readAllop();
	}

	@Override
	public List<Map<String, Object>> getLast() {
		return ordenProduccionDao.getLast();
	}

	@Override
	public int deletePro(int id) {
		return ordenProduccionDao.deletePro(id);
	}

}
