package com.tr;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tr.dao.Dao;
import com.tr.modelClass.EmpClass;

@SpringBootApplication
public class SpringProj2Application {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx=SpringApplication.run(SpringProj2Application.class, args);
		Dao d=ctx.getBean("dao",Dao.class);
        EmpClass ec=new EmpClass();
        ec.setName("raghu");
        ec.setSurname("thalluri");
        d.save(ec);
		
	}

}
