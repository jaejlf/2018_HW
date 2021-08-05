class Plane{
	private String model;
	private int seats;
	static int planes = 0;
	
	//������, ������ �� �޴� ���
	public Plane() {
		model = " ";
		seats = 0;
		planes++;
	}

	//������, ������ �� �� �޴� ���
	public Plane(String model, int seats) {
		this.model = model;
		this.seats = seats;
		planes++;
	}
	
	
	public String getModel() { return model; }
	public void setModel(String model) { this.model = model; }
	
	public int getSeats() { return seats; }
	public void setSeats(int seats) { this.seats = seats; }
	
	public int getPlanes() { return planes; }
	
	public String toString() { 
		return "[model = " + this.model + ", seats = " + this.seats + "]";
	}
}
public class PlaneTest {

	public static void main(String[] args) {
		Plane a = new Plane("���� 777", 200);
		Plane b = new Plane();
		Plane c = new Plane();
		
		b.setModel("������� - A380");
		b.setSeats(500);
		c.setModel("���� 737");
		c.setSeats(120);
		
		int n = a.getPlanes();
		System.out.println("��ü ���� ����� �� = " + n);
		
		System.out.println("�� ����� ���� ���");
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString()); 

	}

}
