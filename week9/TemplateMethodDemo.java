public abstract class PersonInformationTransmitter { 
	protected int id; 
	protected String name; 
	protected Date birthday; 
	public void transmitData(){ 
		Connection conn = new Connection("www.url.com"); 
		conn.send(getDataToTransmit());
		conn.close(); 
	} 
	
	public abstract String getDataToTransmit();
}

public class IdInformationTransmitter extends PersonInformationTransmitter {
	public String getDataToTransmit(){
		return id.toString();
	}
}

public class NameInformationTransmitter extends PersonInformationTransmitter {
	public String getDataToTransmit(){
		return name;
	}
}

public class BirthdayInformationTransmitter extends PersonInformationTransmitter {
	public String getDataToTransmit(){
		return birthday.toString();
	}
}
