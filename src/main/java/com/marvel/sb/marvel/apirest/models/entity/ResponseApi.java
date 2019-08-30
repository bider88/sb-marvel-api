package com.marvel.sb.marvel.apirest.models.entity;

import java.io.Serializable;

public class ResponseApi implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String copyright;
	private DataApi data;
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public DataApi getData() {
		return data;
	}
	public void setData(DataApi data) {
		this.data = data;
	}
}
