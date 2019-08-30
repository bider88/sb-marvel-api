package com.marvel.sb.marvel.apirest.models.entity;

import java.io.Serializable;
import java.util.List;

public class DataApi implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ResultApi> results;
	public List<ResultApi> getResults() {
		return results;
	}
	public void setResult(List<ResultApi> results) {
		this.results = results;
	}
}
