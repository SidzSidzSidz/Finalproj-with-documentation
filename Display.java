/**
 * This is the display for the program, or what the user can see when accessing the program
 */
import java.util.Scanner;
public class Display{
	Scanner z = new Scanner(System.in);
	int grade;
	/**
	 * Prints the Main menu
	 */
	public void printMenu(){
		System.out.println("Welcome to the School's Grading System");
		System.out.println();
		System.out.println("Choose Action: 1 for Sign-up | 2 for Login ");
		System.out.print("Choice: ");
	}
	/**
	 * Prints the signup feature
	 * @return sch		the input of the user for this feature
	 */
	public int printSignup(){
		System.out.println();
		System.out.println("Sign-up");
		System.out.println("Choose: 1 for Teacher | 2 for Student ");
		System.out.print("Choice: ");
		int sch = z.nextInt();
		System.out.println();
		return sch;
	}
	/**
	 * Prints the display in inputting the user's name
	 * @return stname		the input of the user for this feature
	 */
	public String printSignname(){
		z.nextLine();
		System.out.print("Enter Name: ");
		String stname = z.nextLine();
		System.out.println();
		return stname;

	}
	/**
	 * Prints the display in inputting the user's password
	 * @return stname		the input of the user for this feature
	 */
	public String printSignpass(){
		System.out.print("Enter Password(Letters): ");
		String spass = z.nextLine();
		System.out.println();
		return spass;
	}
	/**
	 * Prints the display in inputting the user's subjectchoice
	 * @return stname		the input of the user for this feature
	 */
	public String printSignsubj(){
		System.out.print("Enter Subject: ");
		String tsubj = z.nextLine();
		System.out.println();
		return tsubj;
	}
	/**
	 * Prints the after signing up where user has the option to choose
	 */
	public void printdoneSign(){
		System.out.println("Thank you for Signing-up!");
		System.out.println("Please Login again.");
		System.out.println("-----End-----");
		System.out.println("Welcome to the School's Grading System");
		System.out.println();
		System.out.println("Choose Action: 1 for Sign-up | 2 for Login ");
		System.out.print("Choice: ");
	}
	/**
	 * Prints the login feature display
	 * @return lch 		the input of the user for this feature
	 */
	public int printLogin(){
		System.out.println();
		System.out.println("Login");
		System.out.println("Choose: 1 for Teacher | 2 for Student ");
		System.out.print("Choice: ");
		int lch = z.nextInt();
		System.out.println();
		return lch;	
	}

	/**
	 * Prints the display in logging in which the user's name is inputted
	 * @return tname		the input of the user for this feature
	 */
	public String loginName(){
		z.nextLine();
		System.out.print("Name: ");
		String tname = z.nextLine();
		System.out.println();
		return tname;
	}
	/**
	 * Prints the display in logging in which the user's password is inputted
	 * @return tname		the input of the user for this feature
	 */
	public String loginPass(){
		System.out.print("Enter Password: ");
		String tpass = z.nextLine();
		System.out.println();
		return tpass;
	}
	/**
	 * Prints the error if the name is not found in the accounts which loops again
	 */
	public void nameError (){
		System.out.println ("Name not found! Enter again.");
		System.out.println();
		System.out.println("!Press Enter!");
	}
	/**
	 * The same as in the name error
	 */
	public void passError (){
		System.out.println ("Incorrect Password! Enter again");
	}
	/**
	 * also loops back
	 */
	public void subjError (){
		System.out.println ("Subject does not exist! Enter again.");
	}
	/**
	 * Prints the account menu for the teachers in which they will choose from
	 */
	public int printloginTeacher(String tname){
		System.out.println();
		System.out.println("Hello " + tname + "!");
		System.out.println("Choose Action: 1. View Students | 2. Edit Grades | 0. Return to Main Menu");
		System.out.print("Choice: ");
		int tlm = z.nextInt();
		System.out.println();
		return tlm;
	}
	
	/**
	 * Prints the account menu for the students in which they will choose from
	 */
	public int printloginStudent(String sname){
		System.out.println();
		System.out.println("Hello " + sname + "!");
		System.out.println("Choose Action: 1. View Subjects | 0. Return to Main Menu");
		System.out.print("Choice: ");
		int slm = z.nextInt();
		System.out.println();
		return slm;
	}
	public void printSubjects(){
		System.out.println("1 English");
		System.out.println("2 Math");
		System.out.println("3 Science");
		System.out.println("4 PE");
		System.out.println("5 Filipino");
		System.out.println("6 RS");
		System.out.println("7 History");
		System.out.println("8 Business");
		System.out.println("9 Music and Arts");
		System.out.println("10 Homeroom");
	}
	
	public void printsubjectStudent(String[][] list, int num){
		System.out.println("Press Enter");
		z.nextLine();
		System.out.println();
		System.out.println("Add Subject: ");
		String subj = z.nextLine();
		System.out.println();

	}
	/**
	 * Prints the teacher's choice of editing a student's grade
	 */
	public String editGrade(){
		z.nextLine();
		System.out.print("Enter Full Name of Student.");
		String name = z.nextLine();
		System.out.println();
		return name;
	}
	
	public int enterGrade(){
	/**
	 * Prints the grades
	 * @return grade 	the grade of the student
	 */
		do{	
			System.out.print("Enter Grade: ");
			grade = z.nextInt();
			System.out.println();
			if(grade<50 && grade > 100){
				System.out.println("Grades can only be from 50 - 100");
			}
		}
		while(grade<50 && grade > 100);
			return grade;
	}
	public void suDone(){
		System.out.println("Thank you for Signing-up!");
		System.out.println("Please Login again.");
		System.out.println();
	}
}