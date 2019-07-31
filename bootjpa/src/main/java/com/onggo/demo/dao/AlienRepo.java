package com.onggo.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.onggo.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>
{
	
}
