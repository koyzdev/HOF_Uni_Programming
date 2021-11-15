//
// Called "Einführung - Aufgaben.pdf" on Moodle
//

package com.company;

public class Main
{
    public static void main(String[] args)
    {
        //
        // Exercise 1
        //
        welcome_message();

        //
        // Exercise 2
        //
        calculate_subsequent_numbers();

        //
        // Exercise 3
        //
        calculate_math_formulas();
    }

    public static void welcome_message()
    {
        //
        // Simply prints "Willkommen in Java" five times on function call.
        // Output gets printed on the console.
        //
        for(int i = 0; i < 5; i++)
            System.out.print("Exercise 1 - Willkommen in Java\n");
    }

    //
    // This function resembles exercise two.
    // It adds all numbers from 1, 2, 3... 9 and displays the sum on the console.
    //
    public static void calculate_subsequent_numbers()
    {
        //
        // Sum can be an integer since we only use numbers without any decimals.
        //
        int sum = 0;

        //
        // We add each number onto sum via the += operator.
        // This basically is just a short form for -> sum = sum + i;
        //
        for(int i = 1; i < 10; i++)
            sum += i;

        //
        // Use the out interface to print on the console.
        //
        System.out.printf("Exercise 2 - Sum: %d\n", sum);
    }

    //
    // The goal of exercise three is to get the area and circumference
    // of a rectangle with a width of "5" and height of "12.65".
    //
    public static void calculate_math_formulas()
    {
        //
        // Initialize our two final variables as doubles,
        // as we are going to multiply numbers with decimals.
        //
        double area;
        double circumference;

        //
        // Initialize the diameters of the rectangle.
        //
        double width = 5.0;
        double height = 12.65;

        //
        // The mathematical formula to calculate the area for a rectangle
        // is A = a * b.
        //
        area = width * height;

        //
        // The mathematical formula to calculate the circumference for a rectangle
        // is C = 2 * (l + w).
        //
        circumference = 2 * (height + width);

        //
        // Use the out interface to print on the console.
        //
        System.out.printf("Exercise 3 - Area: %.2f | Circumference: %.2f\n", area, circumference);
    }
}
