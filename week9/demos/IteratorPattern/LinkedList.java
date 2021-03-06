public class LinkedList implements ICollection {
	public LinkedListNode head;

    public void add(int i) {
    	LinkedListNode oldHead = head;
        head = new LinkedListNode();
        head.payload = i;
        head.next = oldHead;
    }

	@Override
	public IIterator getIterator() {
		return new LinkedListIterator(this);
	}
    
    class LinkedListIterator implements IIterator {
    	
    	private LinkedListNode current;
    	
    	public LinkedListIterator(LinkedList list) {
    		current = list.head;
    	}
    	
    	@Override
    	public boolean hasNext() {
    		return current != null;
    	}

    	@Override
    	public int getNext() {
    		int payload = current.payload;
    		current = current.next;
    		return payload;
    	}
    }
}
