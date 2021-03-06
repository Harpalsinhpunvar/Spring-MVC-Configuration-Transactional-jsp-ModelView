package com.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.ProductDao;
import com.model.Product;


@Controller
public class ProductController {

	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	//show add
	@RequestMapping("/addproduct")
	public String addProduct(Model model) {
		model.addAttribute("title", "Add Products");
		return "add";
	}
	
	//handler for add
	@RequestMapping(value="/handle-product", method=RequestMethod.POST)
	public String handleProduct( @ModelAttribute Product product) {
		
		this.productDao.createProduct(product);
		
		return "redirect:/read";
	}
	
	@RequestMapping("/read")
	public String getProduct(@ModelAttribute Product product, Model model) {
		model.addAttribute("product",this.productDao.getProducts());
		return "read";
		
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProducts(@ModelAttribute Product product,@PathVariable int id, Model model) {
		this.productDao.deleteProduct(id);
		return "redirect:/read";
		
	}
	
	@RequestMapping("/update/{id}")
	public String updateForm(@PathVariable int id, Model model) {
		model.addAttribute("product", this.productDao.getProduct(id));
		return "update";
	}

	
	
	
	
}
