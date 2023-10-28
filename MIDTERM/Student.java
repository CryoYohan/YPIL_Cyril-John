package midterm;
import java.util.Scanner;
public class Student {
	Scanner sc = new Scanner(System.in);
	int studID, age, yearLvl;
	String fname = "";
	String mname= "";
	String lname= "";
	String suffix= "";
	String email= "";
	String phoneNum = " ";
	
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
	

}
