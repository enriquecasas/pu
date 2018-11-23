package pe.edu.upeu.jdbc.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.jdbc.entity.DetalleOp;

public interface DetalleOpDao {
	void saveDetalleOp(DetalleOp d);
	List<Map<String, Object>> readAll(int id);
	int create(DetalleOp d);
}
