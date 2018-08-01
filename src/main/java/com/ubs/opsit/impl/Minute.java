/**
 * 
 */
package com.ubs.opsit.impl;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.utils.BerlinClockUtil;
import com.ubs.opsit.utils.Constants;
import com.ubs.opsit.utils.Lamp;

/**
 * Responsible for minute representation in the Berlin clock
 * 
 * @author Ankit
 * @version 1.0
 * @since 01-08-2018
 *
 */
public class Minute implements TimeConverter {

	@Override
	public String convertTime(String aTime) {

		int minUnit = BerlinClockUtil.convertStringToInt(aTime);
		StringBuilder timeBuilder = new StringBuilder();

		// Finding the quotient and the remainder by dividing the minUnit by 5
		int quotient = minUnit / Constants.DIVISOR_FIVE;
		int remainder = minUnit % Constants.DIVISOR_FIVE;

		// Find the status(on/off) of 5 minute unit lamp along with the color
		// within the row of the lamp
		BerlinClockUtil.getLamps(timeBuilder, quotient,
				Constants.MIN_FIRST_ROW, Lamp.RED.getStatus(),
				Lamp.YELLOW.getStatus());
		timeBuilder.append("\r\n"); //Appending the carriage return and new line
		
		// Find the status(on/off) of 1 minute unit lamp within the row of the
		// lamp
		BerlinClockUtil.getLamps(timeBuilder, remainder,
				Constants.MIN_SECOND_ROW, Lamp.YELLOW.getStatus());
		
		return timeBuilder.toString();
	}

}
