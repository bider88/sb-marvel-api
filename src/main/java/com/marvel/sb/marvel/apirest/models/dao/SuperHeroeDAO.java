package com.marvel.sb.marvel.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.marvel.sb.marvel.apirest.models.entity.SuperHeroe;

public interface SuperHeroeDAO extends CrudRepository<SuperHeroe, Long> {
	
}
