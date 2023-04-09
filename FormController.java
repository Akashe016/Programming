package com.example.Form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.Form.DAO.FormDAO;
import com.example.Form.service.impl.FormServiceImpl;


@RestController
@RequestMapping("api")
@CrossOrigin
public class FormController {
	
	@Autowired
	public FormServiceImpl formServiceImpl;
	
	
	@GetMapping("/view")
	public String form() {
		
		return formServiceImpl.view();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody FormDAO formdao) {
		
		
		return formServiceImpl.add(formdao);
	}
	
}
