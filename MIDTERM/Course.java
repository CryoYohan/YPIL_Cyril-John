package midterm;
import java.util.Scanner;
public class Course {
	Scanner sc = new Scanner(System.in);
	String courses[] = {"Bachelor of Science in Information Technology", "Bachelor of Science Computer Science","Associate of Computer Technology", "Bachelor of Science in Mechanical Engineering", "Bachelor of Science in Civil Engineering" };
	String courseCode[] = {"BSIT", "BSCS", "ACT", "BSME", "BSCE"};
	String chosenCourse = " ";
	String chosencourseCode = " ";
	
	
	public void setCourse(int index) {
		this.chosenCourse = this.courses[index];
		this.chosencourseCode = this.courseCode[index];
	}
	public String getCourse() {
		return this.chosenCourse;	
	}
	public String getCourseCode() {
		return this.chosencourseCode;
	}
	public void courses() {
		System.out.println("Select Student Course Details(Update)\n---------------------------\n");
		for(int i = 0; i < courses.length; i++) {
			System.out.println((i+1) + " " + courses[i] + " (" + courseCode[i] + ")");
		}
		System.out.println("-------------------------------\n\nEnter Selection: ");
		int input = sc.nextInt();
		setCourse(input - 1);	
	}
	public void chosenCourse() {		
		if(getCourseCode().equalsIgnoreCase("BSIT") || getCourseCode().equalsIgnoreCase("BSCS") || getCourseCode().equalsIgnoreCase("ACT"))
			System.out.println("\n\nStudent Course Details:\nCourse Name: "+ getCourse() + "\nCourse Code: " + getCourseCode()  + "\nDepartment: " + "College of Computer Studies Department\n-----------------------------------------------");
		else
			System.out.println("\n\nStudent Course Details:\nCourse Name: "+ this.chosenCourse + "\nCourse Code: " + this.chosencourseCode + "\nDepartment: " + "College of Engineering Department\n-----------------------------------------------");
	}
}
