package com.evcar.team2.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.evcar.team2.model.EnquiryDetails;

public interface SerEnquiryDetails {

public	Iterable<EnquiryDetails> savelist(Iterable<EnquiryDetails> ed);

public Iterable<EnquiryDetails> getAllList();

public Optional<EnquiryDetails> getById(int enqid);

public EnquiryDetails savedataenq(EnquiryDetails edd);

public EnquiryDetails savedataenquiry(EnquiryDetails edd);



}
