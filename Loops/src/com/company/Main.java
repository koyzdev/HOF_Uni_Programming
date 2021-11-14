//
// Called "Schleifen - Aufgaben.pdf" on Moodle
//

package com.company;
import java.util.Scanner;

public class Main
{
    //
    // Declare our input variable here which is derived
    // from the Scanner class.
    //
    private static Scanner input;

    public static void main(String[] args)
    {
        //
        // Initialize our input variable with the systems input
        // interface as the constructor parameter.
        //
        input = new Scanner(System.in);

        //
        // Exercise 1
        //
        read_until_zero();

        //
        // Exercise 2
        //
        display_table();

        //
        // Exercise 3
        //
        calc_fees();

        //
        // Exercise 4
        //
        get_divisible_numbers();

        //
        // Exercise 5
        //
        count_numbers();

        //
        // Exercise 6
        //
        print_prime_numbers();

        //
        // Exercise 7
        //
        count_vowels();

        //
        // Exercise 8
        //
        calc_savings();
    }

    //
    // This function retrieves numbers through the command line
    // until it retrieves a 0.
    // After it retrieves a 0 it will display the count of positive and negative numbers,
    // the sum of all numbers and the average.
    //
    private static void read_until_zero()
    {
        //
        // Print our message through the out interface of the system
        // right on the cmd.
        //
        System.out.print("Exercise 1 - Enter numbers, input ends when you enter a 0: ");

        // Declare and initialize our
        int count = 0;
        double sum = 0;

        //
        // Declare and initialize the positive and negative counter.
        //
        int positive = 0, negative = 0;

        //
        // Simple while loop which only stops when the program either calls
        // return or break.
        //
        while(true)
        {
            //
            // Get the next integer from the command line
            //
            var num = input.nextInt();

            //
            // If the user enters a 0 we can stop.
            //
            if(num == 0)
                break;

            //
            // These are the positive and negative number counter
            // increasing them respectively when a positive or negative number
            // is entered.
            //
            if(num > 0)
                positive++;
            else
                negative++;

            //
            // This is the overall counter, counting all entered numbers.
            //
            count++;

            //
            // This is the sum made out of all numbers added together.
            //
            sum += num;
        }

        //
        // Calculate the average by dividing the sum with the count.
        //
        double average = sum / count;

        //
        // Print our results.
        //
        System.out.printf("Exercise 1 - Number of positives: %d\n", positive);
        System.out.printf("Exercise 1 - Number of negatives: %d\n", negative);
        System.out.printf("Exercise 1 - Sum: %.2f\n", sum);
        System.out.printf("Exercise 1 - Average: %.2f\n", average);
    }

    //
    // This function displays a table in the console window
    // which shows numbers in kilogram and pound.
    //
    private static void display_table()
    {
        //
        // Exercise indicator.
        //
        System.out.print("Exercise 2:\n");

        //
        // This is basically the table structure,
        // on the left side we have the weight in kilogram
        // and on the right side we have the same weight but in pounds.
        //
        System.out.print("Kilogram\t\tPound\n");

        //
        // This table will start at 1 kilogram/ pound
        // and then advances by 2 (+= 2)
        //
        for(int i = 1; i < 200; i += 2)
            System.out.printf("%d\t\t\t\t%.2f\n", i, i * 2.2);
    }

    //
    // This function calculates study fees.
    // The base fee is 10000 and gets 5% more each year.
    // We need to calculate how much it costs in 10 years and then
    // get the total amount for 4 years after the 10th year.
    //
    private static void calc_fees()
    {
        //
        // This is our total.
        //
        var total = 10000.0;

        //
        // The increase for our fee in percent.
        //
        var fee_increase = 5.0;

        //
        // Here we increase the total by applying the fee every year.
        // The fee is calculated by multiplying the total with the fee_increase in percent.
        //
        for(int i = 0; i < 10; i++)
            total += total * (fee_increase / 100);

        //
        // Print our first result.
        //
        System.out.printf("Exercise 3 - Total fee per year after 10 years: %.2f\n", total);

        //
        // Declare and initialize our total_costs for 4 years
        // after increasing the total for 10 years.
        //
        double total_costs = 0.0;

        //
        // Add the total to our total_costs and again increase
        // the total with the annual fee.
        //
        for(int i = 0; i < 4; i++)
        {
            total_costs += total;
            total += total * (fee_increase / 100);
        }

        //
        // Print our total_costs after 4 years.
        //
        System.out.printf("Exercise 3 - Total costs after 4 years: %.2f\n", total_costs);
    }

    //
    // This function prints all numbers that are divisible through
    // 5 or 6, but not both from 100 to 200. (5 per line)
    //
    private static void get_divisible_numbers()
    {
        //
        // Exercise identifier.
        //
        System.out.print("Exercise 4:\n");

        //
        // Since we want to iterate through 100 to 200
        // we set our i to 100 as this makes things a lot easier.
        //
        for(int i = 100, j = 0; i <= 200; i++)
        {
            //
            // If the number is divisible by 5 AND 6 we just continue.
            //
            if(i % 5 == 0 && i % 6 == 0)
                continue;

            //
            // Here we check if it's divisible by 5 or 6.
            //
            if(i % 5 == 0 || i % 6 == 0)
            {
                //
                // Print our number and increase j by 1 as we found another number.
                //
                System.out.printf("%d ", i);
                j++;

                //
                // If j is divisible by 5 we know that we need
                // to insert a break as we only allow 5 numbers per line.
                //
                if(j % 5 == 0)
                    System.out.print("\n");
            }
        }

        //
        // Insert another break as we would otherwise continue writing
        // on the last line of this exercise!
        //
        System.out.print("\n");
    }

    //
    // This function retrieves numbers over the command line
    // 0 is the terminating number again.
    // It keeps track of the greatest number and counts how often
    // the greatest number is being entered.
    //
    private static void count_numbers()
    {
        //
        // Declare and initialize our counting and max integers.
        //
        int count = 0, max = 0;

        //
        // Print our message through the out interface of the system
        // right on the cmd.
        //
        System.out.print("Exercise 5 - Enter numbers (0 is the terminating number): ");

        //
        // This loop lasts until we either terminate the program,
        // call return or break out of it.
        //
        while(true)
        {
            //
            // Get the current integer from the command line.
            //
            var num = input.nextInt();

            //
            // Check if our number is equal to our terminating number.
            //
            if(num == 0)
            {
                //
                // If we didn't receive any number than 0 throw a basic warning type of message
                // and return.
                //
                if(max == 0)
                {
                    System.out.print("Exercise 5 - No number bigger than 0 found!\n");
                    return;
                }

                break;
            }

            //
            // If the current number is the max number
            // increase the count by 1.
            //
            if(num == max)
                count++;

            //
            // If the current number is bigger than the max number
            // set the max number to our current number
            // and reset the counter.
            //
            if(num > max)
            {
                max = num;
                count = 1;
            }
        }

        //
        // Print our result.
        //
        System.out.printf("Exercise 5 - Highest number is %d and occurred %d %s!\n", max, count, count > 1 ? "times" : "time");
    }

    //
    // This function returns true if the parameter n
    // is a prime number, false if not.
    //
    private static boolean is_prime(int n)
    {
        //
        // Edge case, since anything equal or below 1
        // isn't a prime number.
        //
        if(n <= 1)
            return false;

        //
        // Iterate from 2 until the square root of n.
        //
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            //
            // If n is perfectly divisible by i then return false.
            //
            if(n % i == 0)
                return false;
        }

        //
        // We found a prime number so we can return true.
        //
        return true;
    }

    //
    // This function prints all prime numbers from 1 to 1000.
    //
    private static void print_prime_numbers()
    {
        //
        // Exercise identifier.
        //
        System.out.print("Exercise 6:\n");

        //
        // Iterate from 2 (since 1 isn't a prime number) until 1000.
        //
        for(int i = 2; i <= 1000; i++)
        {
            //
            // If the is_prime function returns true
            // we can print our prime number (i).
            //
            if(is_prime(i))
                System.out.printf("%d is a prime number!\n", i);
        }
    }

    //
    // This function takes a string from the command line
    // and counts the vowels in it.
    //
    private static void count_vowels()
    {
        //
        // Print our message through the out interface of the system
        // right on the cmd.
        //
        System.out.print("Exercise 7 - Enter any string: ");

        //
        // Declare and initialize our text varialbe where
        // we will store our command line input.
        //
        String text = "";

        //
        // The while is necessary as the program will just skip a single
        // nextLine().
        //
        while(input.hasNextLine())
        {
            //
            // We get the complete next line until the user hits space/ or a \n is inserted (through pressing space).
            //
            text = input.nextLine();

            //
            // We can break if we have our text.
            //
            if(!text.isEmpty())
                break;
        }

        //
        // Declare and initialize our vowels variable
        // which is basically our vowels counter.
        //
        int vowels = 0;

        //
        // Here we just iterate through every character of our text variable
        //
        for(int i = 0; i < text.length(); i++)
        {
            //
            // This switch goes through all characters
            // and increases the vowels counter if it
            // hits one of the cases.
            //
            switch (text.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' ->
                        vowels++;
            }
        }

        //
        // Print our result.
        //
        System.out.printf("Exercise 7 - There are %d vowels!\n", vowels);
    }

    //
    // This function calculates savings for 6 months by taking a monthly amount to be saved.
    // I copied this function from my other exercise since I have already done it there???
    // https://github.com/koyzdev/HOF_Uni_Programming/blob/main/Exercise_2/src/com/company/Main.java#L438 (with some stuff removed and added)
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
        System.out.print("Exercise 8 - Enter a balance and the amount of months: ");

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
        // How long the user want's to save up in months.
        //
        var months = input.nextDouble();

        //
        // Initialize our sum as a double.
        //
        double sum = 0;

        //
        // Do this 6 times, since we want the savings for 6 months.
        //
        for(int i = 0; i < months; i++)
        {
            //
            // Calculate the sum by multiplying the amount by 1 * 0.00417.
            // If "i" is greater than 0 multiply amount + sum by 1 * 0.00417.
            // 0.00417 since 0.05 (5%) divided by 12 is 0.00417.
            //
            sum = (amount + (i > 0 ? sum : 0)) * (1 + 0.00417);
        }

        //
        // Print our result.
        //
        System.out.printf("Exercise 8 - After the %.0f month your savings sum up to: %.2f€\n", months, sum);
    }
}
