package com.res.spring.basics.springdemo;

import com.res.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.res.spring.basics.componentscan")
public class SpringDemoComponentScanApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringDemoComponentScanApplication.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		ApplicationContext appContext =
				SpringApplication.run(SpringDemoComponentScanApplication.class, args);

		ComponentDAO componentDAO = appContext.getBean(ComponentDAO.class);

		logger.info("componentDAO = [{}]", componentDAO);

	}

}
