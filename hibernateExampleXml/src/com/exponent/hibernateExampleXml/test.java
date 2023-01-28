package com.exponent.hibernateExampleXml;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Scanner sc = new Scanner(System.in);

		System.out.println("How many users do you want to add?");
		int totalUsers = sc.nextInt();

		for (int i = 0; i < totalUsers; i++) {
			Student student = new Student();
			System.out.println("enter student ID");
			student.setId(sc.nextInt());
			
			System.out.println("Enter student name");
			student.setsName(sc.next());
			
			System.out.println("Enter student address");
			student.setAddress(sc.next());

			Session session = sf.openSession();
			session.save(student);
			session.beginTransaction().commit();
		}
		System.out.println("users added successfully");
	}
}
