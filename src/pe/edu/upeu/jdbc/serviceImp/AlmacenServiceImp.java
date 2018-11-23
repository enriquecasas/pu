package pe.edu.upeu.jdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.jdbc.dao.AlmacenDao;
import pe.edu.upeu.jdbc.entity.Kardex;
import pe.edu.upeu.jdbc.service.AlmacenService;
@Service
public class AlmacenServiceImp implements AlmacenService {
	@Autowired
    private AlmacenDao almacenDao;
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
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return almacenDao.readAll();
	}

}
