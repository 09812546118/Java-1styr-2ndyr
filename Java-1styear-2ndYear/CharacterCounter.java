/*
 Jude Saagundo
 BSIT 1-C
 Chapter 34
 Exercise 1
 */   

import java.util.Scanner;
import java.lang.Character;

public class CharacterCounter 
{
   public static void main (String[] args)
   {
		String inputWords;
   		int vowels = 0, consonants = 0, punctuations = 0, line = 0, spaces = 0, ch;
   		boolean lowerVowels, upperVowels;
		Scanner ask = new Scanner(System.in);
      
      
      System.out.print("Enter some words/phrase: ");
		inputWords = ask.nextLine();
      
      for(int i=0; i < inputWords.length();i++) 
      {
			ch = inputWords.charAt(i);
			lowerVowels = (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u');
		    upperVowels = (ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U');
      
            line = (lowerVowels || upperVowels) ? 1 : (Character.isLetter(ch)) ? 2 : 0;
       
     switch(line)
     {
				case 1:
					vowels++; break;
				case 2:
					consonants++; break;
				default: 
					line = (Character.isDigit(inputWords.charAt(i))) ? 
                  3 : (Character.isSpaceChar(inputWords.charAt(i))) ? 1 : 0;
		switch(line) 
      {
						case 1:
							spaces++; break;
						case 0:
							punctuations++; break;
						default: 
					}
           }
       }
  
             System.out.println("Vowels: " + vowels);
             System.out.println("Consonants: " + consonants);
             System.out.println("Punctuations: " + punctuations);
             System.out.println("White spaces: " + spaces);
             
      
   }
}
