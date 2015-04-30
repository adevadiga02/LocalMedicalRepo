package com.local.medical.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.local.medical.entity.User;

@Repository
public class LocalMedicalDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	//GET A VALUE OF ANY TABLE BASED ON PRIMARY KEY
	@Transactional
	 public <E> E get(Class<E> classname, Serializable pk)
	 {
		 
				E e = (E)entityManager.find(classname, pk); //select based on primary keyt pk
				return e;
	 }
	 
	
	//GET ALL RECORDS OF ANY TABLE
	 @Transactional
	 public <E> List<E> getAll(Class<E> classname)
		{
			
				
				String jsql = "Select o from "+classname.getName()+" as o";
				Query query = entityManager.createQuery(jsql);
				List<E> list = query.getResultList();
				return list;
		}
	 
	 //Authenticate user
	 @Transactional
	 public List<User> authUser(String name)
		{		
		 	//String hql = "Select o from User as o where o.name='"+name+"'";
			//Query query = entityManager.createQuery(hql);
			//List<User> list = query.getResultList();
		 
			 List<User> list = new ArrayList<User>();
			 User u = new User();
			 u.setId(1);
			 list.add(u);
			 
			return list;
		}
	 
	
}
