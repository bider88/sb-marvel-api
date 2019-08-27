package com.marvel.sb.marvel.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marvel.sb.marvel.apirest.models.dao.SuperHeroeDAO;
import com.marvel.sb.marvel.apirest.models.entity.SuperHeroe;

@Service
public class SuperHeroeServiceImpl implements SuperHeroeService {

	@Autowired
	private SuperHeroeDAO superHeroeDAO; 
	
	@Override
	@Transactional(readOnly = true)
	public List<SuperHeroe> findAll() {
		return (List<SuperHeroe>) superHeroeDAO.findAll();
	}

}
