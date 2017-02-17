/******************************************************************************************************
* Programmer: Ryan J. Dross
* Date: 2/15/17
* Program: File Counter
* Class: Programming in Java II
* Teacher: Mike Dalton
* Version: 1.0
* Description: Asks the users for a file and a term and counts how many times that term is in that file
*******************************************************************************************************/

import java.io.File;
import java.util.Scanner;

public class FileCounter
{
	public static void main(String[] args) throws Exception
	{
		Scanner keys = new Scanner(System.in);
		String choice;

		System.out.println("Welcome to File Counter!");
		System.out.print("Would you like to count the number of times a term of your choice is in a text file?(yes/no) ");
		choice = keys.nextLine();

		if(choice.equals("yes"))
		{
			System.out.print("Please enter a name for your file: ");
			String fileName = keys.nextLine();
			File lepp = new File(fileName);
			Scanner scans = new Scanner(lepp);
			String add = "";

			System.out.print("Please enter a term: ");
			String term = keys.nextLine();
			term = term.toLowerCase();

			int count = 0;
			int find = 0;

			while(scans.hasNextLine())
			{
				add = add + scans.nextLine() + "\n";
				add = add.toLowerCase();
			}

			find = add.indexOf(term);

			while(find > -1)
			{
				count++;
				find = add.indexOf(term, find + 1);
			}

			System.out.println("The term " + term + " " + "appears " + count + " " + "times.");
		}

	}
}