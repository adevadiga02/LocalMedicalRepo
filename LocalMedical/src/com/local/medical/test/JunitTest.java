package com.local.medical.test;

import javax.persistence.Table;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.local.medical.dao.LocalMedicalDao;
import com.local.medical.entity.User;


public class JunitTest {
	
	@Autowired
	private LocalMedicalDao dao;
	
	@Test
	public void add()
	{	
		User user = new User();
		user.setId(1);
		
		dao.get(User.class,1);
		//Assert.assertEquals(true,true);
	}

}
