package com.loader.sw.ms.enums;

public enum SWAPI {

	URI_TEMPLATE("https://swapi.py4e.com/api/{resource}/{id}/");

	public final String value;
	
	private SWAPI(String value) {
		this.value = value;
	}
}
