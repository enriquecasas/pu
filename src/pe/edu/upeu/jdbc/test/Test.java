package pe.edu.upeu.jdbc.test;

import java.sql.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upeu.jdbc.dao.OrdenTrabajoDao;
import pe.edu.upeu.jdbc.daoImp.OrdenTrabajoDaoImp;
import pe.edu.upeu.jdbc.entity.OrdenTrabajo;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/root-context.xml");
		System.out.println(context);
		OrdenTrabajoDao dao = (OrdenTrabajoDao)context.getBean("ordenTrabajoDao", OrdenTrabajoDaoImp.class);
		java.util.Date fecha = new java.util.Date();
		Date da = new Date(fecha.getTime());
		OrdenTrabajo ot = new OrdenTrabajo(160,21);
		dao.create(ot);
		context.close();
	}

}
