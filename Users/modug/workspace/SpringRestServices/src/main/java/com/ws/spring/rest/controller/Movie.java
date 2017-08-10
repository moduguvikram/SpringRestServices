/**
 * 
 */
package com.ws.spring.rest.controller;

/**
 * @author modug
 *
 */
public class Movie {

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
	
	/**
	 * 
	 */
	public Movie() {
		
	}

}
