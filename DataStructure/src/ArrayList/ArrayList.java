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
