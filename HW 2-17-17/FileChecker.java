/********************************************************************************************
* Programmer: Ryan J. Dross
* Date: 2/15/17
* Program: File Checker
* Class: Programming in Java II
* Teacher: Mike Dalton
* Version: 1.0
* Description: Asks the users for a file and a term and sees if thet file contains that term
********************************************************************************************/

import java.io.File;
import java.util.Scanner;

public class FileChecker
{
	public static void main(String[] args) throws Exception
	{
		Scanner keys = new Scanner(System.in);
		String choice;

		System.out.println("Welcome to File Checker!");
		System.out.print("Would you like to check text files for specific terms?(yes/no) ");
		choice = keys.nextLine();

		if(choice.equals("yes"))
		{
			System.out.print("Please enter a name for your file: ");
			String fileName = keys.nextLine();
			File lepp = new File(fileName);
			Scanner scans = new Scanner(lepp);
			System.out.print("Please enter a term to search: ");
			String term = keys.nextLine();
			String add = "";

			while(scans.hasNextLine())
			{
				add = add + scans.nextLine() + "\n";
			}

			if(add.contains(term))
			{
				System.out.println("The file " + fileName + " " +  "contains the term " + term);
			}
			else
			{
				System.out.println("I'm sorry that text file does not contain that term");
			}
		}



	}
}