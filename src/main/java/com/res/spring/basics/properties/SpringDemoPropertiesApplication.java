package com.res.spring.basics.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringDemoPropertiesApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		try (AnnotationConfigApplicationContext appContext =
					new AnnotationConfigApplicationContext(SpringDemoPropertiesApplication.class))
		{
			SomeExternalService service = appContext.getBean(SomeExternalService.class);
			System.out.println(service.returnServiceURL());
		}
	}

}
