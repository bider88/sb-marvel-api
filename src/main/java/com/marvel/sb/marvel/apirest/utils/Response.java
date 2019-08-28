package com.marvel.sb.marvel.apirest.utils;

public class Response<T> {
	private Boolean ok;
	private T data;
	private String superheroe;
	public Boolean getOk() {
		return ok;
	}
	public void setOk(Boolean ok) {
		this.ok = ok;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getSuperheroe() {
		return superheroe;
	}
	public void setSuperheroe(String superheroe) {
		this.superheroe = superheroe;
	}
	
}
