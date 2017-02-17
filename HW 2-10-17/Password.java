import java.util.Scanner;
public class Password
{
    public static void main(String[] args)
    {
        Scanner keys = new Scanner(System.in);
        String password;
        String pass;
        Boolean Upper = false;
        Boolean Lower = false;
        Boolean digit = false;
        
        System.out.println("Want to see if your password matches our criteria?(yes/no)");
        pass = keys.nextLine();
        
        if(pass.equals("yes"))
        {
        
            System.out.print("Please enter a password: ");
            password = keys.nextLine();
        
            System.out.println("You password is " + password.length() + " characters long.");
            if(password.length() >= 6 && password.length() <= 12)
            {
                System.out.println("Your password is the right length.");
            }
            else
            {
                System.out.println("The password is not the right length.");
            }
            char[] letters = password.toCharArray();
            for(int i = 0; i < letters.length; i++)
            {
                if(Character.isDigit(letters[i]))
                {
                   digit = true;                
                    
                }
                if(Character.isUpperCase(letters[i]))
                {
                    Upper = true;
                }
                if(Character.isLowerCase(letters[i]))
                {
                    Lower = true;
                }
            }
            if(digit == false)
            {
                System.out.println("Your password needs a number.");
            }
            if(Upper == false)
            {
                System.out.println("Your password needs an upper case letter.");
            }
            if(Lower == false)
            {
                System.out.println("Your password needs a lower case letter.");
            }
            if(digit == true && Upper == true && Lower == true)
            {
                System.out.println("Your password meets all the criteria.");
            }
        }
 
    }
}