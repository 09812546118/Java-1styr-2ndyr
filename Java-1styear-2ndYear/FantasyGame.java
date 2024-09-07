/*
   Jude Saagundo BSIT-1C
*/
import java.util.Scanner;
public class FantasyGame {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String name;
		int strength;
		int health;
		int luck;
		int total;
		
      System.out.println("Welcome to Yertle's Quest");
		System.out.println("Enter the name of your character");
		name = scan.nextLine();
		System.out.println("Enter Strength: (0-10) ");
		strength = scan.nextInt();
		System.out.println("Enter Health: (0-10) ");
		health = scan.nextInt();
		System.out.println("Enter Luck: (0-10) ");
		luck = scan.nextInt();
		total = strength + health + luck;
		
      if(total >15)
         {
   			System.out.println("You have give your character too many points!  Default values have been assigned:");
   			System.out.println(name);
   			System.out.print("strength: 5, health: 5, luck: 5");
			}
		else 
         {
				System.out.println("The total for your game is " +total);
			}
		}
	}