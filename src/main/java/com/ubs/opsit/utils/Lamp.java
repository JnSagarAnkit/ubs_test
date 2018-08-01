	/**
 * 
 */
package com.ubs.opsit.utils;

/**
 * Define the color of the lamp in the Berlin Clock
 * @author Ankit
 * @version 1.0
 * @since 01-08-2018
 *
 */
public enum Lamp {
	RED("R"),
	YELLOW("Y"),
	OFF("O");
	
	private final String status;
	
	private Lamp(String status){
		this.status = status;
	}
	
	public String getStatus(){
		return this.status;
	}

}
