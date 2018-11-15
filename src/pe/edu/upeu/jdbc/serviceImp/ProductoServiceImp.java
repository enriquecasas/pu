package pe.edu.upeu.jdbc.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.jdbc.dao.ProductoDao;
import pe.edu.upeu.jdbc.entity.Producto;
import pe.edu.upeu.jdbc.service.ProductoService;
@Service
public class ProductoServiceImp implements ProductoService {
	@Autowired
	private ProductoDao productoDao;
	@Override
	public int create(Producto u) {
		// TODO Auto-generated method stub
		return 0;
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
		return productoDao.readAll();
	}

}
