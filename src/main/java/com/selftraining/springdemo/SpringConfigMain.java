package com.selftraining.springdemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.selftraining.springdemo.models.User;

public class SpringConfigMain {

	public static void main(String[] args) {

		// load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		// retrieve bean

		// Add Logger Bean
		LoggerConfig logger = context.getBean("loggerConfig", LoggerConfig.class);

		User userObj = context.getBean("user", User.class);

		// Display Logger Bean Values
		System.out.println("rootLoggerLevel is :" + logger.getRootLoggerLevel() + " and printed Logger Level is :"
				+ logger.getPrintedLoggerLevel());

		// Display created Bean values

		System.out.println("User Address FlatNO :" + userObj.getAddress().getFlatNo() + " at Street "
				+ userObj.getAddress().getStreetName() + " NO# " + userObj.getAddress().getStreetNo());
		
		//Try Setter Injection with Autowired
		List<com.selftraining.springdemo.models.Permission> permissionList = userObj.getPermissionService().getUserPermissions();
		for(int i = 0 ; i < permissionList.size();i++)
		{
			
			System.out.println("User Permission ID: " + permissionList.get(i).getPermissionId()
					+" User Permission Name :"+permissionList.get(i).getPermissionName());
		}
		

		// close context
		context.close();

	}

}
