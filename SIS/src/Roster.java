import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Roster
	{
		static ArrayList<Student> roster = new ArrayList<Student>();	
		
		public static void fillClass() throws IOException
			{
				Scanner myFile = new Scanner(new File("Class.txt"));
				
				while(myFile.hasNextLine())
					{
						String line = myFile.nextLine();
						
						String [] studentAtributes = line.split(" ");
						
						roster.add(new Student(studentAtributes[0], studentAtributes[1], 
								studentAtributes[2], studentAtributes[3], studentAtributes[4],
								studentAtributes[5], studentAtributes[6], studentAtributes[7], 14));
					}
				
			}
	}
