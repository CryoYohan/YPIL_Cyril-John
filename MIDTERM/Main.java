package midterm;
import java.util.Scanner;
public class Main {
	Course course = new Course();
	Student student = new Student();
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main object = new Main();
		int input = 0;
		int trapping = 0;
		do {
			try {
				System.out.println("Student Record Management App v1\n\nSelection Menu:\n-----------------------------------\n1. Create Student Record\n2. Exit\n-------------------------------------\n\nEnter Selection: ");
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
		String email = sc.next();
		
		student = new Student(studNum, fname, mname, lname, suffix, age, yearLvl, phoneNum, email);
		
		System.out.println("Choose course:\n\n");	
		course.courses();		
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
						course.courses();
						break;
						
					case 3:
						displayStudentProfile();
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
			
		}while(trapping==1);
	}
	
	public void displayStudentProfile() {
		System.out.println("\n\nStudent Profile Details:\n");
		System.out.println("Student ID No.: " + student.getStudID());
		System.out.println("First Name: " + student.getfname());
		System.out.println("Middle Name: " + student.getmname() + "\nLast Name: " + student.getlname()+ "\nSuffix: " + student.getsuffix() + "\nAge: " + student.getage() + "\nYear Level: " + student.getyearLvl() + "\nPhone Number: " + student.getphoneNum() + "\nEmail: " + student.getemail());
		course.chosenCourse();
	}
	public void updateDetails() {
		int input = 0;
		int studNum, age, yearLvl;
		String phoneNum;
		String fname = " ", mname = " "
				, lname = " ", suffix = " ", email = " ";
		do {
		System.out.println("\n\nStudent Profile Details Update Selection Menu:\n------------------------\n1. Update Student ID No.\n2. Update First Name\n3. Update Middle Name\n4. Update Last Name\n5. Update Suffix\n6. Update Age\n7. Update Year Level\n8. Update Phone Number\n9. Update Email\n0. Return");
		input = sc.nextInt();
		switch(input) {
		case 1:
			System.out.println("Enter Student Details(Update):\n--------------------\nStudent ID No.\n--------------------\n\n Enter Student No.: ");
			student.setStudID(studNum = sc.nextInt());
			break;	
		case 2:
			sc.nextLine();
			System.out.println("Student First Name(Update)\n--------------------\n\nEnter First Name: ");
			student.setfname(fname = sc.nextLine());
			break;
		case 3:
			sc.nextLine();
			System.out.println("Student Middle Name(Update)\n--------------------\n\nEnter Middle Name: ");
			student.setmname(mname = sc.nextLine());
			break;
		case 4:
			sc.nextLine();
			System.out.println("Student Last Name(Update)\n--------------------\n\nEnter Last Name: ");
			student.setlname(lname = sc.next());			
			break;
		case 5:
			sc.nextLine();
			System.out.println("Student Suffix(Update)\n--------------------\n\nEnter Suffix: ");
			student.setsuffix(suffix = sc.next());
			break;
		case 6:
			System.out.println("Student Age(Update)\n--------------------\n\nEnter Student Age: ");
			student.setage(age = sc.nextInt());
			break;
		case 7:
			System.out.println("Student Year Level(Update)\n--------------------\n\nEnter Year Level: ");
			student.setyearLvl(yearLvl = sc.nextInt());
			break;
		case 8:
			sc.nextLine();
			System.out.println("Student Phone Number(Update)\n--------------------\n\nEnter Phone Number: ");
			student.setphoneNum(phoneNum = sc.next());
			break;
		case 9:
			sc.nextLine();
			System.out.println("Student Email(Update)\n--------------------\n\nEnter Email: ");
			student.setemail(email = sc.next());
			break;
		case 0:
			System.out.println("Return...");
			break;
		}
		}while(input!=0);
	}
}
