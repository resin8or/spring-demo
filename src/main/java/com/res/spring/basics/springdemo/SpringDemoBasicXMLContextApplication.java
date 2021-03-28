package com.res.spring.basics.springdemo;

import com.res.spring.basics.xmlcontext.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.res.spring.basics.springdemo")
public class SpringDemoBasicXMLContextApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringDemoBasicXMLContextApplication.class);

	// Key Q's that the Spring framework needs to know....
	// what are the beans? Used @Component
	// what are the dependencies of a bean? Used @AutoWired
	// where to search for beans? By default will search same pkg and subpkg as main

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		try (ClassPathXmlApplicationContext appContext =
					new ClassPathXmlApplicationContext("applicationcontext.xml"))
		{
			XMLPersonDAO personDAO = appContext.getBean(XMLPersonDAO.class);
			System.out.println(personDAO);
			System.out.println(personDAO.getXMLJdbcConnection());

			//logger.info("Loaded beans -> {}", appContext.getBeanDefinitionNames());
			//logger.info("Loaded beans -> {}", (Object) appContext.getBeanDefinitionNames());

			logger.info("Loaded Beans .....");
			for (String s : appContext.getBeanDefinitionNames()){
				logger.info("Bean -> " + s);
		}
		}
	}

}
