package mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Pantalon;
public class PantalonMain {
	public static void main(String args[]){
ApplicationContext context=new ClassPathXmlApplicationContext("Pantalon.xml");
		
		Pantalon usu=(Pantalon)context.getBean("pantalon");
		System.out.println(usu);
		
	}

}
