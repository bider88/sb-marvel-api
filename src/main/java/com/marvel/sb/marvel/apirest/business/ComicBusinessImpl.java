package com.marvel.sb.marvel.apirest.business;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.marvel.sb.marvel.apirest.models.entity.ResponseApi;
import com.marvel.sb.marvel.apirest.utils.MD5;

@Component
public class ComicBusinessImpl implements ComicBusiness {
	
	@Value("${api.key.public}")
	private String apiKey;
	
	@Value("${api.key.private}")
	private String apiSecretKey;
	
	@Value("${api.url}")
	private String apiUrl;

	@Override
	public ResponseApi getColaborators() {
		RestTemplate restTemplate = new RestTemplate();
		String url = buildUrlWithMD5("creators");
		return restTemplate.getForObject(url, ResponseApi.class);
	}

	@Override
	public ResponseApi getCharacters() {
		RestTemplate restTemplate = new RestTemplate();
		String url = buildUrlWithMD5("characters");
		return restTemplate.getForObject(url, ResponseApi.class);
	}
	
	private String buildUrlWithMD5(String type) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		MD5 md5 = new MD5();
		String hash = timestamp.getTime() + apiSecretKey + apiKey;
		String url = apiUrl.concat(type).concat("?apikey=").concat(apiKey).concat("&ts=").concat(timestamp.getTime() + "").concat("&hash=").concat(md5.getHashKey(hash));
		return url;
	}
}
