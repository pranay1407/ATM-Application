import java.util.Scanner;

public class Atm
{
    int accNum;
    int pw;
    public void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly..! Enter the Account Number..!");
        accNum=scan.nextInt();
        System.out.println("Kindly..! Enter the Password..!");
        pw=scan.nextInt();
    }
    public void verify() throws InvalidUserException
    {
        int password = 2222;
        int accountNumber = 1234;
        if (accountNumber ==accNum && password == pw)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Kindly..! Enter the Amount required..!");
            int amount = scan.nextInt();
            System.out.println("Collect your cash.."+amount);
        }
        else
        {
            throw new InvalidUserException("Wrong credential");


        }
    }

}
