package pe.edu.upeu.jdbc.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.jdbc.entity.OrdenProduccion;

public interface OrdenProduccionService {
	int create(OrdenProduccion r);
	int update(OrdenProduccion r);
	int delete(int id);
	OrdenProduccion read(int id);
	List<Map<String, Object>> readAllop();
	List<Map<String, Object>> getLast();
}
