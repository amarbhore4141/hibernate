package com.exponent.hibernateExampleXml;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static final Logger LOGGER = LogManager.getLogger(Test.class);

	public static void main(String[] args) {
		LOGGER.info("Main method Start....!");
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Scanner sc = new Scanner(System.in);

		System.out.println("How many users do you want to add?");
		LOGGER.info("How many users do you want to add?");
		int totalUsers = sc.nextInt();

		for (int i = 0; i < totalUsers; i++) {
			Student student = new Student();
			//System.out.println("enter student ID");
			LOGGER.info("enter student ID");
			student.setId(sc.nextInt());

			//System.out.println("Enter student name");
			LOGGER.info("Enter student name");
			student.setsName(sc.next());

			//System.out.println("Enter student address");
			LOGGER.info("Enter student address");
			student.setAddress(sc.next());

		Session session = sf.openSession();
		session.save(student);
		session.beginTransaction().commit();
		}
		//System.out.println("users added successfully");
		LOGGER.debug("users added successfully");
		sc.close();
	}
}
