//
// Called "Datentypen und Operatoren - Aufgaben.pdf" on Moodle
//

package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //
        // Exercise 1
        //
        calc_fahrenheit_from_celsius();

        //
        // Exercise 2
        //
        calc_foot_to_meter();
    }

    //
    // This function receives a temperature in celsius from the command line.
    // Then it will calculate the corresponding temperature in fahrenheit.
    //
    public static void calc_fahrenheit_from_celsius()
    {
        //
        // Create a new object called input derived from the Scanner class
        // with the Systems input stream (System.in) as the constructor parameter.
        //
        Scanner input = new Scanner(System.in);

        //
        // Print our message through the out interface of the system
        // right on the cmd.
        //
        System.out.print("Exercise 1 - Enter a temperature in celsius: ");

        //
        // This just checks if there is a double that we can get.
        // If not then just abort.
        //
        if(!input.hasNextDouble())
        {
            System.out.print("\nExercise 1 - You didn't enter a number!");
            return;
        }

        //
        // Retrieve the number as a double.
        // I am using var and not double since I am kind of lazy.
        //
        var celsius = input.nextDouble();

        //
        // To calculate fahrenheit we have to take our temperature in fahrenheit
        // multiply it by 1.8 and then add 32. Yes, this is real.
        // America... why?
        //
        var fahrenheit = (9.0 / 5.0) * celsius + 32;

        //
        // Now we can just print our results.
        //
        System.out.printf("Exercise 1 - %.2f°C is %.2f°F\n", celsius, fahrenheit);
    }

    //
    // This program reads a double just like the preceding one.
    // But now we get a distance in feet and convert that to a normal unit (meters).
    //
    private static void calc_foot_to_meter()
    {
        //
        // Create a new object called input derived from the Scanner class
        // with the Systems input stream (System.in) as the constructor parameter.
        //
        Scanner input = new Scanner(System.in);

        //
        // Print our message through the out interface of the system
        // right on the cmd.
        //
        System.out.print("Exercise 2 - Enter a distance in feet: ");

        //
        // This just checks if there is a double that we can get.
        // If not then just abort.
        //
        if(!input.hasNextDouble())
        {
            System.out.print("\nExercise 2 - You didn't enter a number!");
            return;
        }

        //
        // Retrieve the number as a double.
        // I am using var and not double since I am kind of lazy.
        //
        var feet = input.nextDouble();

        //
        // To calculate meters we have to take our distance in feet
        // and multiply it by 0.305.
        // America... why (again)?
        //
        var meters = feet * 0.305;

        //
        // Now we can just print our results.
        //
        System.out.printf("Exercise 2 - %.2fft is %.2fm\n", feet, meters);
    }
}
