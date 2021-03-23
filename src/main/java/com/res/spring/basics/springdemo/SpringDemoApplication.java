package com.res.spring.basics.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	// Key Q's that the Spring framework needs to know....
	// what are the beans?
	// what are the dependencies of a bean?
	// where to search for beans?

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		int result = binarySearch.binarySearch(new int[] {2, 6, 3, 4},3);

		System.out.println("Result is " + result);

		//SpringApplication.run(SpringDemoApplication.class, args);
	}

}
