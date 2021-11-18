//
// This the 1st exercise.
// We are supposed to create a new class called "rectangle".
// It needs 2 data fields (doubles), a no-arg-constructor, another
// constructor that takes 2 parameters (doubles) and 2 methods
// called get_area() and get_perimeter().
//

public class rectangle
{
	//
	// Constructors
	//

	//
	// This is our no-arg-constructor.
	//
	public rectangle()
	{
		//
		// Since the default values are already set we don't
		// have to do anything in here.
		//
	}

	//
	// This constructor takes 2 variables as parameters
	// which will then initialize our class variables.
	//
	public rectangle(double width, double height)
	{
		//
		// We need to refer to our class variables
		// with "this" as the parameters are named just like
		// the class' variables.
		//
		this.width = width;
		this.height = height;
	}

	//
	// Methods
	//

	//
	// This method returns the area of our
	// rectangle by multiplying the width with
	// the height.
	//
	public double get_area()
	{
		return width * height;
	}

	//
	// The method returns the perimeter of our rectangle.
	// The formula to calculate a rectangles' perimeter
	// is 2(l + w), hence we multiply the sum of width and height
	// by 2.
	//
	public double get_perimeter()
	{
		return 2 * (width + height);
	}

	//
	// Variables
	//
	private double width = 1;
	private double height = 1;
}