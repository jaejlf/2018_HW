
public class Customer extends Person{
	private int id;
	private int mileage;
	
	public Customer(int id, int mileage, String name, String address, String call) {
		super(name, address, call);
		this.id = id;
		this.mileage = mileage;	
	}
	
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	
	public int getMileage() { return mileage; }
	public void setMileage(int mileage) { this.mileage = mileage; }
	
	
}
