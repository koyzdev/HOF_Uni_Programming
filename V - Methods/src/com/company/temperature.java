//
// This "temperature" class is mainly for Exercise 3.
//

package com.company;

public class temperature
{
	//
	// This function takes a temperature in the celsius format
	// and converts it to fahrenheit which then gets returned
	// to the callee.
	//
	public static double celsius_to_fahrenheit(double celsius)
	{
		//
		// The formula to calculate fahrenheit from celsius is as following:
		// (x°C * 9 / 5) + 32
		// We don't need an extra variable as we can just inline it
		// into our return call.
		//
		return (9.0 / 5.0) * celsius + 32;
	}

	public static double fahrenheit_to_celsius(double fahrenheit)
	{
		//
		// The formula to calculate celsius from fahrenheit is as following:
		// (x°F - 32) * 5 / 9
		// We don't need an extra variable as we can just inline it
		// into our return call.
		//
		return (5.0 / 9.0) * (fahrenheit - 32);
	}
}
