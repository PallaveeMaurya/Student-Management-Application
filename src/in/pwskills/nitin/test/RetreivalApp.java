package in.pwskills.nitin.test;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import in.pwskills.nitin.entity.Person;


public class RetreivalApp {

	public static void main(String[] args) throws IOException {
		 

		SessionFactory sessionFactory= new Configuration().configure().addAnnotatedClass(Person.class).buildSessionFactory();
		
		Session session= sessionFactory.openSession();
		
		Person person=session.get(Person.class, 10);
		System.out.println("PID :: " +person.getPid());
		System.out.println("PNAME :: " +person.getPname());
		System.out.println("PCOST :: " +person.getCost());
		 
		byte[] img=person.getPimg();
		FileOutputStream fos= new FileOutputStream("Asakshi.jpg");
		fos.write(img);
		fos.flush();
		
		char[] stdInfo= person.getStdInfo();
		FileWriter writer=new FileWriter("Asakshi.txt");
		writer.write(stdInfo);
		writer.flush();
		
		session.close();
		fos.close();
		writer.close();
		System.out.println("Application is stopping");
	}

}
