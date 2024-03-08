package Account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountTest {

    @Test
    public void test_Account_Is_Zero() {
        Account myAccount = new Account();
        assertEquals(0, myAccount.checkBalance("correctPin"));
    }

    @Test
    public void test_ThatMyAccountCanAcceptDeposit() {
        Account myAccount = new Account();
        myAccount.deposit(200);
        assertEquals(200, myAccount.checkBalance("correctPin"));
    }

    @Test
    public void test_ThatMyAccountWillNotAcceptNegativeValue() {
        Account myAccount = new Account();
        assertThrows(InvalidAmountException.class, ()-> myAccount.deposit(-200));
        assertEquals(0, myAccount.checkBalance("correctPin"));
    }

    @Test
    public void test_ThatMyAccountCanWithdraw() {
        Account myAccount = new Account();
        myAccount.deposit(500);
        myAccount.deposit(500);
        myAccount.withdraw(100);
        assertEquals(900, myAccount.checkBalance("correctPin"));
    }
    @Test
    public void test_ThatMyAccountWillNotDeductNegativeValue() {
        Account myAccount = new Account();
        myAccount.deposit(500);
        assertThrows(InsufficientFundsException.class, ()-> myAccount.withdraw(600));
        assertEquals(500, myAccount.checkBalance("correctPin"));
    }

    @Test
    public void test_ThatMyAccoutPinIsCorrect() {
        Account myAccount = new Account();
    }


}


//        @Test
//        public void test_Account_deposit() {
//            Account myAccount = new Account("don", 0, "5342", 63749397);
//            myAccount.deposit(200);
//            assertEquals(200, myAccount.getBalance());
//        }
//
//    @Test
//    public void test_Account_deposit_No_Negetive_Amount() {
//        Account myAccount = new Account("don", 0, "5342", 63749397);
//        assertThrows(InvalidAmountException.class, ()->myAccount.deposit(-200));
//        assertEquals(0, myAccount.getBalance());
//    }
//
//    @Test
//    public void test_Account_Can_WithDraw() {
//        Account myAccount = new Account("don", 0, "5342", 63749397);
//        myAccount.deposit(200);
//        myAccount.withdraw(100, "5342");
//        assertEquals(100, myAccount.getBalance());
//    }
//
//    @Test
//    public void test_Account_Can_Display_Balance(){
//        Account myAccount = new Account("don", 0, "5342",63749397);
//        myAccount.checkBalance("5342");
//
//
//    }
//
//}
