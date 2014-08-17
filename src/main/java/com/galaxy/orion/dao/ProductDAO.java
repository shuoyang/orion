package com.galaxy.orion.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.galaxy.orion.model.Product;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class ProductDAO {
	
	@Autowired private SessionFactory sessionFactory;
	   
	  @Transactional
	  public List<Product> findAll() {
	    Session session = sessionFactory.getCurrentSession();
	    List products = session.createQuery("from Product").list();
	    return products;
	  }

}
