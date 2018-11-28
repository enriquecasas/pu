package pe.edu.upeu.jdbc.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.jdbc.entity.OrdenTrabajo;

public interface OrdenTrabajoService {

	int create(OrdenTrabajo r);
	
	int update(OrdenTrabajo r);

	int delete(int id);

	int deletePro(int id);

	OrdenTrabajo read(int id);

	List<Map<String, Object>> readAllop();
	
	List<Map<String, Object>> getLast();

}
