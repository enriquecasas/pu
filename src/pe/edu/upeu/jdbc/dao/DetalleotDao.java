package pe.edu.upeu.jdbc.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.jdbc.entity.DetalleOt;

public interface DetalleotDao {
	int create(DetalleOt u);
	int update(DetalleOt u);
	int delete(int id);
	DetalleOt read(int id);
	List<Map<String, Object>> readAll();


}
