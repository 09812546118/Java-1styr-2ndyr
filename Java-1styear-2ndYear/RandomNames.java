/*
 Jude Saagundo
 BSIT 1-C
 Chapter 34
 Exercise 1
 */   

import java.util.Scanner;
import java.util.Random;

public class RandomNames
{
   public static void main(String[] args)
   {
      
      int firstName, lastName;
      
      Scanner sc = new Scanner(System.in);
      
      
      System.out.print("Enter random number First Name (1-12): ");
      firstName = sc.nextInt();
      System.out.print("Enter random number for Last Name (1-12): ");
      lastName = sc.nextInt();
      System.out.println("");
      System.out.print("Your generated name: ");


      switch (firstName)
      {
         case 1: 
            System.out.print("Joshua ");
            break;
         case 2: 
            System.out.print("James ");
            break;
         case 3: 
            System.out.print("Daniel ");
            break;
         case 4: 
            System.out.print("Direck ");
            break;
         case 5: 
            System.out.print("Mark ");
            break;
         case 6: 
            System.out.print("Rodrigo ");
            break;
         case 7: 
            System.out.print("Michael ");
            break;
         case 8: 
            System.out.print("Mike ");
            break;
         case 9: 
            System.out.print("Leni ");
            break;
         case 10: 
            System.out.print("Raymond ");
            break;
         case 11: 
            System.out.print("Manny ");
            break;
         case 12: 
            System.out.print("Bongbong ");
            break;
         default:
            System.out.print("Invalid Number ");

      }

      switch (lastName) 
      {
         case 1: 
            System.out.println("Garcia");
            break;
         case 2: 
            System.out.println("Reid");
            break;
         case 3: 
            System.out.println("Padilla");
            break;
         case 4: 
            System.out.println("Abella");
            break;
         case 5: 
            System.out.println("Rama");
            break;
         case 6: 
            System.out.println("Garcia");
            break;
         case 7: 
            System.out.println("Padilla");
            break;
         case 8: 
            System.out.println("Miles");
            break;
         case 9: 
            System.out.println("Duterte");
            break;
         case 10: 
            System.out.println("Leo");
            break;
         case 11: 
            System.out.println("Ponsica");
            break;
         case 12: 
            System.out.println("Espanol");
            break;
         default:
            System.out.println("Invalid Number");
      }
   }
}