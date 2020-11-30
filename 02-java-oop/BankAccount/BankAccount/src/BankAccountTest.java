
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount a = new BankAccount("BankAccount #1", 100.0, 200.0);
		
		a.depositMons("savings", 140.00);
		a.depositMons("checking", 596.09);
		
		//Dan add some more functionality into this test folder before submitting

		
		System.out.println(a.checkingBalance);
		
		

	}

}
