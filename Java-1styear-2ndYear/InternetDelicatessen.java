/*
  Jude Saagundo
   BSIT - 1C
   Chapter 17
   Exercise 1 - Internet Delicatessen
*/

import java.util.Scanner;

public class InternetDelicatessen
{
   public static void main(String[] args)
   {
      String item;
      int expDelivery;
      double price, delivery, total;
      
      System.out.println("Enter the item: ");
      Scanner in = new Scanner(System.in);
      item = in.nextLine();
      
      System.out.println("Enter the price: ");
      price = in.nextDouble();
      
      System.out.println("Overnight delivery (0==no, 1==yes): ");
      expDelivery = in.nextInt();
      
      if (expDelivery == 1 && price > 10) {
         delivery = 0 + 3.00;
         total = price + delivery;
         
         System.out.println("\nInvoice: \n");
         System.out.println(item + "\t" + String.format("%.2f", price));
         
         System.out.println("delivery \t" + String.format("%.2f", delivery));
         
         System.out.println("total \t\t" + String.format("%.2f", total));
         
      } else if (expDelivery == 1 && price < 10) {
           delivery = 2.00 + 3.00;
         total = price + delivery;
         
         System.out.println("\nInvoice: \n");
         System.out.println(item + "\t" + String.format("%.2f", price));
         
         System.out.println("delivery \t" + String.format("%.2f", delivery));
         
         System.out.println("total \t\t" + String.format("%.2f", total));

      } else if (expDelivery == 0 && price > 10) {
         delivery = 0.00;
         total = price + delivery;
         
         System.out.println("\nInvoice: \n");
        System.out.println(item + "\t" + String.format("%.2f", price));
         
         System.out.println("delivery \t" + String.format("%.2f", delivery));
         
         System.out.println("total \t\t" + String.format("%.2f", total));

      } else {
         delivery = 2.00;
         total = price + delivery;
         
         System.out.println("\nInvoice: ");
         System.out.println(item + "\t" + String.format("%.2f", price));
         
         System.out.println("delivery \t" + String.format("%.2f", delivery));
         
         System.out.println("total \t\t" + String.format("%.2f", total));      }

   }
}