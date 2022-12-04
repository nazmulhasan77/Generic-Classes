public class BankAccount implements Measurable<BankAccount>
{
    //define the class member balance
    private double balance;
    //define the consrtructor BankAccount
    public BankAccount(double initial)
    {
//set the value of balance
        balance = initial;
    }
    //define a method deposit()
    public void deposit(double amt)
    {
//set the balance
        balance += amt;
    }
    //define the method withdraw()
    public void withdraw(double amt)
    {
//set the balance
        balance -= amt;
    }
    //define the method getBalance()
    public double getBalance()
    {
//return the value of balance
        return balance;
    }
    //define the method getMeasure()
    public double getMeasure()
    {
//return the value of balance
        return balance;
    }
}
