
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
		return "[�л� ����]�̸�: " + getName() + ", " + "����: " + getAge() + ", ����: " + getMajor() + ", " + "�й�: " + getsID() + "]";
	}
}
