package com.galaxy.orion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.galaxy.orion.dao.ProductDAO;
import com.galaxy.orion.model.Product;

@Controller
@RequestMapping("/")
public class ProductController {

	@Autowired private ProductDAO productDAO;
	   
	  @RequestMapping(method = RequestMethod.GET)
	  public String list(Model model) {
	    List<Product> products = productDAO.findAll();
	    model.addAttribute("products", products);
	    return "index";
	  }
}
