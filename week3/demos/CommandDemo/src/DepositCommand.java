import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DepositCommand implements ICommand, IUndoable {

	private final BankAccount bankAccount;
	private final BufferedReader br;
	private int depositAmount;
	
	public DepositCommand(BankAccount bankAccount, BufferedReader br) {
		this.bankAccount = bankAccount;
		this.br = br;
	}

	@Override
	public void run() throws IOException {
		System.out.println("How much would you like to deposit?");
		
		String input = br.readLine();
		depositAmount = Integer.parseInt(input);
		
		bankAccount.deposit(depositAmount);
		
		CommandHistory.add(this);
	}

	@Override
	public void undo() {
		bankAccount.withdraw(depositAmount);
	}

	@Override
	public void redo() {
		bankAccount.deposit(depositAmount);
	}

}
