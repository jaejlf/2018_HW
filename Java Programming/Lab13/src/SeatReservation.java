public class SeatReservation {
	public static void main(String[] args) {
		
		Reservation reserve = new Reservation();
	
		Person thread1= new Person("Thread-0", reserve, 5);
		thread1.start();
		Person thread2 = new Person("Thread-1", reserve, 4);
		thread2.start();
		Person thread3 = new Person("Thread-2", reserve, 2);
		thread3.start();
	}
}

class Reservation{
	static int availableSeats = 10;

	public synchronized void reserveSeat(String name, int requestedSeats) {
		System.out.println(name + "�� ������.");
		System.out.println("������ �¼��� : " + availableSeats + "  ��û�¼��� : " + requestedSeats);
		
		if(availableSeats >= requestedSeats) {
			System.out.println("�¼��� �����մϴ�. �����ϼ���.");
			System.out.println("�¼��� ����Ǿ���");
			availableSeats -= requestedSeats;
		}
		else {
			System.out.println("�¼� ������ �Ұ����մϴ�.");
		}
		System.out.println(name + "�� �����ϴ�.");
		System.out.println("------------------------------");
	}
}

class Person extends Thread{
	String name;
	Reservation reserve;
	int requestedSeats;
	
	public Person(String name, Reservation reserve, int requestedSeasts) {
		this.name = name;
		this.reserve = reserve;
		this.requestedSeats = requestedSeasts;
	}
	
	public void run() {
		reserve.reserveSeat(name, requestedSeats);
	}
}
