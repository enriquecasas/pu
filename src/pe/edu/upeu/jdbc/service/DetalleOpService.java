package pe.edu.upeu.jdbc.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.jdbc.entity.DetalleOp;

public interface DetalleOpService {
	void saveDetalleOp(DetalleOp d);

	List<Map<String, Object>> readAll(int id);

	int create(DetalleOp d);

	List<Map<String, Object>> read(int id);

	int delete(int id);
}
