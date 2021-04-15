package LinkedList;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node{
		private Object data;
		private Node next;
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if(head.next == null)
		{
			tail = head;
		}
	}
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size == 0)
		{
			addFirst(input);
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	public void add(int k, Object input) {
		if(k == 0) {
			addFirst(input);
		}
		else if(k == size)
		{
			addLast(input);
		}
		else
		{
			Node newNode = new Node(input);
			Node x = node(k-1);
			Node y = node(k);
			x.next = newNode;
			newNode.next = y;
			size++;
		}
		
	}
	public Object removeFirst() {
		Node x = head;
		head = head.next;
		Object returnData = x.data;
		x = null;
		size--;
		return returnData;
		
	}
	public Object remove(int k) {
		if(k == 0)
		{
			return removeFirst();
		}
		else
		{
			Node curNode = node(k);
			Node preNode = node(k-1);
			Node temp = curNode;
			preNode.next = curNode.next;
			if(curNode == tail)
			{
				tail = preNode;
			}
			curNode = null;
			size--;
			return temp;
		}
	}
	public Object removeLast() {
		return remove(size-1);
	}
	public int size() {
		return size;
	}
	public Object get(int k) {
		Node x = node(k);
		return x.data;
	}
	public int indexOf(Object data) {
		Node x = head;
		int index = 0;
		while(x.data != data)
		{
			x = x.next;
			index += 1;
			if(x == null)
			{
				return -1;
			}
		}
		return index;
	}
	public Node node(int index) {
		Node x = head;
		for(int i = 0; i < index; i++)
		{
			x = x.next;
		}
		return x;
	}
	public String toString() {
		if(head == null)
		{
			return "[]";
		}
		Node temp = head;
		String str = "[";
		
		while(temp.next != null)
		{
			str += temp.data + ", ";
			temp = temp.next;
		}
		str += temp.data;
		return str + "]";
	}
	
	
	public ListIterator listIterator() {
		return new ListIterator();
	}
	public class ListIterator {
		private Node next;
		private Node lastReturned;
		private int nextIndex;
		
		ListIterator(){
			next = head;
		}
		public Object next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;
			
			return lastReturned.data;
		}
		public boolean hasNext() {
			return nextIndex < size();
		}
		
	}
	

}
