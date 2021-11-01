import java.util.Scanner;
import java.util.Collections;

public class Sorting
	{
		
		public static int sortingPrompt()
		{
			System.out.println("\nHow would you like to sort your students?"
					+ "\n\t(1) by GPA"
					+ "\n\t(2) by Last Name"
					+ "\n\t(3) by Class");
			Scanner userInput = new Scanner(System.in);
			return Kaitlyn.inputChecks(userInput, 1, 3);		
		}
		
		public static void sortByGPA()
		{
			Collections.sort(Roster.roster, new GpaComparator());
			Roster.printRoster();
		}
		
		public static void sortByLastName()
			{
				Collections.sort(Roster.roster, new LastNameComparator());
				Roster.printRoster();
			}
		
		public static void sortByClass()
			{
				System.out.println("What class would you like to sort by?");
				Scanner userInput = new Scanner(System.in);
				int sortClassChoice = userInput.nextInt();	
			}
		
		public static void sortByFirstClass()
			{
				Collections.sort(Roster.roster, new FirstClassComparator());
				Roster.printRoster();
			}
		
		public static void sortBySecondClass()
			{
				Collections.sort(Roster.roster, new SecondClassComparator());
				Roster.printRoster();
			}
		
		public static void sortByThirdClass()
			{
				Collections.sort(Roster.roster, new ThirdClassComparator());
				Roster.printRoster();
			}
	}