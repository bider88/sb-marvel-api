package com.marvel.sb.marvel.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marvel.sb.marvel.apirest.models.entity.SuperHeroe;
import com.marvel.sb.marvel.apirest.models.services.SuperHeroeService;

@RestController
@RequestMapping("/api")
public class SuperHeroeController {
	
	@Autowired
	private SuperHeroeService superHeroeService;

	@GetMapping("/superheroes")
	public List<SuperHeroe> index() {
		return superHeroeService.findAll();
	}
	
}
