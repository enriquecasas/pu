package pe.edu.upeu.jdbc.dao;

import java.util.List;
import java.util.Map;
import pe.edu.upeu.jdbc.entity.Producto;

public interface ProductoDao {
	int create(Producto u);
	int update(Producto u);
	int delete(int id);
	Producto read(int id);
	List<Map<String, Object>> readAll();
}
