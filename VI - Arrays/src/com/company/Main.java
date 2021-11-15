//
// Called "Arrays - Aufgaben.pdf" on Moodle
//

package com.company;
import java.util.*;

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

        //
        // For this exercise we need a dummy array of integers.
        // The maximum length is allowed to be 10.
        //
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        //
        // After declaring and initializing the array with our
        // dummy integers we can call our function with the
        // array as the parameter.
        //
        reverse_nums(nums);

        //
        // Exercise 2
        //
        count_numbers();

        //
        // Exercise 3
        //
        gen_random_nums_and_count();

        //
        // Exercise 4
        //

        //
        // Create a dummy array for our function call.
        //
        double[] arr = {25, 5, 20, 2, 51, 2};

        //
        // Call the function with our dummy array.
        //
        var smallest = get_min_array(arr);

        //
        // Print our results.
        //
        System.out.printf("Exercise 4 - The smallest element in this array: %s is -> %.0f.\n", Arrays.toString(arr), smallest);

        //
        // Exercise 5
        //

        //
        // We are going to use the dummy array from exercise 4 again.
        //
        var index = index_of_smallest_element(arr);

        //
        // Print the smallest index alongside the elements.
        //
        System.out.printf("Exercise 4 - The smallest elements index in this array: %s is -> %d.\n", Arrays.toString(arr), index);
    }

    //
    // This function takes an array as a parameter.
    // It is supposed to take this array and the integers
    // stored within it and reverse the order of the integers.
    // It then displays the reversed array.
    //
    private static void reverse_nums(int[] nums)
    {
        //
        // The exercise says that we are only allowed to accept
        // 10 numbers in our array.
        // If this number is exceeded we just throw an error message
        // and return.
        //
        if(nums.length > 10)
        {
            System.out.print("Exercise 1 - Only 10 numbers allowed!\n");
            return;
        }

        //
        // Since I want to display the original and the reversed
        // output we need to make another array.
        // In this case an int array with the size of 10, since we know
        // that this size can't be exceeded.
        //
        int[] reversed = new int[10];

        //
        // Now we just iterate through all numbers in our nums array.
        // j is set to nums.length - 1 since we always want to get the last element
        // and then iterate backwards to the beginning of nums.
        // nums.length - 1 is needed as arrays start at 0, and otherwise it would
        // cause an index out of bounds exception.
        //
        for(int i = 0, j = nums.length - 1; i < nums.length; i++, j--)
            reversed[i] = nums[j];

        //
        // Now we can just print our results.
        // Here we use the Arrays.toString function to "beautify"
        // our arrays.
        // The output will look something like this, at least for ints:
        // [x, y, z, ...]
        //
        System.out.printf("Exercise 1 - Original: %s\n", Arrays.toString(nums));
        System.out.printf("Exercise 1 - Reversed: %s\n", Arrays.toString(reversed));
    }

    //
    // This function retrieves numbers (integers) over the command line
    // adds them to a list and then counts their occurrences.
    //
    private static void count_numbers()
    {
        //
        // Print this statement so that the user knows
        // what he has to do.
        //
        System.out.print("Exercise 2 - Please enter numbers (0 will terminate this input): ");

        //
        // We allocate a new integer list
        // since we don't know the size it is best practice
        // to not allocate a static array and therefore use a
        // dynamic list.
        //
        var nums = new ArrayList<Integer>();

        //
        // This while will break as soon as the user
        // enters the terminating number, which in this
        // case is the number 0.
        //
        while(true)
        {
            //
            // Get the next int on the command line.
            //
            var tmp = input.nextInt();

            //
            // Break if the terminating number has been entered.
            //
            if(tmp == 0)
                break;

            //
            // Add our number into our list.
            //
            nums.add(tmp);
        }

        //
        // This count is used to display how many
        // times a certain number can be found in our
        // list. It will be reset every time a new number
        // is being counted.
        //
        int count = 0;

        //
        // The size variable is linked with our found
        // array, it keeps track of how many elements
        // are in the found array.
        // We can't use the length element of the array
        // since it is statically allocated.
        //
        int size = 0;

        //
        // The found array will include the already counted numbers
        // so that we don't have duplicates in our output.
        //
        int[] found = new int[nums.size()];

        //
        // This skip boolean will be used in the for loop
        // to skip after breaking out a for loop inside
        // a for loop.
        //
        boolean skip = false;

        //
        // This for loop will iterate through all numbers
        // in our list.
        //
        for(int i = 0; i < nums.size(); i++)
        {
            //
            // Here we go through our found array to check
            // if we already counted at therewith already
            // printed the count on the command line of the current
            // number in the nums array.
            //
            for(int o = 0; o < size; o++)
            {
                //
                // Set the skip boolean to true if the current nums element
                // is equal to our current found element.
                // We just break after setting it to true otherwise we would
                // be wasting useless CPU cycles.
                //
                if(found[o] == nums.get(i))
                {
                    skip = true;
                    break;
                }
            }

            //
            // If the skip boolean is true it means we already
            // counted the current number, and we can just continue on
            // to the next element in our list.
            // Before breaking we have to reset the boolean so that we can
            // continue finding new, uncounted elements.
            //
            if(skip)
            {
                skip = false;
                continue;
            }

            //
            // Now we go through all of the elements in our nums list again
            // to find our duplicates.
            //
            for (var num : nums)
            {
                //
                // If the current element in our nums array match (j)
                // with the outer element (i) then we increase the counter.
                //
                if (Objects.equals(nums.get(i), num))
                    count++;
            }

            //
            // Here we insert the counted number into our found
            // array so that we don't count it again.
            //
            found[size] = nums.get(i);

            //
            // Increase the linked size variable of our found array
            // so that we don't overwrite our elements.
            //
            size++;

            //
            // Now just print the result.
            //
            System.out.printf("Exercise 2 - Found %d, %d times!\n", nums.get(i), count);

            //
            // Reset the counter for the next element.
            //
            count = 0;
        }
    }

    //
    // This function generated 100 random integers ranging from
    // 0 to 9.
    // It then needs to count the individual numbers, just like in exercise 2.
    //
    private static void gen_random_nums_and_count()
    {
        //
        // We can just statically allocate our array
        // since we know that we only need 100 elements.
        //
        int[] nums = new int[100];

        //
        // Generate 100 random numbers ranging from 0 to 9
        // with the Math libraries random() implementation
        // and add then to our nums array.
        //
        for(int i = 0; i < 99; i++)
            nums[i] = (int)(Math.random() * (10));

        //
        // To not use an exaggerational amount of variables
        // (like in exercise 2) we are going to use a list
        // for keeping track of the size() (or count).
        //
        var dupes = new ArrayList<Integer>();

        //
        // Just like in exercise 2 we are going to use a skip
        // boolean to set it in a for loop which is inside a for loop.
        //
        boolean skip = false;

        //
        // To, again, not use too many variables
        // we will just go for a simple for(each) loop here.
        // This is the same as using nums[i] but without the i.
        // This for loop just goes through all our random numbers.
        //
        for (int num : nums)
        {
            //
            // This for loop iterates through all our numbers
            // or duplicates that we already checked/ counted.
            //
            for (var d : dupes)
            {
                //
                // If the number in the dupes array matches our
                // current number (num) then we skip it, since we
                // already counted it.
                //
                if (d == num)
                {
                    skip = true;
                    break;
                }
            }

            //
            // If the skip boolean is true it means we already
            // counted the current number, and we can just continue on
            // to the next element in our list.
            // Before breaking we have to reset the boolean so that we can
            // continue finding new, uncounted elements.
            //
            if (skip)
            {
                skip = false;
                continue;
            }

            //
            // This count variable keeps track of
            // how often the current num is inside our
            // nums array.
            //
            int count = 0;

            //
            // We now again go through our nums array
            // checking for any other numbers that are equal
            // to our current number (num).
            //
            for(var n : nums)
            {
                //
                // If n is equal to our current number num
                // we found a equal number and can increase
                // the counter by 1.
                //
                if(n == num)
                    count++;
            }

            //
            // So that we don't check the same number again
            // we are going to insert it into our dupes list.
            //
            dupes.add(num);

            //
            // Print our result.
            //
            System.out.printf("Exercise 3 - Found %d, %d times!\n", num, count);
        }
    }

    //
    // This function takes an array as a parameter and is then
    // supposed to find the smallest number in the array.
    //
    private static double get_min_array(double[] array)
    {
        //
        // If we don't have any elements in the array
        // we are just going to return 0.
        //
        if(array.length <= 0)
            return 0.0;

        //
        // We set the min value to the first element
        // in the array since we can't set it 0, as
        // there could be only numbers greater than 0 in
        // the array meaning the function would always return 0.
        //
        var min = array[0];

        //
        // Here we just go through all elements in the array.
        //
        for (double e : array)
        {
            //
            // If e is smaller than the current min value
            // we are going to set the min value to e.
            //
            if (e < min)
                min = e;
        }

        //
        // Return our result.
        //
        return min;
    }

    //
    // This function takes an array as a parameter and then
    // searches for the smallest element inside it and returns
    // the smallest elements index.
    //
    private static int index_of_smallest_element(double[] array)
    {
        //
        // If we don't have any elements in the array
        // we are just going to return -1.
        //
        if(array.length <= 0)
            return -1;

        //
        // We set the min value to the first element
        // in the array since we can't set it 0, as
        // there could be only numbers greater than 0 in
        // the array meaning the function would always return 0.
        //
        double min = array[0];

        //
        // Since the function needs to return the index of
        // the smallest element, we of course need to keep
        // track of it.
        //
        int index = 0;

        //
        // This for loop just iterates through all elements
        // inside the array.
        //
        for(int i = 0; i < array.length; i++)
        {
            //
            // If the current element is smaller than the min variable
            // we are going to set min to the current element and update
            // the index to the current index (i).
            //
            if(array[i] < min)
            {
                min = array[i];
                index = i;
            }
        }

        //
        // Return our index.
        //
        return index;
    }
}