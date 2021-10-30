import java.util.Scanner;

public class SortStudents {

	public static int prompt() {
		System.out.println("\nSort Students"
				+ "\n\t(1) Sort by last name"
				+ "\n\t(2) Sort by GPA"
				+ "\n\t(3) Sort by period");
		Scanner userInput = new Scanner(System.in);
		return Kaitlyn.inputChecks(userInput, 3, 1);
	}
	
	public static int classSorterPrompt() {
		System.out.println("\nSort by Period"
				+ "\n\t(1) Sort by first period"
				+ "\n\t(2) Sort by second period"
				+ "\n\t(3) Sort by third period");
		Scanner userInput = new Scanner(System.in);
		return Kaitlyn.inputChecks(userInput, 3, 1);
		
	}
}
