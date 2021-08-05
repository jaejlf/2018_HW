import java.util.Scanner;
import java.util.Vector;

class Movie{
	String title, director, genres;
	int year;
	
	public Movie(String title, String director, String genres, int year) {
		this.title = title;
		this.director = director;
		this.genres = genres;
		this.year = year;
	}

	//getter, setter
	@Override
	public String toString() {
		return "[���� :" + title + ", ���� : " + director + ", �帣 : " + genres + ", �����⵵ : " + year + "]";
	}
}

public class MovieTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Vector<Movie> list = new Vector<>();
		int index = 0;
		int menu;
		String search;
		
		String title, director, genres;
		int year;
	
		while(true) {
			System.out.println("====================��ȭ ���� ����====================");
			System.out.println("1. �Է�/2. ���/3. �˻�/4. ����/5. ����/ 6. ����");
			System.out.print("�޴� �Է�>> ");
			menu = input.nextInt();
			
			//1. �Է�
			if(menu == 1) {
				input.nextLine();
				System.out.print("���� : ");
				title = input.nextLine();
				System.out.print("���� : ");
				director = input.nextLine();				
				System.out.print("�帣 : ");
				genres = input.nextLine();				
				System.out.print("�⵵ : ");
				year = input.nextInt();
	
				list.add(new Movie(title, director, genres, year));
			}
			
			//2. ���
			else if(menu == 2) {
				for(Movie s : list) {
					System.out.println(s.toString());
				}
			}
			
			//3. �˻�
			else if(menu == 3) {
				input.nextLine();
				System.out.print("�˻��� ���� �Է� : ");
				search = input.nextLine();
				for(Movie s : list) {
					if(s.title.equals(search)) {
						System.out.println(s.toString());
						break;
					}
				}
			}
			
			//4. ����
			else if(menu == 4) {
				input.nextLine();
				System.out.print("������ ���� �Է� : ");
				search = input.nextLine();
				index = 0;
				for(Movie s : list) {
					if(s.title.equals(search)) {
						System.out.println(s.toString());
						
						System.out.print("���� : ");
						title = input.nextLine();
						System.out.print("���� : ");
						director = input.nextLine();				
						System.out.print("�帣 : ");
						genres = input.nextLine();				
						System.out.print("�⵵ : ");
						year = input.nextInt();
						
						
						list.set(index,new Movie(title, director, genres, year));
						
						break;
					}
					index++;
				}
				
			}
			
			//5. ����
			else if(menu == 5) {
				input.nextLine();
				System.out.print("������ ���� �Է� : ");
				search = input.nextLine();
				index = 0;
				for(Movie s : list) {
					if(s.title.equals(search)) {
						System.out.println(s.toString());
						System.out.println("�����Ǿ����ϴ�.");
						list.remove(index);
						break;
					}
					index++;
				}
			}
			
			//6. �Է�
			else if(menu == 6) break;
			
		}			
	}
}
