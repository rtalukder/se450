public class ArrayList implements IList { 
	IIterator createIterator(){
		return new ArrayListIterator();
	}
} 
public class LinkedList implements IList { 
	IIterator createIterator(){
		return new LinkedListIterator();
	}
} 
public class ArrayListIterator implements IIterator { 

} 
public class LinkedListIterator implements IIterator { 

} 

public interface IList extends IIteratorFactory {}

public interface IIteratorFactory {
	IIterator createIterator();
}

public void someMethod(IList list){
	IIterator iterator = list.createIterator();
	
	
}