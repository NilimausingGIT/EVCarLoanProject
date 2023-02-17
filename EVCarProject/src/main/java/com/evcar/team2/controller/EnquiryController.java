package com.evcar.team2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.evcar.team2.model.EnquiryDetails;

import com.evcar.team2.serviceInterface.SerEnquiryDetails;
//@CrossOrigin("*")
@RestController
public class EnquiryController {

	@Autowired
	SerEnquiryDetails serviceenq;
	
	@Autowired
	public JavaMailSender jms;
	
	
	@PostMapping("/enqlist")
	public Iterable<EnquiryDetails> enqlist(@RequestBody Iterable<EnquiryDetails> ed)
	{
		Iterable<EnquiryDetails> listenq=serviceenq.savelist(ed);
		return listenq;
		
	}
	
	@GetMapping("/getenqlist")
	public Iterable<EnquiryDetails> getlist()
	{
		return serviceenq.getAllList();
	}
	
    @GetMapping("/getbyId/{eId}")
	public Optional<EnquiryDetails> getbyid(@PathVariable ("eId") int enqid)
	{
		return serviceenq.getById(enqid);
	}
	
    @PostMapping("/savedata")
    public String cibilcheck(@RequestBody  EnquiryDetails edd)
    {
    	//EnquiryDetails ed= serviceenq.enquiry(eId);
    	//EnquiryDetails edetail=new EnquiryDetails();
    	int cibilscore=edd.getCibilscore();
    	if(cibilscore>700)
    	{
    		EnquiryDetails ee=serviceenq.savedataenq(edd);
    		
    		
    		SimpleMailMessage m=new SimpleMailMessage();
    		m.setTo(edd.getEmail());
    		m.setSubject("CIBIL check");
    		m.setText("Your Application form has been approved for loan");

    		jms.send(m);
    	}
    	else 
    		{
    		EnquiryDetails ee1=serviceenq.savedataenquiry(edd);

    		SimpleMailMessage m=new SimpleMailMessage();
    		m.setTo(ee1.getEmail());
    		m.setSubject("CIBIL check");
    		m.setText("Your Application form has NOT been approved for loan");

    		jms.send(m);
    		}
		
    	
    	return "cibil score checked";
    }
}
