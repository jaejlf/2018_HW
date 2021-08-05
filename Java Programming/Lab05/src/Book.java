
public class Book {
	private String title;
	private int page;
	private String writer;
	private static int count;
	
	public Book() {
		title = " ";
		page = 0;
		writer = " ";
		count++;
	}
	public Book(String title, int page, String writer) {
		this.title = title;
		this.page = page;
		this.writer = writer;
		count++;
	}
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public int getPage() { return page; }
	public void setPage(int page) { this.page = page; }
	
	public String getWriter() { return writer; }
	public void setWriter(String writer) { this.writer = writer; }
	
	public static int getCount() { return count; }
	
}
