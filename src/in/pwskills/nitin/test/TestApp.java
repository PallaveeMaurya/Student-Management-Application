package in.pwskills.nitin.test;

import java.io.FileInputStream;
import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import in.pwskills.nitin.entity.Person;
 

public class TestApp {
	public static void main(String[] args) throws IOException{
		 
		
		SessionFactory sessionFactory= new Configuration().configure().addAnnotatedClass(Person.class).buildSessionFactory();
		
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		 
		Person person = new Person();
		person.setPid(10);
		person.setPname("nitin");
		person.setCost(3500.0);
		
		FileInputStream fis=new FileInputStream("D:\\Pallavee'20\\WhatsApp Images\\Asakshi.jpg");
		byte[] imgArray= new byte[fis.available()];
		fis.read(imgArray);
		person.setPimg(imgArray);
		
		String info="Welcome to PWSKILLS, JAVA with DSA 1.0 in English";
		char[] charArray=info.toCharArray();
		person.setStdInfo(charArray);
		
		session.save(person);
		System.out.println("Record inserted successfully..");
		
		transaction.commit();
		session.close();
		fis.close();
		 
		System.out.println("Application is stopping...");
	}

}
