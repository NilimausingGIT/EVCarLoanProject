package com.evcar.team2.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evcar.team2.model.EnquiryDetails;
import com.evcar.team2.repository.RepoEnquiryDetails;
import com.evcar.team2.serviceInterface.SerEnquiryDetails;

@Service
public class ImplEnquiryDetails implements SerEnquiryDetails{

	@Autowired
	RepoEnquiryDetails repoed;

	@Override
	public Iterable<EnquiryDetails> savelist(Iterable<EnquiryDetails> ed) {
		
		return repoed.saveAll(ed);
	}

	@Override
	public Iterable<EnquiryDetails> getAllList() {
		
		return repoed.findAll();
	}

	@Override
	public Optional<EnquiryDetails> getById(int enqid) {
		
		return repoed.findById(enqid);
	}

	

	@Override
	public EnquiryDetails savedataenq(EnquiryDetails edd) {
		return repoed.save(edd);
		
	}

	@Override
	public EnquiryDetails savedataenquiry(EnquiryDetails edd) {
		
		return repoed.save(edd);
	}


	
	
	
	
}
