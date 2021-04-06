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
	public boolean remove(int index) {
		for(int i = index + 1; i < size; i++)
		{
			elementData[i-1] = elementData[i];
		}
		size--;
		return true;
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
