public class Bank
{
    public void initiate() {
        System.out.println("Welcome to Bank..!");
        Atm atm = new Atm();
        try {
            atm.input();
            atm.verify();
        }
        catch (InvalidUserException e)
        {
            System.out.println(e.getMessage());
            try {
                atm.input();
                atm.verify();
            }
            catch (InvalidUserException iue)
            {
                System.out.println(iue.getMessage());
                try {
                    atm.input();
                    atm.verify();
                }
                catch (InvalidUserException iue1)
                {
                    System.out.println(iue1.getMessage());
                    System.out.println("You miss 3 chance..! Atm Blocked..!");
                }
            }
        }
    }
}
