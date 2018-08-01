/**
 * 
 */
package com.ubs.opsit.factory;

import com.ubs.opsit.impl.Hour;
import com.ubs.opsit.impl.Minute;
import com.ubs.opsit.impl.Second;
import com.ubs.opsit.interviews.TimeConverter;

/**
 * Class return the instances of the pass type
 * @author Ankit
 * @version 1.0
 * @since 01-08-2018
 *
 */
public class TimeConvertorFactory {

	/**
	 * Factory to create an instance of the type passed as an argument
	 * @param timeUnit This argument define the type of instance creation required.
	 * @return TimeConverter an instances of the pass type
	 */
	public static TimeConverter getConverter(String timeUnit){
		if(timeUnit == null){
			return null;
		}
		if(timeUnit.equalsIgnoreCase(FactoryConstants.HOUR.getTIME_UNIT())){
			return new Hour();
		}
		if(timeUnit.equalsIgnoreCase(FactoryConstants.MINUTE.getTIME_UNIT())){
			return new Minute();
		}
		if(timeUnit.equalsIgnoreCase(FactoryConstants.SECOND.getTIME_UNIT())){
			return new Second();
		}
	
		return null;
	}
	
}
