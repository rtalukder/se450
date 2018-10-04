import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WithdrawCommand implements ICommand, IUndoable {
	
	private final BankAccount bankAccount;
	private final BufferedReader br;
	private int withdrawAmount;
	
	public WithdrawCommand(BankAccount bankAccount, BufferedReader br) {
		this.bankAccount = bankAccount;
		this.br = br;
	}

	@Override
	public void run() throws IOException {
		System.out.println("How much would you like to withdraw?");
		
		String input = br.readLine();
		withdrawAmount = Integer.parseInt(input);
		
		bankAccount.withdraw(withdrawAmount);
		
		CommandHistory.add(this);
	}

	@Override
	public void undo() {
		bankAccount.deposit(withdrawAmount);
	}

	@Override
	public void redo() {
		bankAccount.withdraw(withdrawAmount);
	}

}
