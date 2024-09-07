import java.util.Scanner;

public class AccountTest {
   public static void main(String...args) {
      Account myAccount = new Account();
      Scanner in = new Scanner(System.in);
      String[] labels = { "Balance", "Enter amount to be deposited: ", "Enter amount to be withdrawn: " };
      int choice = 0;
      double amount = 0;
      String input = "";
      
      System.out.print("What is your name? : ");
      myAccount.accountOwnerName = in.nextLine();
      
      do {
         try {
            System.out.println("[1=\"Show Balance\", 2=\"Deposit\", 3=\"Withdraw\"]");
            System.out.print("What would you like to do? : ");
            choice = Integer.parseInt(in.next());
            
            if (choice < 0 || choice > 3) throw new Exception("sheeeeesh!");
            
            if (choice == 1) {
               System.out.println(myAccount.getBalance());
            } else {
               System.out.print(labels[choice - 1]);
               amount = Double.parseDouble(in.next());
               
               if (choice == 2)
                  myAccount.deposit(amount);
               else
                  myAccount.withdraw(amount);
            }
         } catch (Exception ex) {
            System.out.println("Invalid Input!");
         }
         
         System.out.println("Would you like to do another transaction? : ");
         
         input = in.next().toLowerCase();
      } while(input.equals("yes") || input.equals("y"));
      
      System.out.println("Thank you for using our system " + myAccount.accountOwnerName + ". Until next time!");
   }
}