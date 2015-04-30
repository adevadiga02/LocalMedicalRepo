package com.local.medical.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local.medical.dao.LocalMedicalDao;

@Service
public class LocalMedicalService {

	@Autowired
	private LocalMedicalDao localMedicalDao;
	
	public String authUser(String userName,String passWord){
		
		String returnValue="success";
		
		localMedicalDao.authUser(userName);
		
		return returnValue;
		
	}
	
}
