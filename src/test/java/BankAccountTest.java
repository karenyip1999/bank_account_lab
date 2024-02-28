import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test
    public void canReturnGetFirstName()
    {
        BankAccount bankAccount = new BankAccount("Karen", "Yip", "12/12/24", 0, 0);
        String expectedAnswer = "Karen";
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo(expectedAnswer);
    }

    @Test
    public void canReturnSetFirstName()
    {
        BankAccount bankAccount = new BankAccount("Karen", "Yip", "12/12/24", 0, 0);
        String expectedAnswer = "Jane";
        bankAccount.setFirstName("Jane");
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo(expectedAnswer);
    }

    @Test
    public void canReturnGetLastName()
    {
        BankAccount bankAccount = new BankAccount("Karen", "Yip", "12/12/24", 0, 0);
        String expectedAnswer = "Yip";
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo(expectedAnswer);
    }

    @Test
    public void canReturnSetLastName()
    {
        BankAccount bankAccount = new BankAccount("Karen", "Yip", "12/12/24", 0, 0);
        String expectedAnswer = "Smith";
        bankAccount.setLastName("Smith");
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo(expectedAnswer);
    }

    @Test
    public void canReturnGetDateOfBirth()
    {
        BankAccount bankAccount = new BankAccount("Karen", "Yip", "12/12/24", 0, 0);
        String expectedAnswer = "12/12/24";
        String result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo(expectedAnswer);
    }

    @Test
    public void canReturnSetDateOfBirth()
    {
        BankAccount bankAccount = new BankAccount("Karen", "Yip", "12/12/24", 0, 0);
        String expectedAnswer = "12/2/20";
        bankAccount.setDateOfBirth("12/2/20");
        String result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo(expectedAnswer);
    }

    @Test
    public void canReturnGetAccountNumber()
    {
        BankAccount bankAccount = new BankAccount("Karen", "Yip", "12/12/24", 0, 0);
        int expectedAnswer = 0;
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(expectedAnswer);
    }

    @Test
    public void canReturnSetAccountNumber()
    {
        BankAccount bankAccount = new BankAccount("Karen", "Yip", "12/12/24", 0, 0);
        int expectedAnswer = 135;
        bankAccount.setAccountNumber(135);
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(expectedAnswer);
    }

    @Test
    public void canReturnGetBalance()
    {
        BankAccount bankAccount = new BankAccount("Karen", "Yip", "12/12/24", 0, 0);
        int expectedAnswer = 0;
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(expectedAnswer);
    }

    @Test
    public void canReturnSetBalance()
    {
        BankAccount bankAccount = new BankAccount("Karen", "Yip", "12/12/24", 0, 0);
        int expectedAnswer = 135;
        bankAccount.setBalance(135);
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(expectedAnswer);
    }

    @Test
    public void canReturnDeposit()
    {
        BankAccount bankaccount = new BankAccount("Karen", "Yip", "12/12/24", 0, 0);
        int expectedAnswer = 100;
        bankaccount.deposit(100);
        int actual = bankaccount.getBalance();
        assertThat(actual).isEqualTo(expectedAnswer);
    }

    @Test
    public void canReturnWithdrawl()
    {
        BankAccount bankaccount = new BankAccount("Karen", "Yip", "12/12/24", 0, 100);
        int expectedAnswer = 50;
        bankaccount.withdrawal(50);
        int actual = bankaccount.getBalance();
        assertThat(actual).isEqualTo(expectedAnswer);
    }


    @Test
    public void canReturnInterest()
    {
        BankAccount bankaccount = new BankAccount("Karen", "Yip", "12/12/24", 0, 100);
        int expectedAnswer = 200;
        bankaccount.interest();
        int actual = bankaccount.getBalance();
        assertThat(actual).isEqualTo(expectedAnswer);
    }
}