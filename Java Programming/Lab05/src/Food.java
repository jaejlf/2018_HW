
public class Food extends Item{
	
	public Food(String name, int price) {
		super(name, price);
	}
	
	public String toString() { 
		return "[Food]" + name + " => ";  
	}

}
