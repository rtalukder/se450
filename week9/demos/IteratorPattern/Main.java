public class Main {

	public static void main(String[] args) {
		ICollection linkedList = new LinkedList();
        for(int i = 1; i <= 10; i++) {
            linkedList.add(i);
        }

        ICollection arrayList = new ArrayList();
        for(int i = 1; i <= 10; i++) {
        	arrayList.add(i);
        }

        // Find algorithm for ArrayList
        find5(arrayList);
       
        // Find algorithm for LinkedList
        find5(linkedList);
        
	}
	
	public static void find5(ICollection iteratorFactory) {
		IIterator iterator = iteratorFactory.getIterator();
		while (iterator.hasNext()){
            if (iterator.getNext() == 5) {
                System.out.println("Found!");
                break;
            }
        }
	}

}
