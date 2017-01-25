import java.util.Scanner;
import java.util.Random;

public class coinFlip
{
	public static void main(String[] args)
	{
		Scanner keys = new Scanner(System.in);
		Random gen = new Random();
		String choice;
		String coinChoice;
		int coinflip;
		int money = 10;
		int pay = 1;

		coinflip = gen.nextInt(2);

		System.out.println("Want to flip a coin for a dollar?(yes, no)");
		choice = keys.nextLine();
		if(choice.equals("yes"))
		{
			System.out.println("I will flip it, you call it");
			System.out.println("Heads or Tails?(heads, tails)");
			coinChoice = keys.nextLine();
					if(coinflip == 1)
					{
						if(coinChoice.equals("heads"))
						{
							System.out.println("Yes it was heads");
							money = money + 1;
							System.out.println("Your money is " + money);
						}
						else
						{
							System.out.println("No it was tails");
							money = money - 2;
							System.out.println("Your money is " + money);
						}
					}
					if(coinflip == 2)
					{
						if(coinChoice.equals("tails"))
						{
							System.out.println("Yes it was tails");
							money = money + 1;
							System.out.println("Your money is " + money);
						}
						else
						{
							System.out.println("No it was heads");
							money = money - 2;
							System.out.println("Your money is " + money);
						}
					}




			System.out.println("Want to play again?(yes, no)");

		}




	}
}