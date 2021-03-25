package com.res.spring.basics.springdemo;

import com.res.spring.basics.springdemo.basic.BinarySearchImpl;
import com.res.spring.basics.springdemo.basic.QuickSortAlgorithm;
import com.res.spring.basics.springdemo.scope.PersonDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.res.spring.basics.springdemo")
public class SpringDemoScopeApplication {

	//private static Logger logger = LoggerFactory.getLogger(SpringDemoScopeApplication.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		ApplicationContext appContext =
				new AnnotationConfigApplicationContext(SpringDemoComponentScanApplication.class);

		PersonDAO personDAO = appContext.getBean(PersonDAO.class);

		PersonDAO personDAO1 = appContext.getBean(PersonDAO.class);

//		logger.info("personDAO = [{}]", personDAO);
//		logger.info("personDAO jdbc connection = [{}]", personDAO.getJdbcConnection());
//		logger.info("personDAO1 = [{}]", personDAO1);
//		logger.info("personDAO1 jdbc connection = [{}]", personDAO1.getJdbcConnection());

		// Spring Application Context will manage and provide access to all beans.

	}

}
