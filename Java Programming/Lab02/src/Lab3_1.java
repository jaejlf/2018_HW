class Dog{
	//속성 변수 선언
	String breed;
	int age;
	String color;
	
	//생성자 정의
	public Dog(String b, int a, String c) {
		breed = b;
		age = a;
		color = c;
	}
	
	
	//barking() 메소드 정의
	void barking() {
		System.out.println("barking()");
	}
	
	//hungry() 메소드 정의
	void hungry() {
		System.out.println("hungry()");
	}
	
	//sleeping() 메소드 정의
	void sleeping() {
		System.out.println("sleeping()");
	}
	
	//객체 정보를 출력하는 메소드 작성
	public void Print(String b, int a, String c) {
		System.out.println("(" + b + "," + a + "," + c + ")");
	}
}
public class Lab3_1 {

	public static void main(String[] args) {
		
		Dog obj = new Dog("yolk", 1, "orange");

		obj.Print(obj.breed, obj.age, obj.color);
		obj.barking();
		obj.hungry();
		obj.sleeping();

	}

}
