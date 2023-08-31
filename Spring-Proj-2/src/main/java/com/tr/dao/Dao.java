package com.tr.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tr.modelClass.EmpClass;
import com.tr.repoInter.CurdInter;

@Component("dao")
public class Dao {

	private static final String q="SELECT * FROM EMP";
	
	@Autowired
	private CurdInter ci;
	
	public void save(EmpClass ec) throws SQLException {
	    EmpClass ec1=ci.save(ec);
	    System.out.println(ec1.getId());
	}
}
