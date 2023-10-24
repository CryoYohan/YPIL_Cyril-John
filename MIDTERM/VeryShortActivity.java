import java.util.Scanner;

public class VeryShortActivity{

   public VeryShortActivity(){
   
   }   
   private String first_name = " ";
   private String middle_name = " ";
   private String last_name = " ";
   private String suffix = " ";
   
   public void setFname(String first_name){
      this.first_name = first_name;
   }
   
   public void setMname(String middle_name){
      this.middle_name = middle_name;
   }
   
   public void setLname(String last_name){
      this.last_name = last_name;
   }
   public void setSuffix(String suffix){
      this.suffix = suffix;
   }

   
   public String getFname(){
      return first_name;
   }
   public String getMname(){
      return middle_name;
   }
   public String getLname(){
      return last_name;
   }
   
   public String getSuffix(){
      return suffix;
   }
   
   public String toString(){
      return "Full name: " + getFname() + " " + getMname() + " " + getLname() + " " + getSuffix();
   }
   
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      VeryShortActivity object = new VeryShortActivity();
      System.out.println("Enter first name: ");
      object.setFname(sc.nextLine());
      System.out.println("Enter middle name: ");
      object.setMname(sc.nextLine());
      System.out.println("Enter last name: ");
      object.setLname(sc.nextLine());
      System.out.println("Enter suffix: ");
      object.setSuffix(sc.nextLine());
      
      System.out.println("First name: " + object.getFname());
      System.out.println("Middle name: " + object.getMname());
      System.out.println("Last name: " + object.getLname());
      System.out.println("Suffix: " + object.getSuffix());
      System.out.println(object);
   }
   
}