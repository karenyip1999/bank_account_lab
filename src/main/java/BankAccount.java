public class BankAccount {
    //Attributes
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber = 0;
    private int balance = 0;

    public BankAccount(String insertFirstName, String insertLastname, String insertDateOfBirth, int insertAccountNumber, int insertBalance)
    {
        this.firstName = insertFirstName;
        this.lastName = insertLastname;
        this.dateOfBirth = insertDateOfBirth;
        this.accountNumber = insertAccountNumber;
        this.balance = insertBalance;
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

    //Deposit method
    public void deposit(int amount)
    {
        balance = balance + amount;
    }

    //Withdrawal method
    public void withdrawal(int amount)
    {
        balance = balance - amount;
    }
    






}
