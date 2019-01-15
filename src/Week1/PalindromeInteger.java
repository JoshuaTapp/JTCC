package Week1;

import java.util.Scanner;

public class PalindromeInteger
{

    public static void main(String arg[])
    {
        //Query user for input.
        String str = String.valueOf(inputInt());

        //reverse sort string.
        String reverseStr = reverseSort(str);

        //Test if integer input is Palindrome.
        if(str.equalsIgnoreCase(reverseStr))
        {
            System.out.println("The Integer " + str + ", is a Palindrome.");
        }
        else
        {
            System.out.println("The Integers " + str + " and " + reverseStr + ", are not Palindromes.");
        }
    }

    private static String reverseSort(String a)
    {
        // Input: Requires legal integer as input
        // Expected Operation: Converts integer to String and sorts in reverse
        // Returns: Reverse sorted number as a String.

        char[] b = strToCharArray(a);

        // Walks Array from out to middle switching values from start to end.
        // If values are same, does not switch to prevent pointless operation
        int j = 0;              //counter from 0 index
        int i = a.length() - 1; //counter from last index

        while(!(j == i || (j+1) == i))
        {
            if(! (b[j] == b[i]) )
            {
                char temp = b[j];
                b[j] = b[i];
                b[i] = temp;
            }

            j++;
            i--;
        }

       return String.copyValueOf(b);
    }

    private static char[] strToCharArray(String str)
    {
        // Inputs: Single String type
        // Expected Operation: Converts String Object into legal Char Array
        // Returns: The converted String as Char Array

        char[] b = new char[str.length()];

        for( int i = 0; i < b.length; i++)
        {
            b[i] = str.charAt(i);
        }

        return b;
    }

    private static int inputInt()
    {
        //Simple class to fetch user input and return Integer
        //Has simple loop to handle error catching and prevent non-integer inputs.

        int input;
        Scanner kb = new Scanner(System.in);

        do
        {
            try
            {
                System.out.println("Please input an Integer => ");
                input = kb.nextInt();
                break;
            }
            catch(Exception e)
            {
                System.out.println("Please Try Again. Make sure to use an Integer.");
                kb.next();
            }

        }while(true);

        return input;
    }
}
