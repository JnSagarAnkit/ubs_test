/**
 * 
 */
package com.ubs.opsit.impl;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.utils.BerlinClockUtil;
import com.ubs.opsit.utils.Lamp;

/**
 * Second class convert the second unit of time
 * into the Berlin clock format for second.
 * 
 * @author Ankit
 * @version 1.0
 * @since 01-08-2018
 *
 */
public class Second implements TimeConverter {

	@Override
	public String convertTime(String aTime) {
		
		//Find the status of the Yellow lamp which blink on every 2 second
		int secondUnit = BerlinClockUtil.convertStringToInt(aTime);
		if ((secondUnit % 2)==0) {
			return Lamp.YELLOW.getStatus();
		}
		
		return Lamp.OFF.getStatus();
	}

}
