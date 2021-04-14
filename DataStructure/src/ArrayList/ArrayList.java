package ArrayList;

public class ArrayList {
	// element�� ��� ���Դ��� Ȯ���ϱ� ���� ���� ������ size�� 0���� �����Ѵ�.
	private int size = 0;
	private Object[] elementData = new Object[100];
	// elementData��� ����� �����ڸ� ���� ������ Object��ü�� �̿��Ͽ� ����ڴ�. << ũ�Ⱑ 100���� ����������.
	
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
			return elementData[--nextIndex]; // Error�� ���� �ʰ��ϱ� ���� ���� index���� 1 �� ���� ��Ű�� �����Ѵ�
			
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
