
public class ArrayList implements ICollection {
	int[] arr = new int[5];
    int currentSize = 0;
    public void add(int i) {
        if(currentSize >= arr.length) {
            growArray();
        }
        arr[currentSize++] = i;
    }

    private void growArray() {
        int[] tempArray = new int[currentSize * 2];
        System.arraycopy(arr, 0, tempArray, 0, arr.length);
        arr = tempArray;
    }

    public int get(int index) {
        if (index > currentSize)
            return 0;
        return arr[index];
    }

	@Override
	public IIterator getIterator() {
		return new ArrayListIterator(this);
	}
    
	class ArrayListIterator implements IIterator {
		private int currentIndex;
		private ArrayList list;
		
		public ArrayListIterator(ArrayList list) {
			this.list = list;
			currentIndex = 0;
		}
		
		@Override
		public boolean hasNext() {
			return currentIndex < list.currentSize;
		}
	
		@Override
		public int getNext() {
			int payload = list.get(currentIndex);
			currentIndex++;
			return payload;
		}
	
	}
}
