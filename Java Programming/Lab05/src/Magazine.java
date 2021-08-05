
public class Magazine extends Book{
	private String date;
	
	public Magazine(String date, String title, int page, String writer) {
		super(title, page, writer);
		this.date = date;
	}
	
	public String getDate() { return date; }
	public void setDate(String date) { this.date = date; }
}
