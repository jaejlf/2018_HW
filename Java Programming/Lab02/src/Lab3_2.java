class Date{
	//속성 변수 선언
	int year;
	int month;
	int day;
		
	//print1() 함수 작성
	void print1() {
		System.out.println(year + "." + month + "." + day);		
	}
	
	//print2() 함수 작성
	void print2() {
		String mon = "";
		switch(month) {
		case 1:
			mon = "January";
			break;
		case 2:
			mon = "Febuary";
			break;
		case 3:
			mon = "March";
			break;
		case 4:
			mon = "April";
			break;
		case 5:
			mon = "May";
			break;
		case 6:
			mon = "June";
			break;
		case 7:
			mon = "July";
			break;
		case 8:
			mon = "August";
			break;
		case 9:
			mon = "September";
			break;
		case 10:
			mon = "October";
			break;
		case 11:
			mon = "November";
			break;
		case 12:
			mon = "December";
			break;
			
		}
		System.out.println(mon + " " + day + ", " + year);
	}
}
public class Lab3_2 {

	public static void main(String[] args) {
		Date d;
		d = new Date();
		d.year = 2019;
		d.month = 9;
		d.day = 24;
		d.print1();
		d.print2();

	}

}
