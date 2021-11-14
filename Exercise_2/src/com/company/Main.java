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

        //
        // Exercise 3
        //
        calc_tip();

        //
        // Exercise 4
        //
        calc_time();

        //
        // Exercise 5
        //
        calc_cylinder();

        //
        // Exercise 6
        //
        sum_number();

        //
        // Exercise 7
        //
        calc_interest();

        //
        // Exercise 8
        //
        calc_savings();
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

    //
    // This function reads two doubles.
    // First the amount to be paid and then the percentage for the tip.
    //
    private static void calc_tip()
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
        System.out.print("Exercise 3 - Enter an amount in euro and a tip percentage (Double Double): ");

        //
        // This just checks if there is a double that we can get.
        // If not then just abort.
        //
        if(!input.hasNextDouble())
        {
            System.out.print("\nExercise 3 - You didn't enter a number!");
            return;
        }

        //
        // The amount to be paid for e.g. a meal.
        //
        var amount = input.nextDouble();

        //
        // This just checks if there is a second double that we can get.
        // If not then just abort.
        //
        if(!input.hasNextDouble())
        {
            System.out.print("\nExercise 3 - You didn't enter a second number!");
            return;
        }

        //
        // The percentage to calculate what the e.g. waiter will get.
        //
        var percentage = input.nextDouble();

        //
        // Calculate the total amount to be paid.
        //
        var sum = amount + (amount * (percentage / 100));

        //
        // Subtract the amount to be paid from the total sum to get the tip.
        //
        var percentage_amount = sum - amount;

        //
        // Now we can just print our results.
        //
        System.out.printf("Exercise 3 - The tip: %.2f\n", percentage_amount);
        System.out.printf("Exercise 3 - The sum: %.2f\n", sum);
    }

    //
    // This function takes an integer which resembles minutes and converts the integer
    // to years and days.
    //
    private static void calc_time()
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
        System.out.print("Exercise 4 - Enter a time in minutes: ");

        //
        // This just checks if there is a double that we can get.
        // If not then just abort.
        //
        if(!input.hasNextDouble())
        {
            System.out.print("\nExercise 4 - You didn't enter a number!");
            return;
        }

        //
        // The amount to be paid for e.g. a meal.
        //
        var minutes = input.nextDouble();

        //
        // There are 525600 minutes in a year, so dividing the minutes by 525600 will give us
        // the number of years.
        //
        var years = minutes / 525600;

        //
        // This will get the remaining minutes.
        //
        var remaining_minutes = minutes % 525600;

        //
        // This calculates the days which should be under a year (>= 365).
        //
        var days = remaining_minutes / 1440;

        //
        // Now we can just print our results.
        //
        if(years < 1)
            System.out.printf("Exercise 4 - %.0f minutes are (approx.) %.2f days\n", minutes, days);
        else
            System.out.printf("Exercise 4 - %.0f minutes are (approx.) %.2f years and %.2f days\n", minutes, years, days);
    }

    //
    // This function calculates the area and volume of a cylinder,
    // by taking the radius and length of the given cylinder as the input.
    //
    private static void calc_cylinder()
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
        System.out.print("Exercise 5 - Enter a radius and a length of a cylinder: ");

        //
        // This just checks if there is a double that we can get.
        // If not then just abort.
        //
        if(!input.hasNextDouble())
        {
            System.out.print("\nExercise 5 - You didn't enter a number!");
            return;
        }

        //
        // The radius of the cylinder.
        //
        var radius = input.nextDouble();

        //
        // This just checks if there is a second double that we can get.
        // If not then just abort.
        //
        if(!input.hasNextDouble())
        {
            System.out.print("\nExercise 5 - You didn't enter a second number!");
            return;
        }

        //
        // The length of the cylinder.
        //
        var length = input.nextDouble();

        //
        // Calculate the area of the cylinder by taking the square root
        // of the radius and multiplying it by PI.
        //
        var area = Math.pow(radius, 2) * Math.PI;

        //
        // Calculate the volume of the cylinder by multiplying the area and length.
        //
        var volume = area * length;

        //
        // This function calculates the area and volume of a cylinder,
        // by taking the radius and length of the given cylinder as the input.
        //
        System.out.printf("Exercise 5 - Area: %.2f | Volume: %.2f\n", area, volume);
    }

    //
    // This function takes a number between 0 and 1000 and calculates
    // all digits to a sum e.g.:
    // 914 = 14
    //
    private static void sum_number()
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
        System.out.print("Exercise 6 - Enter a number between 0 and 1000 (Integer): ");

        //
        // This just checks if there is a double that we can get.
        // If not then just abort.
        //
        if(!input.hasNextInt())
        {
            System.out.print("\nExercise 6 - You didn't enter a number!");
            return;
        }

        //
        // Get the number from the command line.
        //
        var number = input.nextInt();

        //
        // Check if the number is in our allowed range from 0 to 1000.
        //
        if(number < 0 || number > 1000)
        {
            System.out.print("Exercise 6 - The number is not between 0 and 1000\n");
            return;
        }

        // If the number is lower than 10 we don't have to do anything, just spit it out again.
        if(number < 10)
        {
            System.out.printf("Exercise 6 - The sum is: %d\n", number);
            return;
        }
        //
        // Same goes for 1000.
        //
        else if(number == 1000)
        {
            System.out.print("Exercise 6 - The sum is: 1\n");
            return;
        }

        //
        // Declare our result (sum) as an int.
        //
        int sum = 0;

        //
        // Use a while true so that it loops until we are finished.
        //
        while(true)
        {
            //
            // Get the last digit of our number.
            //
            var digit = number % 10;

            //
            // If the digit is 0 and our number is 0
            // then we can break out of our loop.
            //
            if(digit == 0 && number <= 0)
                break;

            //
            // At the digit to our result.
            //
            sum += digit;

            //
            // Remove the number from the integer by dividing by 10.
            // This works as an integer doesn't have decimals.
            //
            number /= 10;
        }

        //
        // Print the result.
        //
        System.out.printf("Exercise 6 - The sum is: %d\n", sum);
    }

    //
    // This function calculates the interest charges from the total amount
    // and the interest rate.
    //
    private static void calc_interest()
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
        System.out.print("Exercise 7 - Enter a balance and interest rate: ");

        //
        // This just checks if there is a double that we can get.
        // If not then just abort.
        //
        if(!input.hasNextDouble())
        {
            System.out.print("\nExercise 7 - You didn't enter a number!\n");
            return;
        }

        //
        // The balance.
        //
        var balance = input.nextDouble();

        //
        // This just checks if there is a second double that we can get.
        // If not then just abort.
        //
        if(!input.hasNextDouble())
        {
            System.out.print("Exercise 7 - You didn't enter a second number!\n");
            return;
        }

        //
        // The interest rate.
        //
        var interest_rate = input.nextDouble();

        //
        // Calculate the interest charge by multiplying the balance
        // by the interest divided by 1200.
        //
        var interest_charge = balance * (interest_rate / 1200);

        //
        // Print the result.
        //
        System.out.printf("Exercise 7 - The interest charges are: %.2f\n", interest_charge);
    }

    //
    // This function calculates savings for 6 months by taking a monthly amount to be saved.
    //
    private static void calc_savings()
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
        System.out.print("Exercise 8 - Enter a balance and interest rate: ");

        //
        // This just checks if there is a double that we can get.
        // If not then just abort.
        //
        if(!input.hasNextDouble())
        {
            System.out.print("\nExercise 8 - You didn't enter a number!\n");
            return;
        }

        //
        // The amount to be saved per month.
        //
        var amount = input.nextDouble();

        //
        // Initialize our sum as a double.
        //
        double sum = 0;

        //
        // Do this 6 times, since we want the savings for 6 months.
        //
        for(int i = 0; i < 6; i++)
        {
            //
            // Calculate the sum by multiplying the amount by 1 * 0.00417.
            // If "i" is greater than 0 multiply amount + sum by 1 * 0.00417.
            //
            sum = (amount + (i > 0 ? sum : 0)) * (1 + 0.00417);
        }

        //
        // Print our result.
        //
        System.out.printf("Exercise 8 - After the sixth month your savings sum up to: %.2f\n", sum);
    }
}
