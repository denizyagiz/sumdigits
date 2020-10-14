

import java.util.Scanner;

public class SumDigits {

   public static void main(String[] args) {
   
      // Create a Scanner object
      Scanner input = new Scanner(System.in);
   
      // Prompt the user to enter an integer number 
      System.out.print("Enter an integer number between 0 and 9999: ");
      int inputNumber = input.nextInt();
   
      // Get the 4th digit
      int fourthDigit = inputNumber % 10;
      int remainingNumber = inputNumber / 10;
   
      // Get the 3rd digit
      int thirdDigit = remainingNumber % 10;
      remainingNumber = remainingNumber / 10;
   
      // Get the 2nd digit 
      int secondDigit = remainingNumber % 10;
      remainingNumber = remainingNumber / 10;
   
      // Get the 1st digit 
      int firstDigit = remainingNumber % 10;
      
      // Compute the sum of digits
      int sum = fourthDigit + thirdDigit + secondDigit + firstDigit;
   
      //Display results
      System.out.println("The input number is:\t " + inputNumber);
      System.out.println("The sum of digits is: " + sum);
   } 
}