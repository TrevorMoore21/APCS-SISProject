import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class RunSIS {

	public static void main(String[] args) throws IOException
		{
		
		
		Roster.fillRoster();
		
		//displaymenu
		switch (Kaitlyn.mainMenu()) {
		case 1: 
			switch (addDeleteStudent.addOrDeletePrompt()) {
			case 1: addDeleteStudent.addStudent(); break;
			case 2: addDeleteStudent.delStudent(); break;
			}
		case 2: 
			switch (ChangeGrades.gradesOrSchedulePrompt()) {
			case 1: ChangeGrades.changeGrades(); break;
			case 2: ChangeGrades.switchClasses(); break;
			}
			break;
		case 3: // Sort students (another switch structure) goes here
		}
		
			

//		Roster.printRoster();
	}
}


