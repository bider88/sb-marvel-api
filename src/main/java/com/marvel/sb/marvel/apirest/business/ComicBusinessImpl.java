package com.marvel.sb.marvel.apirest.business;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComicBusinessImpl implements ComicBusiness {
	
	@Value("${api.key.public}")
	private String apiKey;

	@Override
	public Object getColaborators() {
		return apiKey;
	}

	@Override
	public Object getCharacters() {
		return null;
	}

}
