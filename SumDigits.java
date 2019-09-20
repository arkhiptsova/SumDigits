package FeetNumber;
/*
Mila Arkhiptcova
This program with a method that computes and returns the sum of the digits in an integer.
Example: sumDigits (345) will result in 12 (3 + 4 + 5). 
09/19/2019
Bellevue University
SumDigits.java
*/

import java.util.Scanner;

public class SumDigits {
 
    
	public static void main(String[] args) {
		// main method prints asks for input and prints out the result 
		Scanner in = new Scanner (System.in)	;
		System.out.println("Enter a whole number");//ask a user for a number
		long lg = in.nextLong();
		System.out.println("The sum of digits ("+lg+") will result in "+ getSum(lg));
	}
	
	
	//method calculates sum of digits
	public static int getSum(long lg) 
    {   //convert lg to int
		int number = (int)Math.abs(lg);
		int sum =0;
        while (number != 0) 
        {   
            sum +=number%10; 
            number= number/10; 
        }      
    return  sum; 
    }
	
}
