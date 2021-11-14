//
// Called "Methoden - Aufgaben.pdf" on Moodle
//

package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //
        // Initialize our input variable with the systems input
        // interface as the constructor parameter.
        //
        //
        // Declare our input variable here which is derived
        // from the Scanner class.
        //
        Scanner input = new Scanner(System.in);

        //
        // Exercise 1
        //
        var sum = sum_digits(234);

        //
        // Print the result we got from sum_digits.
        // Since we chose 234 as a dummy parameter, the functions
        // has to do the following: 2 + 3 + 4 and then return the sum
        // which is 9.
        //
        System.out.printf("Exercise 1 - sum_digits returned %d\n", sum);

        //
        // Exercise 2
        //
        display_sorted_nums(3, 2, 1);

        //
        // Exercise 3
        //

        //
        // As this exercise request we need to print 2 tables
        // first one is the conversion from celsius to fahrenheit
        // from 40°C to 31°C.
        //
        System.out.print("Exercise 3:\n");
        System.out.print("Celsius\t\tFahrenheit\n");
        for(int i = 0, j = 40; i < 10; i++, j--)
            System.out.printf("%d\t\t\t%.2f\n", j, temperature.celsius_to_fahrenheit(j));

        //
        // In the second table we are supposed to print
        // the conversion from fahrenheit to celsius for the values
        // from 120°F to 30°F in steps of -10.
        //
        System.out.print("\nFahrenheit\t\tCelsius\n");
        for(int i = 0, j = 120; i < 10; i++, j -= 10)
            System.out.printf("%d\t\t\t\t%.2f\n", j, temperature.fahrenheit_to_celsius(j));

        //
        // Exercise 4
        //

        //
        // Ask the user to enter a password
        // which we then validate.
        //
        System.out.print("Exercise 4 - Please enter a password: ");

        //
        // Get the password from the command line
        // through our input variable.
        //
        var password = input.next();

        //
        // If the function returns true the password is valid
        // if it returns false it's invalid.
        //
        if(password_validator(password))
            System.out.print("Exercise 4 - This password is valid!\n");
        else
            System.out.print("Exercise 4 - This password is invalid!\n");

        //
        // Exercise 5
        //

        //
        // Call the count_chars function with the parameters
        // Welcome and e to get how often the word Welcome
        // contains the letter e.
        //
        var count = count_chars("Welcome", 'e');

        //
        // Print how often the letter 'e' can be found
        // in the word "Welcome".
        //
        System.out.printf("Exercise 5 - The word 'Welcome' contains the letter 'e' %d times!\n", count);

        //
        // Exercise 6
        //
        System.out.printf("Exercise 6 - The greatest common divisor of 4 and 85678676 is: %d\n", gcd(4, 85678676));

        //
        // Exercise 7
        //
        display_reverse_string("Welcome");
    }

    //
    // This function takes a number "n" and
    // returns a sum of all digits (from n).
    //
    private static int sum_digits(long n)
    {
        //
        // Declare and initialize our sum variable.
        // This one will be returned as our function
        // needs to return an integer.
        //
        int sum = 0;

        //
        // This loop will run until n is 0.
        //
        while(true)
        {
            //
            // Get the last digit of n.
            //
            var digit = n % 10;

            //
            // Break out of the loop if the digit is 0
            // and n is zero to not break out if the number contains
            // a zero somewhere in the middle.
            //
            if(digit == 0 && n <= 0)
                break;

            //
            // Add the digit to our sum.
            //
            sum += digit;

            //
            // Remove the last digit from n.
            //
            n /= 10;
        }

        //
        // Return our sum to the callee.
        //
        return sum;
    }

    //
    // This function takes 3 numbers as parameters and sorts
    // them in ascending order and then prints them to the command line.
    //
    private static void display_sorted_nums(double n_1, double n_2, double n_3)
    {
        //
        // Since I don't want to write a sorting algorithm again
        // we are going to use Java's Array.sort implementation.
        // For this we of course need an array, which we declare and initialize with our
        // three numbers (n_1, n_2, n_3) here.
        // For a sorting algorithm implementation see here:
        // https://github.com/koyzdev/HOF_Uni_Programming/blob/main/III%20-%20Conditional%20Statements/src/com/company/Main.java#L89
        //
        double[] nums = { n_1, n_2, n_3 };

        //
        // This function sorts our numbers in the
        // nums array.
        //
        Arrays.sort(nums);

        System.out.printf("Exercise 2 - Original: %f %f %f\n", n_1, n_2, n_3);
        System.out.printf("Exercise 2 - Sorted: %f %f %f\n", nums[0], nums[1], nums[2]);
    }

    //
    // This function takes a password in form of a String
    // as a parameter.
    // It validates it with the following rule set:
    // - The password needs to be at least 8 characters long.
    // - The password can only contain letters and digits.
    // - The password has to contain at least 2 digits.
    //
    private static boolean password_validator(String password)
    {
        //
        // If the password has a size smaller than 8 we can just return
        // false as it violates the rule set.
        //
        if(password.length() < 8)
            return false;

        //
        // Declare and initialize our digit counter.
        //
        int digit_count = 0;

        //
        // We cycle through all the chars contained
        // in our password string.
        //
        for(int i = 0; i < password.length(); i++)
        {
            //
            // Check if the current character is a character
            // that is neither a letter nor a digit, if so
            // return false as it violates the rule set.
            //
            if(!Character.isLetterOrDigit(password.charAt(i)))
                return false;

            //
            // If the current character is a digit increase
            // the digit counter by 1.
            //
            if(Character.isDigit(password.charAt(i)))
                digit_count++;
        }

        //
        // If the digit counter is smaller than 2
        // then return false as it violates the rule set.
        // If it is greater or equal to 2 then just return true.
        //
        return digit_count >= 2;
    }

    //
    // This function returns the count on how many times
    // the variable str contains the char c.
    //
    private static int count_chars(String str, char c)
    {
        //
        // This variable keeps track of how often
        // our string (str) contains the char (c).
        //
        int count = 0;

        //
        // Iterate through all chars of the string.
        //
        for(int i = 0; i < str.length(); i++)
        {
            //
            // If the current char is equal to our variable c
            // then increase the count by 1.
            //
            if(str.charAt(i) == c)
                count++;
        }

        //
        // Return the count
        //
        return count;
    }

    //
    // This function aims to find the greatest common divisor
    // for m and n.
    // This is done through Euclid's algorithm.
    //
    private static int gcd(int m, int n)
    {
        //
        // We found the greatest divisor, return m.
        //
        if(n == 0)
            return m;

        //
        // This is known as recursive function calling.
        // We just call ourselves over and over again until
        // we hit the return from the statement above.
        //
        return gcd(n, m % n);
    }

    //
    // This function takes a string as a parameter,
    // reverses it and then displays the reversed version.
    // "abcd" -> "dcba"
    //
    private static void display_reverse_string(String str)
    {
        //
        // Declare and initialize a StringBuilder so that
        // we don't have to use the String += char method.
        //
        StringBuilder reversed = new StringBuilder();

        //
        // Iterate through all chars of our str variable
        // but append the chars from the back to the front to
        // our reversed variable.
        //
        for(int i = 0, j = str.length() - 1; i < str.length(); i++, j--)
            reversed.append(str.charAt(j));

        //
        // Print our original and reversed string.
        //
        System.out.printf("Exercise 7 - Original: %s -> Reversed: %s\n", str, reversed);
    }
}
