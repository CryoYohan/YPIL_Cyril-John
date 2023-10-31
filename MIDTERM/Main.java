package midterm;
import java.util.Scanner;
public class Main {
	Course course = new Course();
	Course courseStud;
	Course storeCourse[];
	Student student = new Student();
	Scanner sc = new Scanner(System.in);
	Student students[];
	int numStud = 0;
	
	public static void main(String[] args) {
		Main object = new Main();
		int input = 0;
		int trapping = 0;
		do {
			try {
				System.out.println("Enter number of students to register: ");
				object.numStud = object.sc.nextInt();
				object.students = new Student[object.numStud];
				object.storeCourse= new Course[object.numStud];
				System.out.println("Student Record Management App v1\n\nSelection Menu:\n-----------------------------------\n1. Create Student Record\n0. Exit\n-------------------------------------\n\nEnter Selection: ");
				switch(input = object.sc.nextInt()) {
				case 1:					
					object.enterDetails();					
					object.studentRecordMenu();
					break;
					
				case 0:
					System.out.println("Closing program...");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid input");
					break;
				}
			}catch(Exception e) {
				System.out.println("Invalid Input");
				trapping = 1;
				object.sc.next();
			}
		}while(trapping == 1);

	}
	
	public void enterDetails() {
		for(int i = 0; i < students.length; i++) {
			System.out.println("Enter Student Details:\n--------------------\nStudent ID No.\n--------------------\n\nEnter Student No.: ");
			int studNum = sc.nextInt();
			sc.nextLine();
			System.out.println("Student First Name\n--------------------\n\nEnter First Name: ");
			String fname = sc.nextLine();
			
			System.out.println("Student Middle Name\n--------------------\n\nEnter Middle Name: ");
			String mname = sc.nextLine();
	
			System.out.println("Student Last Name\n--------------------\n\nEnter Last Name: ");
			String lname = sc.nextLine();
			
			System.out.println("Student Suffix\n--------------------\n\nEnter Suffix: ");
			String suffix = sc.nextLine();
	
			System.out.println("Student Age\n--------------------\n\nEnter Student Age: ");
			int age = sc.nextInt();
			
			System.out.println("Student Year Level\n--------------------\n\nEnter Year Level: ");
			int yearLvl = sc.nextInt();
			sc.nextLine();
			System.out.println("Student Phone Number\n--------------------\n\nEnter Phone Number: ");
			String phoneNum = sc.nextLine();
			
			System.out.println("Student Email\n--------------------\n\nEnter Email: ");
			String email = sc.nextLine();
			students[i] = student = new Student(studNum, fname, mname, lname, suffix, age, yearLvl, phoneNum, email);			
			storeCourse[i] = course.courses();
		}
	}	
	public void studentRecordMenu() {
		int input = 0, trapping = 0;
		do {
			try {
				System.out.println("\n\nStudent Record Management App v1\n\nStudent Record Selection Menu:\n----------------------------\n1. Update Student Profile Details\n2. Update Student Course Details\n3. Display Student Record\n0. Exit\n\nEnter Selection:");	
				switch(input = sc.nextInt()) {
					case 1:
						updateDetails();
						break;
					case 2:
						int number = 1;
						System.out.println("Select Student Course Details(Update)\n---------------------------\n");
						System.out.println("Pick student to update: \n");
						for(Student s: students) {
							System.out.println(number + " " + s.getfname());
							number++;
						}
						int choice = sc.nextInt();
						storeCourse[choice - 1] = course.courses();
						break;
						
					case 3:
						for(int i = 0; i < students.length; i++) {
							System.out.println(students[i].toString(storeCourse[i]));
						}
						break;
						
					case 0:
						System.out.println("Exiting...");
						System.exit(0);		
					}
			}catch(Exception e) {
				trapping = 1;
				sc.nextLine();
				System.out.println("Invalid Input");
			}
			
		}while(trapping==1 || input!=0);
	}	
	public void updateDetails() {
		int input = 0;
		int studNum, age, yearLvl, number = 1;
		String phoneNum,fname = " ", mname = " ",lname = " ", suffix = " ", email = " ";
		System.out.println("Pick student to update: \n");
		for(Student s: students) {
			System.out.println(number + " " + s.getfname());
			number++;
		}
		System.out.println("\nEnter selection: ");
		int select = sc.nextInt();
		do {
		System.out.println("\n\nStudent Profile Details Update Selection Menu:\n------------------------\n1. Update Student ID No.\n2. Update First Name\n3. Update Middle Name\n4. Update Last Name\n5. Update Suffix\n6. Update Age\n7. Update Year Level\n8. Update Phone Number\n9. Update Email\n0. Return");
		input = sc.nextInt();
		switch(input) {
		case 1:
			System.out.println("Enter Student Details(Update):\n--------------------\nStudent ID No.\n--------------------\n\n Enter Student No.: ");
			students[select-1].setStudID(studNum = sc.nextInt());
			break;	
		case 2:
			sc.nextLine();
			System.out.println("Student First Name(Update)\n--------------------\n\nEnter First Name: ");
			students[select-1].setfname(fname = sc.nextLine());
			break;
		case 3:
			sc.nextLine();
			System.out.println("Student Middle Name(Update)\n--------------------\n\nEnter Middle Name: ");
			students[select-1].setmname(mname = sc.nextLine());
			break;
		case 4:
			sc.nextLine();
			System.out.println("Student Last Name(Update)\n--------------------\n\nEnter Last Name: ");
			students[select-1].setlname(lname = sc.next());			
			break;
		case 5:
			sc.nextLine();
			System.out.println("Student Suffix(Update)\n--------------------\n\nEnter Suffix: ");
			students[select-1].setsuffix(suffix = sc.next());
			break;
		case 6:
			System.out.println("Student Age(Update)\n--------------------\n\nEnter Student Age: ");
			students[select-1].setage(age = sc.nextInt());
			break;
		case 7:
			System.out.println("Student Year Level(Update)\n--------------------\n\nEnter Year Level: ");
			students[select-1].setyearLvl(yearLvl = sc.nextInt());
			break;
		case 8:
			sc.nextLine();
			System.out.println("Student Phone Number(Update)\n--------------------\n\nEnter Phone Number: ");
			students[select-1].setphoneNum(phoneNum = sc.next());
			break;
		case 9:
			sc.nextLine();
			System.out.println("Student Email(Update)\n--------------------\n\nEnter Email: ");
			students[select-1].setemail(email = sc.next());
			break;
		case 0:
			System.out.println("Return...");
			break;
		}
		}while(input!=0);
	}
}
