package ArrayList;

public class ArrayList {
	// element가 몇개나 들어왔는지 확인하기 위한 내부 변수인 size는 0부터 시작한다.
	private int size = 0;
	private Object[] elementData = new Object[100];
	// elementData라는 비공개 접근자를 갖는 변수를 Object객체를 이용하여 만들겠다. << 크기가 100개로 정해져있음.
	
	public boolean addFirst(Object element) {
		for(int i = size; i > 0; i--)
		{
			elementData[i] = elementData[i-1];
		}
		elementData[0] = element;
		
		return true;
	}
	
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	public boolean add(int index, Object element) {
		if(size == 0) {
			elementData[size] = element;
			size++;
		}
		else {
			for(int i = size; i > index; i--)
			{
				elementData[i] = elementData[i-1];
			}
			elementData[index] = element;
			size++;
		}
		return true;	
	}
	public Object remove(int index) {
		Object removed = elementData[index];
		for(int i = index + 1; i < size; i++)
		{
			elementData[i-1] = elementData[i];
		}
		size--;
		elementData[size] = null;
		return removed;
	}
	public Object removeFirst() {
		return remove(0);
	}
	public Object removeLast() {
		return remove(size-1);
	}
	
	public Object get(int index) {
		return elementData[index];
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf(Object element) {
		for(int i = 0; i < size; i++)
		{
			if(elementData[i] == element)
			{
				return i;
			}
		}
		return -1;
		
	}
	
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	class ListIterator{
		private int nextIndex = 0;
		public Object next() {
//			Object returnData = elementData[nextIndex];
//			nextIndex++;
//			return returnData;
			return elementData[nextIndex++];
		}
		
		public boolean hasNext() {
			
			return nextIndex < size();
		}
		public Object previous() {
			return elementData[--nextIndex]; // Error를 내지 않게하기 위해 먼저 index값을 1 을 감소 시키고 리턴한다
			
		}
		public boolean hasPrevious() {
			return nextIndex > 0;
		}
		public void add(Object element) {
			ArrayList.this.add(nextIndex++, element);
		}
		public void remove() {
			ArrayList.this.remove(nextIndex-1);
			nextIndex--;
		}
	}
	
	
	public String toString(){
		String str = "[";
		for(int i = 0; i < size; i++)
		{
			str += elementData[i];
			if(i < size - 1)
			{
				str += ", ";
			}
		}
		return str + "]";
	}
	
	
}
