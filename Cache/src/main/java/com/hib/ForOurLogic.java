package com.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ForOurLogic {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		// cfg.configure("hibernate.cfg.xml");
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session1 = factory.openSession();
		// Object o = session1.load(Product.class, new Long(105));

		Object o = session1.get(Product.class, new Long(105));
		Product s = (Product) o;
		System.out.println("Loaded object product name is___" + s.getName());
		System.out.println("Object Loaded successfully.....!!");
		session1.close();

		System.out.println("------------------------------");
		System.out.println("Waiting......");

		try {
			Thread.sleep(6000);
		} catch (Exception e) {
		}

		System.out.println("6 seconds compelted......!!!!!!!!");

		Session session2 = factory.openSession();
		Object o2 = session2.load(Product.class, new Long(105));

		Product s2 = (Product) o2;
		System.out.println("Loaded object product name is___" + s2.getName());
		System.out.println("Object loaded from the database...!!");
		session2.close();

		Session session3 = factory.openSession();
		Object o3 = session3.load(Product.class, new Long(105));

		Product s3 = (Product) o3;
		System.out.println("Loaded object product name is___" + s3.getName());
		System.out
				.println("Object loaded from global cache successfully.....!!");
		session3.close();

		factory.close();
	}

}