public interface IFileInfo { 
	int getSize(); 
	String getAuthor(); 
} 
public class FileInfo implements IFileInfo { 
	String fileName; // gets set in constructor 
	public int getSize() { 
		File file = openFile(fileName); 
		return file.getSize; 
	} 
	public String getAuthor() { 
		File file = openFile(fileName); 
		return file.getAuthor(); 
	}
}

public class FileInfoProxy implements IFileInfo {
	private FileInfo fileInfo;
	private int size = Integer.MIN_VALUE;
	private String author = null;
	
	public FileInfoProxy(String fileName){
		fileInfo = new FileInfo(fileName);
	}
	
	public int getSize(){
		if(size == Integer.MIN_VALUE){
			//size = fileInfo.getSize();
			File file = openFile(fileName); 
			size = file.getSize;
		}
		
		return size;
	}
	
	public String getAuthor(){
		if(author == null){
			author = fileInfo.getAuthor();
		
		return author;
	}
}

public class Client {
	public void method1(IFileInfo fileInfo){
		System.out.println(fileInfo.getSize());
	}
	
	public void method2(IFileInfo fileInfo, int numTimesToLoop){
		for(int i = 0; i < numTimesToLoop; i++){
			System.out.println(fileInfo.getSize());	
		}
	}
}






