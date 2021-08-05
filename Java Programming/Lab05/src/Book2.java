
public class Book2 extends Item{
	private String writer;
	
	public Book2(String name, int price, String writer) {
		super(name, price);
		this.writer = writer;
	}
	
	public String toString() { 
		return "[Book]" + name + ", ÀúÀÚ : " + writer + " => ";
	}

}
