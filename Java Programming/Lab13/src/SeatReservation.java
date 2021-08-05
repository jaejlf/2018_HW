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
		System.out.println(name + "가 들어왔음.");
		System.out.println("가능한 좌석수 : " + availableSeats + "  요청좌석수 : " + requestedSeats);
		
		if(availableSeats >= requestedSeats) {
			System.out.println("좌석이 가능합니다. 예약하세요.");
			System.out.println("좌석이 예약되었음");
			availableSeats -= requestedSeats;
		}
		else {
			System.out.println("좌석 예약이 불가능합니다.");
		}
		System.out.println(name + "가 나갑니다.");
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
