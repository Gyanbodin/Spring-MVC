package com.example.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Produto;

@Controller
public class Remedio{
	
 @Autowired	
 private CrudRepository crud;
	
     @GetMapping("/")
	 public String cadastro(){  	
	 return "/";
		
	                         }
     
	 @PostMapping("/")
	 public String salvar(Produto produto){
	 crud.save(produto);		
	 return "/";
	                                                              }
	
}
