import java.util.Scanner;

public class addDeleteStudent {

	public static int addOrDeletePrompt() {
		System.out.println("\nAdd or Delete a Student"
				+ "\n\t(1) Add Student"
				+ "\n\t(2) Delete Student");
		Scanner userInput = new Scanner(System.in);
		return MainMenu.inputChecks(userInput, 2, 1);
		
	}
	//this sucks, but this is extra
	//I think this is my last pull request
	public static void addStudent() {
		Scanner userInput = new Scanner(System.in);
		//again, this is adding students
		System.out.println("\nEnter the student's first name.");
		String fn = userInput.nextLine();
		System.out.println("\nEnter the student's last name.");
		String ln = userInput.nextLine();
		System.out.println("\nEnter the student's first class.");
		String fc = userInput.nextLine();
		System.out.println("\nEnter the student's grade for the first class.");
		String fg = userInput.nextLine();
		System.out.println("\nEnter the student's second class.");
		String sc = userInput.nextLine();
		System.out.println("\nEnter the student's grade for the second class.");
		String sg = userInput.nextLine();
		System.out.println("\nEnter the student's third class.");
		String tc = userInput.nextLine();
		System.out.println("\nEnter the student's grade for the third class.");
		String tg = userInput.nextLine();
		String gpa = Roster.calGpa(fg, sg, tg);
		
		Roster.roster.add(new Student(fn,ln,fc,fg,sc,sg,tc,tg,gpa));
		System.out.println("\nAdded " + Roster.roster.get(Roster.roster.size()-1).getFirstName() + " " + Roster.roster.get(Roster.roster.size()-1).getLastName());
		
	}
	
	public static void delStudent() {
		//I like to delete naught students
		System.out.println("\nSelect a Student");
		for (int i=0;i<Roster.roster.size();i++) {
			System.out.println("\t(" + (i+1) + ") " + Roster.roster.get(i).getFirstName() + " " + Roster.roster.get(i).getLastName());
		}
		//I like nacho cheese and Mr. McGuire's credit
		Scanner userInput = new Scanner(System.in);
		// Do Input Checks!!
		boolean entering = true;
		do {
			String input = userInput.nextLine();
			if (input.toLowerCase().equals("e")) {
				System.out.println("\nExiting...");
				System.exit(0);
			}
			int studentNum = Integer.parseInt(input);
		
			if (studentNum <= Roster.roster.size() && studentNum > 0) {
				System.out.println("Removed " + Roster.roster.get(studentNum-1).getFirstName() + " " + Roster.roster.get(studentNum-1).getLastName() + ".");
				Roster.roster.remove(studentNum-1);
				entering = false;
			}
			else System.out.println("Please enter a valid option.");
		} while (entering);
	}
}
