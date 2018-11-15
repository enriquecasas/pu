package pe.edu.upeu.jdbc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upeu.jdbc.dao.OrdenProduccionDao;
import pe.edu.upeu.jdbc.daoImp.OrdenProduccionDaoImp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/root-context.xml");
		//System.out.println(context);
		OrdenProduccionDao dao = (OrdenProduccionDao)context.getBean("ordenProduccionDao", OrdenProduccionDaoImp.class);
		System.out.println(dao.readAllop());
		System.out.println(context);
		context.close();
	}

}
