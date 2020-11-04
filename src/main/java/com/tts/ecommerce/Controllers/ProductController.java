package com.tts.ecommerce.Controllers;

import java.util.List;

import com.tts.ecommerce.Models.Product;
import com.tts.ecommerce.Services.ProductService;
import com.tts.ecommerce.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
/**
 * ProductController
 */
public class ProductController {

    @Autowired
    private UserService userService;

    @Autowired 
    private ProductService productService;

    @GetMapping(value= {"/products", "/"})
    public String getProducts(Model model){
        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);
        return "main";
    }


}