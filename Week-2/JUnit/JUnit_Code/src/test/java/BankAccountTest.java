import org.example.BankAccount;
import org.example.InsufficientFundsException;
import org.junit.*;
import static org.junit.Assert.*;
public class BankAccountTest {
    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(100.00);
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testDeposit() {

        account.deposit(50.00);

        assertEquals(150.00, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() throws InsufficientFundsException {

        account.withdraw(50.00);

        assertEquals(50.00, account.getBalance(), 0.001);
    }

    @Test(expected = InsufficientFundsException.class)
    public void testWithdrawMoreThanBalance() throws InsufficientFundsException {

        account.withdraw(150.00);
    }

    @Test
    public void testInitialBalance() {

        assertEquals(100.00, account.getBalance(), 0.001);
    }
}