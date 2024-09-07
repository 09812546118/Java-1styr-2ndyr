/*
   Jude Saagundo
   BSIT - 1C
   Chapter 17
   Exercise 5 - Town Dump
*/

import java.util.Scanner;

public class TownDump
{
   public static void main(String[] args)
   {
      int weight, quotient, price = 20, extraCharge = 8, total;
      
      System.out.println("Enter weight(in pounds): ");
      Scanner in = new Scanner(System.in);
      weight = in.nextInt();
      
      if (weight <= 200) {
         System.out.println("\nWeight: " + weight);
         System.out.println("Amount Charge: $" + price);
      } else {
         quotient = weight / 100;
         total = ((quotient - 2) * extraCharge) + price;
         System.out.println("\nWeight: " + weight);
         System.out.println("Amount Charge: $" + total);
         
      }
   }
}