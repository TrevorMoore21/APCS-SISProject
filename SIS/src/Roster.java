import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Roster
	{
		static ArrayList<Student> roster = new ArrayList<Student>();	
		
		public static void fillRoster() throws IOException
			{
				Scanner myFile = new Scanner(new File("Class.txt"));
				
				while(myFile.hasNextLine())
					{
						String line = myFile.nextLine();
						
						String [] studentAtributes = line.split(" ");
						
						roster.add(new Student(studentAtributes[0], studentAtributes[1], 
								studentAtributes[2], studentAtributes[3], studentAtributes[4],
								studentAtributes[5], studentAtributes[6], studentAtributes[7],
								calGpa(studentAtributes[3], studentAtributes[5], studentAtributes[7])));
					}
			}
					

				public static String calGpa(String a, String b, String c)
				{
			
					double gradePoint1 = 0;
					double gradePoint2 = 0;
					double gradePoint3 = 0;
					
					switch (a)
						{
							case "A+":
								{
      						gradePoint1 = 4.00;
      						break;
								}
  						case "A":
  							{
    							gradePoint1 = 4.00;
    							break;
  							}
  						case "A-":
  							{
    							gradePoint1= 3.67;
    							break;
  							}
  						case "B+":
  							{	
    							gradePoint1 = 3.33;
    							break;
  							}
  						case "B":
  							{
    							gradePoint1 = 3.00;
    							break;
  							}
  						case "B-":
  							{
    							gradePoint1 = 2.67;
    							break;
  							}
  						case "C+":
  							{
  								gradePoint1 = 2.33;
    							break;
  							}
  						case "C":
  							{
    							gradePoint1 = 2.00;
    							break;
  							}
  						case "C-":
  							{
    							gradePoint1 = 1.67;
    							break;
  							}
  						case "D+":
  							{
    							gradePoint1 = 1.33;
    							break;
  							}
  						case "D":
  							{
    							gradePoint1 = 1.00;
    							break;
  							}
  							
  						case "D-":
    							{
      							gradePoint1 = 0.67;
      							break;
    							}
  							
  						default:
  							{
  								gradePoint1 = 0.90;
  								break;
  							}
					}
					
					switch (b)
					{
						case "A+":
							{
								gradePoint2 = 4.00;
    						break;
							}
						case "A":
							{
								gradePoint2 = 4.00;
  							break;
							}
						case "A-":
							{
								gradePoint2= 3.67;
  							break;
							}
						case "B+":
							{	
								gradePoint2 = 3.33;
  							break;
							}
						case "B":
							{
								gradePoint2 = 3.00;
  							break;
							}
						case "B-":
							{
								gradePoint2 = 2.67;
  							break;
							}
						case "C+":
							{
								gradePoint2 = 2.33;
  							break;
							}
						case "C":
							{
								gradePoint2 = 2.00;
  							break;
							}
						case "C-":
							{
								gradePoint2 = 1.67;
  							break;
							}
						case "D+":
							{
								gradePoint2 = 1.33;
  							break;
							}
						case "D":
							{
								gradePoint2 = 1.00;
  							break;
							}
							
						case "D-":
  							{
    							gradePoint2 = 0.67;
    							break;
  							}
							
						default:
							{
								gradePoint2 = 0.00;
								break;
							}
				}
					
					switch (c)
					{
						case "A+":
							{
								gradePoint3 = 4.00;
    						break;
							}
						case "A":
							{
								gradePoint3 = 4.00;
  							break;
							}
						case "A-":
							{
								gradePoint3= 3.67;
  							break;
							}
						case "B+":
							{	
								gradePoint3 = 3.33;
  							break;
							}
						case "B":
							{
								gradePoint3 = 3.00;
  							break;
							}
						case "B-":
							{
								gradePoint3 = 2.67;
  							break;
							}
						case "C+":
							{
								gradePoint3 = 2.33;
  							break;
							}
						case "C":
							{
								gradePoint3 = 2.00;
  							break;
							}
						case "C-":
							{
								gradePoint3 = 1.67;
  							break;
							}
						case "D+":
							{
								gradePoint3 = 1.33;
  							break;
							}
						case "D":
							{
								gradePoint3 = 1.0;
  							break;
							}
							
						case "D-":
  							{
    							gradePoint3 = 0.67;
    							break;
  							}
							
						default:
							{
								gradePoint3 = 0.00;
								break;
							}
				}
				
					double gpa = (gradePoint1 + gradePoint2 + gradePoint3) / 3;
					DecimalFormat d = new DecimalFormat("0.00");
					
					return d.format(gpa);
			}				

	
				public static void printRoster()
				{
					
					for(int i =0; i < roster.size(); i++)
						{
							System.out.println(i+1 + ": " +roster.get(i).getFirstName() + " " + roster.get(i).getLastName() + 
									" " + roster.get(i).getFirstClass() + " " + roster.get(i).getFirstGrade() + 
									" " + roster.get(i).getSecondClass() + " " + roster.get(i).getSecondGrade() +
									" " + roster.get(i).getThirdClass() + " " + roster.get(i).getThirdGrade() + 
									" GPA: " +  roster.get(i).getGPA() + "\n");
						}
				}
				

	
}
