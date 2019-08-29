package com.marvel.sb.marvel.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.marvel.sb.marvel.apirest.utils.Response;
import com.marvel.sb.marvel.apirest.business.ComicBusiness;
import com.marvel.sb.marvel.apirest.models.entity.SuperHeroe;
import com.marvel.sb.marvel.apirest.models.services.SuperHeroeService;

@CrossOrigin(origins = {"http://test.albo.mx"})
@RestController
@RequestMapping("/api")
public class SuperHeroeController {
	
	@Autowired
	private SuperHeroeService superHeroeService;
	
	@Autowired
	private ComicBusiness comicBusiness;

	@GetMapping("/superheroes")
	@ResponseBody
	public List<SuperHeroe> index() {
		return superHeroeService.findAll();
	}
	
	@RequestMapping(value = "/colaborators/{superheroe}", method = RequestMethod.GET, produces = {"application/JSON"})
	public ResponseEntity<Response<Object>> colaborators(@PathVariable String superheroe) {
		HttpHeaders headers = new HttpHeaders();
        headers.add("Responded", "colaborators endpoint");
        
        Response<Object> res = new Response<>();
        res.setOk(Boolean.TRUE);
        res.setData(comicBusiness.getColaborators());
        res.setSuperheroe(superheroe);
        
        return ResponseEntity.ok().headers(headers).body(res);
	}
	
	@RequestMapping(value = "/characters/{superheroe}", method = RequestMethod.GET, produces = {"application/JSON"})
	public ResponseEntity<Response<Object>> characters(@PathVariable String superheroe) {
		
		Response<Object> res = new Response<>();
        res.setOk(Boolean.TRUE);
        res.setData(comicBusiness.getCharacters());
        res.setSuperheroe(superheroe);
        
		return ResponseEntity.ok().body(res);
	}
	
}
