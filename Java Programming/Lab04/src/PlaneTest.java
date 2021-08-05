class Plane{
	private String model;
	private int seats;
	static int planes = 0;
	
	//생성자, 데이터 안 받는 경우
	public Plane() {
		model = " ";
		seats = 0;
		planes++;
	}

	//생성자, 데이터 둘 다 받는 경우
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
		Plane a = new Plane("보잉 777", 200);
		Plane b = new Plane();
		Plane c = new Plane();
		
		b.setModel("에어버스 - A380");
		b.setSeats(500);
		c.setModel("보잉 737");
		c.setSeats(120);
		
		int n = a.getPlanes();
		System.out.println("전체 보유 비행기 수 = " + n);
		
		System.out.println("각 비행기 정보 출력");
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString()); 

	}

}
