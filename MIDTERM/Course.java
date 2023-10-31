package midterm;
import java.util.Scanner;
public class Course {
	Scanner sc = new Scanner(System.in);
	protected String courses[] = {"Bachelor of Science in Information Technology", "Bachelor of Science Computer Science","Associate of Computer Technology", "Bachelor of Science in Mechanical Engineering", "Bachelor of Science in Civil Engineering" };
	protected String courseCode[] = {"BSIT", "BSCS", "ACT", "BSME", "BSCE"};
	private String department[] = {"College of Computer Studies", "College of Engineering"};
	private String chosenCourse = " ", chosenDepartment = " ";
	private String chosencourseCode = " ";
	
	public Course() {}
	public Course(int index) {
		this.chosenCourse = this.courses[index];
		this.chosencourseCode = this.courseCode[index];
		if(index > 3 && index < 6) 
			this.chosenDepartment = this.department[1];
		else
			this.chosenDepartment = this.department[0];		
	}	
	public String getCourse() {
		return this.chosenCourse;	
	}
	public String getCourseCode() {
		return this.chosencourseCode;
	}
	public Course courses() {
			System.out.println("Select Student Course Details\n---------------------------\n");
			for(int i = 0; i < courses.length; i++) {
				System.out.println((i+1) + " " + courses[i] + " (" + courseCode[i] + ")");
			}
			System.out.println("-------------------------------\n\nEnter Selection: ");
			int input = sc.nextInt();
			return new Course(input - 1);

	}
	public String toString() {		
			return "\n\nStudent Course Details:\nCourse Name: "+ chosenCourse + "\nCourse Code: " +  chosencourseCode  + "\nDepartment: " + chosenDepartment + "\n-----------------------------------------------";
	}
	
}
