package pe.edu.upeu.jdbc.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.jdbc.entity.Kardex;

public interface AlmacenService {

	int create(Kardex k);
	int update(Kardex k);
	int delete(int id);
	Kardex read(int id);
	List<Map<String, Object>> readAll(int id);
	List<Map<String, Object>> readAll2();


}


