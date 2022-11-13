package com.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();

		/*
		 * Student student1 = new Student(); student1.setName("Ajay");
		 * student1.setCity("Pune"); student1.setPincode(411001);
		 * 
		 * Student student2 = new Student(); student2.setName("Rohit");
		 * student2.setPincode(456645); student2.setCity("Mumbai");
		 * 
		 * session.save(student1); session.save(student2);
		 * 
		 * ts.commit(); System.out.println("records inserted successfully..");
		 */

		// update Ajay from students table

		/*
		 * Student student = session.get(Student.class, 1);
		 * 
		 * student.setCity("Nashik"); student.setPincode(411222);
		 * 
		 * session.update(student); ts.commit();
		 * System.out.println("updated successfully..");
		 */

		// delete Rohit from students table

		/*
		 * Student student = session.get(Student.class, 2); session.delete(student);
		 * ts.commit(); System.out.println("deleted successfully..");
		 */

		// fetch all the records from students

		Query query = session.createQuery("from Student");
		List<Student> list = query.list();

		for (Student s : list) {
			System.out.println("id>>" + s.getId());
			System.out.println("name>>" + s.getName());
			System.out.println("city>>" + s.getCity());
			System.out.println("pincode>>" + s.getPincode());
			System.out.println("Hello..");
		}

	}

}
