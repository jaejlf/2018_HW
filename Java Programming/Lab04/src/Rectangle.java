
public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	//�簢�� ����
	int square() { return width * height; }
	
	//��ǥ, ���� ���
	void show() { System.out.println("(" + x + "," + y + ")���� ũ�Ⱑ " + width + "X" + height + "�� �簢��"); }
	
	//contains
	boolean contains(Rectangle r) {
		if(this.x + this.width > r.x + r.width) {
			if(this.y + this.height > r.y + r.height) return true;
			else return false;
		} else return false;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}

}
