
public class Student extends Human{
	private String major;
	private String sID;
	
	public Student(String name, int age, String major, String sID) {
		super(name, age);
		this.major = major;
		this.sID = sID;
	}

	public String getMajor() { return major; }
	public void setMajor(String major) { this.major = major; }

	public String getsID() { return sID; }
	public void setsID(String sID) { this.sID = sID; }
	
	public String toString() { 
		super.toString();
		return "[학생 정보]이름: " + getName() + ", " + "나이: " + getAge() + ", 전공: " + getMajor() + ", " + "학번: " + getsID() + "]";
	}
}
