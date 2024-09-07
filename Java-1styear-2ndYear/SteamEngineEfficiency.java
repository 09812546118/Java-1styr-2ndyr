/*
   Jude Saagundo
   BSIT - 1C
   Chapter 17
   Exercise 2 - Steam Engine Efficiency
*/

import java.util.Scanner;

public class SteamEngineEfficiency
{
   public static void main(String[] args)
   {
      double Tair, Tsteam, efficiency;
           
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter air temperature: ");
      Tair = in.nextDouble();
      
      System.out.println("Enter steam temperature: ");
      Tsteam = in.nextDouble();
      
      if (Tsteam < 373) {
         System.out.println("Steam Engine Efficiency: Zero");
      } else {
         efficiency = 1 - Tair / Tsteam;
         System.out.println("Steam Engine Efficiency: " + efficiency);
         
      }

   }
}
