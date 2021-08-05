
public class Circle implements Shape{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI * (double)(radius * radius);
	}
	
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
}
