package pe.edu.upeu.jdbc.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.jdbc.dao.DetalleOpDao;
import pe.edu.upeu.jdbc.entity.DetalleOp;
import pe.edu.upeu.jdbc.service.DetalleOpService;

@Service
public class DetalleOpServiceImpl implements DetalleOpService{
	
	@Autowired
	private DetalleOpDao detalleOpDao;

	@Override
	public void saveDetalleOp(DetalleOp detalleOp) {
		detalleOpDao.saveDetalleOp(detalleOp);
	}
	
	
}
