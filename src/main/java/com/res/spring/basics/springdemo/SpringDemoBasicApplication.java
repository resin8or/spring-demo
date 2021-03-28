package com.res.spring.basics.springdemo;

import com.res.spring.basics.springdemo.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.res.spring.basics.springdemo")
public class SpringDemoBasicApplication {

	// Key Q's that the Spring framework needs to know....
	// what are the beans? Used @Component
	// what are the dependencies of a bean? Used @AutoWired
	// where to search for beans? By default will search same pkg and subpkg as main

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		try (AnnotationConfigApplicationContext appContext =
					new AnnotationConfigApplicationContext(SpringDemoBasicApplication.class))
		{
			BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);

			// Spring Application Context will manage and provide access to all beans.
			int result = binarySearch.binarySearch(new int[]{2, 6, 3, 4}, 3);

			System.out.println("Result is " + result);
			//AppCtx will be automatically closed with the new try construct in Java 7 +
			//This implements the autoclosable interface.
		}
	}

}
