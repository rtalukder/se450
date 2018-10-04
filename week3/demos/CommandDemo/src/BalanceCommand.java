import java.io.IOException;

public class BalanceCommand implements ICommand {

	private BankAccount bankAccount;
	
	public BalanceCommand(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public void run() throws IOException {
		System.out.println(bankAccount.getBalance());
	}

}
