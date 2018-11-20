package pe.edu.upeu.jdbc.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.jdbc.entity.OrdenProduccion;


public interface OrdenProduccionDao {
	List<Map<String, Object>> getLast();
	int create(OrdenProduccion r);
	int update(OrdenProduccion r);
	int delete(int id);
	OrdenProduccion read(int id);
	List<Map<String, Object>> readAllop();
}
