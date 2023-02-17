package com.evcar.team2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evcar.team2.model.Ledger;

@Repository
public interface RepoLedger extends CrudRepository<Ledger, Integer>{

}
