package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		System.out.println("Learning Spring");

		// uSing XML
		ApplicationContext ac =

				new FileSystemXmlApplicationContext(
						"D://ClassPractice//demo1//src//main//java//com//example//demo1//one.xml");

		Point p1 = (Point) ac.getBean("pt1");

		System.out.println("x = " + p1.getX());

		System.out.println("y = " + p1.getY());

		Point conPt2 = (Point) ac.getBean("conPt1");
		System.err.println("conPt2 *** " + conPt2);

		// Using class
		ApplicationContext anno = new AnnotationConfigApplicationContext(Admin.class);
		Point p2 = (Point) anno.getBean("getPointObj");
		System.err.println("Point p2 " + p2);
		Point p3 = (Point) anno.getBean("getPointObj");
		System.err.println("Point p3 " + p3);
		// p3.setX(100);
		System.err.println("Point p2 again " + p2);
		if (p2 == p3) {
			System.err.println(" SAME ");
		} else {
			System.err.println("Not Same");
		}

		Point obj1 = (Point) anno.getBean("getPointObj");
		Point obj2 = (Point) anno.getBean("getPointObj2");

		System.err.println("obj1 " + obj1);
		System.err.println("obj2 " + obj2);
	}

}
