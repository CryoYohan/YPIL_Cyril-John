package midterm;
import java.util.Scanner;
public class Student {
	Scanner sc = new Scanner(System.in);
	int studID, age, yearLvl;
	private String fname = "";
	private String mname= "";
	private String lname= "";
	private String suffix= "";
	private String email= "";
	private String phoneNum = " ";
	
	public Student() {}
	public Student(int studID, String fname, String mname, String lname, String suffix, int age, int yearLvl, String phoneNum, String email) {
		this.studID = studID;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.suffix = suffix;
		this.age = age;
		this.yearLvl = yearLvl;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	// setters
	public void setStudID(int studID) {
		this.studID = studID;
	}
	public void setfname(String fname) {
		this.fname = fname;
	}
	public void setmname(String mname) {
		this.mname = mname;
	}
	public void setlname(String lname) {
		this.lname = lname;
	}
	public void setsuffix(String suffix) {
		this.suffix = suffix;
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setyearLvl(int yearLvl) {
		this.yearLvl = yearLvl;
	}
	public void setphoneNum(String phoneNum) {
		this.phoneNum = phoneNum ;
	}
	public void setemail(String email) {
		this.email = email;
	}	
	// getters
	public int getStudID() {
		return studID;
	}
	public String getfname() {
		return fname;
	}
	public String getmname() {
		return mname;
	}
	public String getlname() {
		return lname;
	}
	public String getsuffix() {
		return suffix;
	}
	public int getage() {
		return age;
	}
	public int getyearLvl() {
		return yearLvl;
	}
	public String getphoneNum() {
		return phoneNum;
	}
	public String getemail() {
		return email;
	}
	
	public String toString(Course course) {
			return "\n\nStudent Profile Details:\n"
			+ "Student ID No.: " + this.studID + 
			"\nFirst Name: " + this.fname  + 
			"\nMiddle Name: " + this.mname + "\nLast Name: " +this.lname+ "\nSuffix: " + this.suffix + "\nAge: " + this.age + "\nYear Level: " + this.yearLvl + "\nPhone Number: " + this.phoneNum + "\nEmail: " + this.email + "\n" + course.toString();
	}
}
