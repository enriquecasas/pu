package pe.edu.upeu.jdbc.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.jdbc.entity.Usuario;

public interface UsuarioDao {
int create(Usuario u);
int update(Usuario u);
int delete(int id);
Usuario read(int id);
List<Map<String, Object>> readAll();
List<Map<String, Object>> validarUser(Usuario u);
}
