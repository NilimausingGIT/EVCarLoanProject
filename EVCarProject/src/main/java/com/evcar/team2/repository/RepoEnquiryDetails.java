package com.evcar.team2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evcar.team2.model.EnquiryDetails;

@Repository
public interface RepoEnquiryDetails extends CrudRepository<EnquiryDetails, Integer>{



}
