import java.util.Scanner;
import java.util.Random;

public class Hangman
{
    public static void main(String[] args)
    {
        Scanner keys = new Scanner(System.in);
        Random gen = new Random();
        String anwser1;
        int counter = 0;
        String game;
        int hangman;
        
        System.out.print("Welcome want to play a game of Hangman?(yes/no) ");
        game = keys.nextLine();
        if(game.equals("yes"))
        {
            hangman = gen.nextInt(7) + 1;
                if(hangman == 1)
                {
                    for(int j = 0; j < 16; j++)
                    {
                        String word1 = "advisory";
                        System.out.println("Type a letter. ");
                        anwser1 = keys.nextLine();
                        if(word1.contains(anwser1))
                        {
                        System.out.println("The word contains " + anwser1);
                        counter++;
                        }
                        else
                        {
                            System.out.println("I'm sorry the word does not contain that letter.");
                        }
                  
                        if(counter >= 8)
                        {
                            System.out.print("The anwser is " + word1);   
                            break;
                        }
                    }
                }
                if(hangman == 2)
                {
                    for(int j = 0; j < 16; j++)
                    {
                        String word2 = "keycards";
                        System.out.println("Type a letter ");
                        anwser1 = keys.nextLine();
                        if(word2.contains(anwser1))
                        {
                            System.out.println("The word contains " + anwser1);
                            counter++;
                        }
                        else
                        {
                            System.out.println("The word does not contain that letter.");
                        }
                        if(counter >= 8)
                        {
                            System.out.print("The Anwser is " + word2);
                            break;
                        }
                    }
                }
                if(hangman == 3)
                {
                    for(int j = 0; j < 16; j++)
                    {
                        String word3 = "RootBeer";
                        System.out.println("Type a letter ");
                        anwser1 = keys.nextLine();
                        if(word3.contains(anwser1))
                        {
                            System.out.println("The word contains " + anwser1);
                            counter++;
                        }
                        else
                        {
                            System.out.println("The word does not contain that letter.");
                        }
                        if(counter >= 8)
                        {
                            System.out.print("The anwser is " + word3);
                            break;
                        }
                    }
                }
                  
                if(hangman == 4)
                {
                    for(int j = 0; j < 16; j++)
                    {
                        String word4 = "radiomen";
                        System.out.println("Type a letter ");
                        anwser1 = keys.nextLine();
                        if(word4.contains(anwser1))
                        {
                            System.out.println("The word contains " + anwser1);
                            counter++;
                        }
                        else
                        {
                            System.out.println("I'm sorry the word does not contain that letter.");
                        }
                        if(counter >= 8)
                        {
                            System.out.println("The awnser is " + word4);
                            break;
                        }
                    }
                }
                if(hangman == 5)
                {
                    for(int j = 0; j < 16; j++)
                    {
                    String word5 = "ravenous";
                      System.out.println("Type a letter ");
                    anwser1 = keys.nextLine();
                    if(word5.contains(anwser1))
                    {
                       System.out.println("The word contains " + anwser1);
                       counter++;
                    }
                    else
                    {
                        System.out.println("I'm sorry the word does not contain that letter.");
                    }
                  
                    if(counter >= 8)
                    {
                        System.out.println("The anwser is " + word5);
                        break;
                    }
                    }
                }
                if(hangman == 6)
                {
                    for(int j = 0; j < 16; j++)
                    {
                    String word6 = "sanctify";
                    System.out.println("Type a letter ");
                    anwser1 = keys.nextLine();
                    if(word6.contains(anwser1))
                    {
                       System.out.println("The word contains " + anwser1);
                       counter++;
                    }
                    else
                    {
                        System.out.println("I'm sorry the word does not contain that letter.");
                    }
                  
                    if(counter >= 8)
                    {
                        System.out.println("The anwser is " + word6);
                        break;
                    }
                    }
                }
                if(hangman == 7)
                {
                    for(int j = 0; j < 16; j++)
                    {
                    String word7 = "sandwich";
                    System.out.println("Type a letter ");
                    anwser1 = keys.nextLine();
                    if(word7.contains(anwser1))
                    {
                       System.out.println("The word contains " + anwser1);
                       counter++;
                    }
                    else
                    {
                        System.out.println("I'm sorry the word does not contain that letter.");
                    }
                   
                    if(counter >= 8)
                    {
                        System.out.println("The awnser is " + word7);
                        break;
                    }
                    }
                }
                if(hangman == 8)
                {
                    for(int j = 0; j < 16; j++)
                    {
                    String word8 = "Absolute";
                    System.out.println("Type a letter ");
                    anwser1 = keys.nextLine();
                    if(word8.contains(anwser1))
                    {
                       System.out.println("The word contains " + anwser1);
                       counter++;
                    }
                    else
                    {
                        System.out.println("I'm sorry the word does not contain that letter.");
                    }
                   
                    if(counter >= 8)
                    {
                        System.out.println("The anwser is " + word8);
                        break;
                    }
                    }
                }

        }
    }
}