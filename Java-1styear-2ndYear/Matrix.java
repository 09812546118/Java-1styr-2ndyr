/***
   A program that would accept an positive integer
   not greater than 10, display the corresponding
   multiplication table matrix
   example:
      input : 5 <- if correct inputted
      1  2  3  4  5
      2  4  6  8 10
      3  6  9 12 15
      4  8 12 16 20
      5 10 15 20 25
**/
public class Matrix{
   static public void main(String ...args){
      //display a prompt(is a message telling the user to input/enter something)
      System.out.print("Enter a positive integer:");
      try{
         int n=new java.util.Scanner(System.in).nextInt();
         //before processing, check condition
         if(n>0 && n<=10){ //if the condition is meet
         //display the multiplication matrix
         //using a nested-loop (a loop within a loop)
            for(int i=1;i<=n;i++){ //outer loop
               for(int j=1;j<=n;j++){//inner loop
                  //process and display the result value and display in a matrix format
                  System.out.printf("%4d",(i*j));
               }
               //display a newline
               System.out.println();
            }
         }
         else {
            System.out.println("Accept only values from 1 to 10");
         }
      }catch(Exception e){
         System.out.println("Input Error");
      }
   }//end of main method  
}//end of class