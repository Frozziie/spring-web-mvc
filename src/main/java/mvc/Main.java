package mvc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import mvc.model.Director;

public class Main {

	public static void main(String[] args) {
		
		/* Object creation via bean definition in XML configuration file */ 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Director empleado = context.getBean("empleado", Director.class);
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		System.out.println("Email: " + empleado.getEmail());
		System.out.println("Empresa: " + empleado.getEmpresa());
		
		/*
		Secretario secretario = context.getBean("secretario", Secretario.class);
		System.out.println(secretario.getTareas());
		System.out.println(secretario.getInforme());
		System.out.println("Email: " + secretario.getEmail());
		System.out.println("Empresa: " + secretario.getEmpresa());
		*/
		
		context.close();
		
	}

}
