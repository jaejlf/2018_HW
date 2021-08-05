
public class Rect implements Shape {
	int width;
	int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return (double)(width * height);
	}
	
	public void draw() {
		System.out.println(width + "X" + height + "크기의 사각형 입니다.");
	}
}
