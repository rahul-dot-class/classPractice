package com.projectcreatepractive.createpractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class CreatepracticeApplication {

	public static void main(String[] args)
			throws Exception {
		Class c = Class.forName("com.projectcreatepractive.createpractice.Point");
		System.err.println(c.getName());

		Object o = c.newInstance();
		System.err.println(o);
		// Point p = new Point();

		Constructor con = c.getConstructor(new Class[] { int.class, int.class });

		Object o2 = con.newInstance(new Object[] { 10, 20 });

		System.err.println(o2);

		Method m = c.getMethod("setX", new Class[] { int.class });
		m.invoke(o2, new Object[] { 3000 });

		System.err.println(o2);

		Method m2 = c.getMethod("setY", new Class[] { int.class });
		m2.invoke(o2, new Object[] { 45 });

		System.err.println(o2);
		// SpringApplication.run(CreatepracticeApplication.class, args);
	}

}
