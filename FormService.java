package com.example.Form.service;

import org.springframework.web.bind.annotation.RequestParam;

import com.example.Form.DAO.FormDAO;

public interface FormService {
	
	public String view();
	public String add(FormDAO formdao);

}
