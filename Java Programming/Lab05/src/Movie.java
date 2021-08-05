
public class Movie extends Item{
	private String director;
	
	public Movie(String name, int price, String director) {
		super(name, price);
		this.director = director;
	}
	
	public String toString() { 
		return "[Movie]" + name + ", °¨µ¶ : " + director + " => ";
	}

}
