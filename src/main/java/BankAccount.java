//import org.junit.jupiter.api.Test;
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccount {
    //Attributes
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber = 0;
    private int balance = 0;

    public BankAccount()
    {

    }

    //GET first name
    public String getFirstName()
    {
        return this.firstName;
    }

    //SET first name
    public void setFirstName(String newFirstName)
    {
        this.firstName = newFirstName;
    }

    //GET last name
    public String getLastName()
    {
        return this.lastName;
    }

    //SET last name
    public void setLastName(String newLastName)
    {
        this.lastName = newLastName;
    }

    //GET date of birth
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    //SET date of birth
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //GET account number
    public int getAccountNumber() {
        return accountNumber;
    }

    //SET account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //GET Balance
    public int getBalance() {
        return balance;
    }

    //SET balance
    public void setBalance(int balance) {
        this.balance = balance;
    }









}
