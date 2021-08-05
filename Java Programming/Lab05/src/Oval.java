
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
		System.out.println(width + "X" + height + "에 내접하는 타원입니다.");
	}
	

}
