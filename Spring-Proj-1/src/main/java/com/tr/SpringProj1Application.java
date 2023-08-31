package com.tr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tr.dao.Dao1;

@SpringBootApplication
public class SpringProj1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringProj1Application.class, args);
		Dao1 d1=ctx.getBean("dao",Dao1.class);
		d1.fun();
	}

}
