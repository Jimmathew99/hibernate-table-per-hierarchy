package storage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import bean.Contract_employee;
import bean.Employee;
import bean.Regular_employee;

public class StoreData {

	public static void main(String[] args) {
		StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata= new MetadataSources(registry).getMetadataBuilder().build();
		SessionFactory factory= metadata.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		Transaction t= session.beginTransaction();
		Employee e1= new Employee();
		e1.setName("Jim Mathew");
		
		Regular_employee e2= new Regular_employee();
		e2.setName("Anu Mathew");
		e2.setSalary(50000);
		e2.setBonus(6);
		
		Contract_employee e3= new Contract_employee();
		e3.setName("Jack Blick");
		e3.setPay_per_hour(1000);
		e3.setContract_duration("15 hours");
		
		session.persist(e1);
		session.persist(e2);
       session.persist(e3);	
       t.commit();
       session.close();
       System.out.println("success");
		
		
		

	}

}
