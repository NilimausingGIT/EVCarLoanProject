package com.evcar.team2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evcar.team2.model.Cibil;

@Repository
public interface RepoCibil extends CrudRepository<Cibil, Integer>{

}
