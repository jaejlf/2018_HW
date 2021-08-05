import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.Vector;

class Movie implements Serializable{
	String title, director, genres;
	int year;
	
	public Movie(String title, String director, String genres, int year) {
		this.title = title;
		this.director = director;
		this.genres = genres;
		this.year = year;
	}

	@Override
	public String toString() {
		return "[���� : " + title + ", ���� : " + director + ", �帣 : " + genres + ", �����⵵ : " + year + "]";
	}	
}

public class MovieTest implements Serializable {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		Scanner input = new Scanner(System.in);
		Vector<Movie> list = new Vector<>();
		int index = 0;
		int menu;
		String search;
		
		String title, director, genres;
		int year;
	
		while(true) {
			System.out.println("====================��ȭ ���� ����====================");
			System.out.println("1. �Է�/2. ���/3. �˻�/4. ����/5. ����/6. ���� ����/ 7. ���� ����/ 8. ����");
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
			
			//6. ���� ����
			else if(menu == 6) {
				try {
					oos = new ObjectOutputStream(new FileOutputStream("movie.dat"));
					oos.writeObject(list);
					oos.flush();
					
					if(oos != null) oos.close();
					System.out.println("movie.dat�� ����Ǿ����ϴ�.");
					
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			
			//7. ���� ����
			else if(menu == 7) {
				try {
					ois = new ObjectInputStream(new FileInputStream("movie.dat"));
					list = (Vector<Movie>) ois.readObject();
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if(ois != null) ois.close();
				}
				System.out.println("movie.dat�κ��� ������ �ҷ��Խ��ϴ�.");
			}
			
			//8. �Է�
			else if(menu == 8) break;
		}			
		input.close();
	}
}
