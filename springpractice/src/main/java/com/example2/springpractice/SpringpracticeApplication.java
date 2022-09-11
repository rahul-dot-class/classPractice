package com.example2.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class SpringpracticeApplication {
	public static void main(String[] args) {
		System.out.println("Learning BeanAutoWiring");

		ApplicationContext ac =

				new FileSystemXmlApplicationContext(
						"D://ClassPractice//springpractice//src//main//java//com//example2//springpractice//one.xml");

		Segment s1 = (Segment) ac.getBean("sg1");

		System.out.println("x1 = " + s1.getE1().getX());

		System.out.println("y1 = " + s1.getE1().getY());

		System.out.println("x2 = " + s1.getE2().getX());

		System.out.println("y2 = " + s1.getE2().getY());
	}
}
