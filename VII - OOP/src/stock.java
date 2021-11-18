//
// This the 2nd exercise.
// We are supposed to create a new class called "stock".
// It needs 4 data fields (2 strings, 2 doubles), a constructor
// and a method called get_change_percent().
//

public class stock
{
	//
	// Constructor
	//

	//
	// This constructor takes 2 strings as parameters
	// it initializes the class variables with them.
	//
	public stock(String name, String symbol)
	{
		//
		// We need to refer to our class variables
		// with "this" as the parameters are named just like
		// the class' variables.
		//
		this.name = name;
		this.symbol = symbol;
	}

	//
	// Methods
	//

	//
	// This function returns the percentile change of
	// previous_closing_price and current_price.
	//
	public double get_change_percentage()
	{
		//
		// To calculate the percentile change
		// we have to first subtract the original price
		// from the new price.
		//
		var change = current_price - previous_closing_price;

		//
		// Then we need to divide it by the original price.
		//
		change /= previous_closing_price;

		//
		// And to get a percentage we have to multiply it
		// by 100.
		//
		change *= 100;

		//
		// Return the result.
		//
		return change;
	}

	//
	// Variables
	//
	private String name;
	private String symbol;

	private double previous_closing_price = 0.0;
	private double current_price = 0.0;
}
