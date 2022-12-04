import java.util.ArrayList;
//define a class MeasurableTester
public class MeasurableTester
{
    //define main method
    public static void main(String[] args)
    {
//create an array list accounts
        ArrayList<BankAccount> accounts = new ArrayList<>();
//add elements to accounts
        accounts.add(new BankAccount(0));
        accounts.add(new BankAccount(10000));
        accounts.add(new BankAccount(2000));
//create the variable of BankAccount
        BankAccount largestAccount = Measurable.largest(accounts);
//print the largest balance
        System.out.println("Largest balance is : " + largestAccount.getBalance());
//print the expected value
        System.out.println("Expected: 10000");
//create an array list countries
        ArrayList<Country> countries = new ArrayList<>();
//add elements to contries
        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 513120));
        countries.add(new Country("Belgium", 30510));
//create the variable of Country
        Country largestCountry = Measurable.largest(countries);
//print the largest area
        System.out.println("Largest area: " + largestCountry.getArea());
//print the expected value
        System.out.println("Expected: 513120");
//print the country name
        System.out.println("Country name: " + largestCountry.getName());
//print the expected value
        System.out.println("Expected: Thailand");
    }
}
