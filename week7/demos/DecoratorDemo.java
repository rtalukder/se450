public interface IMessage { 
	String getMessage(); 
} 
public class EmailMessage implements IMessage { 
	public String getMessage(){ 
		// implementation 
	} 
} 
public class SmsMessage implements IMessage { 
	public String getMessage(){ 
		// implementation 
	} 
} 
public class Processor { 
	private MessageWriter messageWriter; 
	void process(IMessage message) { 
		// Create stream 			
		 messageWriter.writeMessageToStream(message, stream); 
		// Destroy Stream 
	} 
} 

public interface IMessageDecorator extends IMessage {
	
}

public class EncryptedMessage implements IMessageDecorator {
	private IMessage message;
	
	public EncryptedMessage(IMessage message) {
		this.message = message;
	}
	
	public String getMessage() {
		String message = message.getMessage();
		String encryptedMessage = encryptMessage(message);
		return encryptedMessage;
	}
}

public class LoggedMessage implements IMessageDecorator {
	private IMessage message;
	
	public LoggedMessage(IMessage message) {
		this.message = message;
	}
	
	public String getMessage() {
		String message = message.getMessage();
		log(message);
		return message;
	}
}

public static void main(String[] args){
	IMessage m = new SmsMessage();
	m = new EmailMessage();
	
	m = new EncryptedMessage(new EmailMessage());
	
	m = new LoggedMessage(new SmsMessage());
	m = new EncryptedMessage(new SmsMessage());
	m = new LoggedMessage(new EncryptedMessage(new SmsMessage()));
	
	Processor processor = new Processor();
	processor.process(m);
}








