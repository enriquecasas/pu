package pe.edu.upeu.jdbc.test;

import java.sql.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upeu.jdbc.dao.OrdenProduccionDao;
import pe.edu.upeu.jdbc.daoImp.OrdenProduccionDaoImp;
import pe.edu.upeu.jdbc.entity.OrdenProduccion;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/root-context.xml");
		//System.out.println(context);
		OrdenProduccionDao dao = (OrdenProduccionDao)context.getBean("ordenProduccionDao", OrdenProduccionDaoImp.class);
		java.util.Date fecha = new java.util.Date();
		Date da = new Date(fecha.getTime());
		
		OrdenProduccion ordenProduccion = new OrdenProduccion();
		ordenProduccion.setIdusuario(1);
		//ordenProduccion.setFentrega(da);
		ordenProduccion.setEstado(1);
		dao.create(ordenProduccion);
		context.close();
	}

}
