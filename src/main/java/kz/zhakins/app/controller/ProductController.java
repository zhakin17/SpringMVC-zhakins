package kz.zhakins.app.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestAttributes;

import kz.zhakins.app.model.Product;
import kz.zhakins.app.services.ProductService;

@Controller
public class ProductController {
	
	@Resource(name = "productService")
	private ProductService productService;
	
	@RequestMapping(value="/", method=RequestMethod.GET) 
	public String homeProduct(Model model){
		
		List<Product> result = productService.getProductByName("");
		
		//Product pr= productService.getProductByID(1L);
		
		model.addAttribute("products",result);
		
		return "home";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addProduct(Model model){
		
		model.addAttribute("productAttribute", new Product());
		return "/jsp/insPage";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String insProduct(@ModelAttribute ("productAttribute") Product product, Model model){
		
		if (productService.insProduct(product)) {
			model.addAttribute("productAttribute", new Product());
		}
		return "/jsp/insPage";
	}
}
