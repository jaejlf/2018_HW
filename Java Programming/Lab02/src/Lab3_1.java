class Dog{
	//�Ӽ� ���� ����
	String breed;
	int age;
	String color;
	
	//������ ����
	public Dog(String b, int a, String c) {
		breed = b;
		age = a;
		color = c;
	}
	
	
	//barking() �޼ҵ� ����
	void barking() {
		System.out.println("barking()");
	}
	
	//hungry() �޼ҵ� ����
	void hungry() {
		System.out.println("hungry()");
	}
	
	//sleeping() �޼ҵ� ����
	void sleeping() {
		System.out.println("sleeping()");
	}
	
	//��ü ������ ����ϴ� �޼ҵ� �ۼ�
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
