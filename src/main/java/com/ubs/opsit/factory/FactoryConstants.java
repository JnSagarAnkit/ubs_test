/**
 * 
 */
package com.ubs.opsit.factory;

/**
 * Helps to decide the type of instance needed from the factory using factory
 * design pattern
 * 
 * @author Ankit
 * @version 1.0
 * @since 01-08-2018
 */
public enum FactoryConstants {
	HOUR("Hour"), MINUTE("Minute"), SECOND("Second");

	private final String TIME_UNIT;

	private FactoryConstants(String clock) {
		this.TIME_UNIT = clock;
	}

	public String getTIME_UNIT() {
		return TIME_UNIT;
	}

}
