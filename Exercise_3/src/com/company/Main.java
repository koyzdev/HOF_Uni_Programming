//
// Called "Bedingte Anweisungen - Aufgaben.pdf" on Moodle
//

package com.company;
import java.util.Locale;
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
        sort_numbers();

        //
        // Exercise 2
        //
        check_number_difference();

        //
        // Exercise 3
        //
        check_interval();

        //
        // Exercise 4
        //
        check_discount();

        //
        // Exercise 5
        //
        get_grade();

        //
        // Exercise 6
        //
        get_chinese_star_sign();

        //
        // Exercise 7
        //
        get_days_of_months();
    }

    //
    // This function takes 3 numbers over the command line
    // and sorts them in ascending order.
    //
    private static void sort_numbers()
    {
        //
        // Print our message through the out interface of the system
        // right on the cmd.
        //
        System.out.print("Exercise 1 - Enter a 3 numbers to be sorted: ");

        //
        // Get all 3 numbers that need to be sorted
        //
        var first = input.nextInt();
        var second = input.nextInt();
        var third = input.nextInt();

        //
        // Create an integer array with the size 3.
        // After that insert all integers into the array.
        //
        int[] nums = new int[3];
        nums[0] = first;
        nums[1] = second;
        nums[2] = third;

        // Simple sorting algorithm.
        for(int i = 0; i < 3; i++)
        {
            for(int j = i + 1; j < 3; j++)
            {
                //
                // If the i + 1 number is bigger than the number stored at i
                // then simply save the current number, replace it by the i + 1 number
                // and set the i + 1 number to the old value (i).
                //
                if(nums[i] > nums[j])
                {
                    var tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        //
        // Print our result.
        //
        System.out.printf("Exercise 1 - Numbers in ascending order: %d %d %d\n", nums[0], nums[1], nums[2]);
    }

    //
    // This function takes 3 numbers over the command line
    // and tells the user if the difference between the smallest
    // and biggest number is more than 10.
    //
    private static void check_number_difference()
    {
        //
        // Print our message through the out interface of the system
        // right on the cmd.
        //
        System.out.print("Exercise 2 - Enter a 3 numbers to get the difference: ");

        //
        // Get all 3 numbers that need to be sorted
        //
        var first = input.nextInt();
        var second = input.nextInt();
        var third = input.nextInt();

        //
        // Create an integer array with the size 3.
        // After that insert all integers into the array.
        //
        int[] nums = new int[3];
        nums[0] = first;
        nums[1] = second;
        nums[2] = third;

        // Simple sorting algorithm.
        for(int i = 0; i < 3; i++)
        {
            for(int j = i + 1; j < 3; j++)
            {
                //
                // If the i + 1 number is bigger than the number stored at i
                // then simply save the current number, replace it by the i + 1 number
                // and set the i + 1 number to the old value (i).
                //
                if(nums[i] > nums[j])
                {
                    var tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        //
        // Check if the difference between the third and first number is bigger than ten.
        //
        boolean bigger_than_ten = (nums[2] - nums[0]) > 10;

        //
        // Print our results based on the Boolean called "bigger_than_ten".
        //
        System.out.printf("Exercise 2 - The difference between %d and %d is %s than ten!\n", nums[0], nums[2], bigger_than_ten ? "bigger" : "not bigger");
    }

    //
    // This function retrieves a number from the command line
    // and then checks if it is in one of our intervals.
    //
    private static void check_interval()
    {
        //
        // Print our message through the out interface of the system
        // right on the cmd.
        //
        System.out.print("Exercise 3 - Enter a number: ");

        //
        // Get the number for which the interval shall be checked. - Shakespeare, maybe.
        //
        var num = input.nextInt();

        //
        // Check if the number is in the [10, 50] interval/ range.
        //
        if(num >= 10 && num <= 50)
        {
            System.out.printf("Exercise 3 - %d is in the [10, 50] range.\n", num);
            return;
        }

        //
        // Check if the number is in the [80, 100] interval/ range.
        //
        if(num >= 80 && num <= 100)
        {
            System.out.printf("Exercise 3 - %d is in the [80, 100] range.\n", num);
            return;
        }

        //
        // We get here if the number is in none of our ranges that we check for.
        //
        System.out.printf("Exercise 3 - %d is in none of the given ranges!\n", num);
    }

    //
    // This function retrieves two numbers from the command line
    // first the age of the person and second how long the driver has his license for (in years).
    //
    private static void check_discount()
    {
        //
        // Print our message through the out interface of the system
        // right on the cmd.
        //
        System.out.print("Exercise 4 - Enter your age and how long you own your drivers license for: ");

        //
        // Get the age of the driver.
        //
        var age = input.nextInt();

        //
        // Get how long the driver owns his/hers driver's license for.
        //
        var license_years = input.nextInt();

        //
        // Initialize our discount variable.
        //
        int discount = 0;

        //
        // If the driver is at least 25 years old
        // and his/hers driver's license for at least 5 years
        // then the driver is eligible for a 20% discount.
        //
        if(age >= 25 && license_years >= 5)
            discount = 20;

        //
        // If the driver is at least 25 years old
        // and his/hers driver's license for at least 2 years
        // then the driver is eligible for a 10% discount.
        //
        else if(age >= 25 && license_years >= 2)
            discount = 10;

        //
        // Print our result.
        //
        System.out.printf("Exercise 4 - The driver is eligible for a %d%% discount!\n", discount);
    }

    //
    // This function retrieves a number from 0 to 100 and prints the respective grade.
    // The list for the grades is as following:
    // 0 to 49 pts -> 5
    // 50 to 59 pts -> 4
    // 60 to 74 pts -> 3
    // 75 to 89 pts -> 2
    // 90 to 100 pts -> 1
    //
    private static void get_grade()
    {
        //
        // Print our message through the out interface of the system
        // right on the cmd.
        //
        System.out.print("Exercise 5 - Enter the points to get the grade (0 to 100): ");

        //
        // The points for the grade.
        //
        var points = input.nextInt();

        //
        // Check if points is between 0 and 100.
        //
        if(points < 0 || points > 100)
        {
            System.out.print("\nExercise 5 - The number is not in the supplied range (0 to 100)!\n");
            return;
        }

        //
        // Declare our grade variable.
        // Initialization is not needed as it will be initialized anyways.
        //
        int grade;

        //
        // This "if" just checks if the points is within a certain range.
        //
        if(points <= 49)
            grade = 5;
        else if(points <= 59)
            grade = 4;
        else if(points <= 74)
            grade = 3;
        else if(points <= 89)
            grade = 2;
        else
            grade = 1;

        //
        // Print our results.
        //
        System.out.printf("Exercise 5 - %d points is equal to a %d!\n", points, grade);
    }

    //
    // This function retrieves a year through the command line
    // it then outputs the corresponding chinese start sign.
    //
    private static void get_chinese_star_sign()
    {
        //
        // Print our message through the out interface of the system
        // right on the cmd.
        //
        System.out.print("Exercise 6 - Enter a year: ");

        //
        // The year that has been entered.
        //
        var year = input.nextInt();

        //
        // Declare our star sign variable.
        //
        String star_sign;

        //
        // Chinese star signs cycle every 12 years.
        // We are using a switch on the basis of year % 12.
        //
        switch(year % 12)
        {
            case 0:
            {
                star_sign = "Affe";
                break;
            }
            case 1:
            {
                star_sign = "Hahn";
                break;
            }
            case 2:
            {
                star_sign = "Hund";
                break;
            }
            case 3:
            {
                star_sign = "Schwein";
                break;
            }
            case 4:
            {
                star_sign = "Ratte";
                break;
            }
            case 5:
            {
                star_sign = "Büffel";
                break;
            }
            case 6:
            {
                star_sign = "Tiger";
                break;
            }
            case 7:
            {
                star_sign = "Hase";
                break;
            }
            case 8:
            {
                star_sign = "Drache";
                break;
            }
            case 9:
            {
                star_sign = "Schlange";
                break;
            }
            case 10:
            {
                star_sign = "Pferd";
                break;
            }
            case 11:
            {
                star_sign = "Ziege";
                break;
            }

            //
            // We couldn't find a matching star sign.
            //
            default:
            {
                System.out.print("Exercise 6 - Couldn't find your star sign!\n");
                return;
            }
        }

        //
        // Print our result.
        //
        System.out.printf("Exercise 6 - Your star sign is: %s\n", star_sign);
    }

    //
    // This function retrieves a month (in lowercase only) and then outputs
    // the number of days in this month.
    //
    private static void get_days_of_months()
    {
        //
        // Print our message through the out interface of the system
        // right on the cmd.
        //
        System.out.print("Exercise 7 - Enter a month (String): ");

        //
        // The year that has been entered.
        //
        var month = input.next();

        //
        // Declare our days variable.
        //
        int days;

        //
        // Switch through the months and then set the days
        // variable based on the month.
        //
        switch(month.toLowerCase(Locale.ROOT))
        {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                days = 31;
                break;

            case "april":
            case "june":
            case "september":
            case "november":
                days = 30;
                break;

            case "february":
                days = 28;
                break;

            //
            // Month couldn't be found!
            //
            default:
                System.out.print("Exercise 7 - Couldn't find this month!\n");
                return;
        }

        //
        // Print our result.
        //
        System.out.printf("Exercise 7 - %s has %d days!\n", month, days);
    }
}
