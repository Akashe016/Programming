package com.example.Form.service.impl;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Form.DAO.FormDAO;
import com.example.Form.entity.FormEntity;
import com.example.Form.repoistry.FormRepoistry;
import com.example.Form.service.FormService;

@Service
public class FormServiceImpl implements FormService {

	@Autowired
	FormRepoistry formRepoistry;
	
	
	@Override
	public String view() {
		
		return "view";
	}

	@Override
	public String add(FormDAO formdao) {
		
		FormEntity user = new FormEntity();
		user.setUserName(formdao.getUserName());
		user.setEmail(formdao.getEmail());
		user.setPassword(formdao.getPassword());
		user.setConfirm_password(formdao.getConfirm_password());
		
		if(user.getPassword().equals(user.getConfirm_password())) {
			
			formRepoistry.save(user);
			return "Insert Successfully";
		}
		
		else {
			
			return "Error, Please check the password";
		}
	}
}
