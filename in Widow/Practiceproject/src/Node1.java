
public class Node1 {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Node1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Node1 getCenter(Node1 other) {
		return new Node1((getX() + other.getX()) / 2, (getY() + other.getY()) / 2);
		
		
	}
	
}

