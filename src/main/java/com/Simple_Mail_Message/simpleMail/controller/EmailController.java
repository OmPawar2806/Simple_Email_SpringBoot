package com.Simple_Mail_Message.simpleMail.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Simple_Mail_Message.simpleMail.entity.Email;
import com.Simple_Mail_Message.simpleMail.service.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {
	
	@Autowired
	EmailService service;
	//create account 
	@PostMapping("/create")
	public Email createEmail(@RequestBody Email email) {
		Email createEmail =  service.createEmail(email);
		
		return createEmail;
	}
	
//	//display decrypted detail
//	@GetMapping("/{id}")
//	public ResponseEntity<service> showDetail(@PathVariable) {
//		Email showDetail = service.showDetail(email);
//		
//		return showDetail;
//	}
}
