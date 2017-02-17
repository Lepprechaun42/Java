import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args)
    {
     Scanner keys = new Scanner(System.in);
     String Sentence1;
     String Sentence2;
     Boolean anagram = true;
     
     System.out.print("Please enter a sentence: ");
     Sentence1 = keys.nextLine();
     Sentence1 = Sentence1.toLowerCase();
     
     System.out.print("Please enter another sentence: ");
     Sentence2 = keys.nextLine();
     Sentence2 = Sentence2.toLowerCase();
     
     char [] letters = Sentence1.toCharArray();
     for(int i = 0; i < letters.length; i++)
     {
         String alphabet = letters[i] + "";
         if(Sentence2.contains(alphabet))
         {
             System.out.println("Checking.......");
         }
         else
         {
             System.out.print("They are not anagrams.");
             anagram = false;
             break;
         }
     }
     if(anagram == true)
     {
         System.out.print("They are anagrams.");
     }
    }
    
}