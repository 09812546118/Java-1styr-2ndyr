/*
  Jude Saagundo
   BSIT - 1C
   Chapter 17
   Exercise 3 - Microwave Oven Heating Time
*/

import java.util.Scanner;

class MicrowaveOven

{

  public static void main(String[] args)

  {
    double percent;
    int numItems;
    int heatingTime; 
    int minutes, seconds;
    int quotient, modulo;

    Scanner in = new Scanner(System.in);

    System.out.println("How many items to heat: ");
    numItems = in.nextInt();

    System.out.println("Time for one item: ");
    heatingTime = in.nextInt();

    if (numItems == 1)

    {
      minutes = heatingTime / 100;
      seconds = heatingTime%100;
      System.out.println("Heat for: " + minutes + " minutes " + seconds + " seconds");
      
    } else if (numItems == 2) {
      percent = heatingTime / 2;
      heatingTime += percent;
      minutes = heatingTime / 100;
      seconds = heatingTime%100;
      System.out.println("Heat for: " + minutes + " minutes " + seconds + " seconds");
      
    } else if (numItems == 3) {
      heatingTime *= 2;
      minutes = heatingTime / 100;
      seconds = heatingTime%100;
      System.out.println("Heat for: " + minutes + " minutes " + seconds + " seconds");
      
    } else {
      System.out.println("Heating more than 3 items is not recommended.");
    }

  }

}
