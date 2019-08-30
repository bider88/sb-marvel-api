package com.marvel.sb.marvel.apirest.business;

import com.marvel.sb.marvel.apirest.models.entity.ResponseApi;

public interface ComicBusiness {
	ResponseApi getColaborators();
	
	ResponseApi getCharacters();
}
