package com.res.spring.basics.springdemo;

import com.res.spring.basics.springdemo.basic.BinarySearchImpl;
import com.res.spring.basics.springdemo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoScopeApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringDemoScopeApplication.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		ApplicationContext appContext =
				SpringApplication.run(SpringDemoScopeApplication.class, args);

		PersonDAO personDAO = appContext.getBean(PersonDAO.class);

		PersonDAO personDAO1 = appContext.getBean(PersonDAO.class);

		logger.info("personDAO = [{}]", personDAO);
		logger.info("personDAO jdbc connection = [{}]", personDAO.getJdbcConnection());
		logger.info("personDAO1 = [{}]", personDAO1);
		logger.info("personDAO1 jdbc connection = [{}]", personDAO1.getJdbcConnection());

		// Spring Application Context will manage and provide access to all beans.

	}

}
