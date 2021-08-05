
public class Oval implements Shape {
	int width;
	int height;
	
	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {	
		return PI * (double)(width * height);
	}
	
	public void draw() {
		System.out.println(width + "X" + height + "�� �����ϴ� Ÿ���Դϴ�.");
	}
	

}
