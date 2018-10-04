import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		System.out.println("Welcome to Jeffrey Sharpe's \'Super-legit\' Bank");
		System.out.println("This ATM offers the following options:");
		System.out.println("Withdraw");
		System.out.println("Deposit");
		System.out.println("Balance");
		System.out.println("Undo");
		System.out.println("Redo");
		System.out.println("Exit");
		System.out.println("What would you like to do?");
		
		BankAccount account = new BankAccount();
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(!(input = br.readLine()).toLowerCase().equals("exit")) {
        	ICommand command = null;
        	
        	switch(input.toLowerCase()) {
        	case "withdraw":
        		command = new WithdrawCommand(account, br);
        		break;
        	case "deposit":
        		command = new DepositCommand(account, br);
        		break;
        	case "balance":
        		command = new BalanceCommand(account);
        		break;
        	case "undo":
        		command = new UndoCommand();
        		break;
        	case "redo":
        		command = new RedoCommand();
        		break;
        	}
        	
        	command.run();
        }
	}
}
