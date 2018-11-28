package pe.edu.upeu.jdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.jdbc.dao.OrdenTrabajoDao;
import pe.edu.upeu.jdbc.entity.OrdenTrabajo;
import pe.edu.upeu.jdbc.service.OrdenTrabajoService;
@Service
public class OrdenTrabajoServiceImp implements OrdenTrabajoService {
	@Autowired
	private OrdenTrabajoDao ordenTrabajoDao;

	@Override
	public int create(OrdenTrabajo r) {
		return ordenTrabajoDao.create(r);
	}

	@Override
	public int update(OrdenTrabajo r) {
		return ordenTrabajoDao.update(r);
	}

	@Override
	public int delete(int id) {
		return ordenTrabajoDao.delete(id);
	}

	@Override
	public int deletePro(int id) {
		return ordenTrabajoDao.deletePro(id);
	}

	@Override
	public OrdenTrabajo read(int id) {
		return ordenTrabajoDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAllop() {
		return ordenTrabajoDao.readAllop();
	}

	@Override
	public List<Map<String, Object>> getLast() {
		return ordenTrabajoDao.getLast();
	}

}
