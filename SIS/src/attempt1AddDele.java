import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class attempt1AddDele
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);
		
		
		public static void main(String[] args) throws IOException
			{
				//practice running da code
			}
		

		public static void choice1() throws IOException
		{
			
			if (step1 == 1)
				{
					System.out.println("Would you like to (1)add or (2)delete a student?");
					int AorD = userIntInput.nextInt();
					
					//if selects Add
					if (AorD == 1)
						{
							
							
						}
					//if selects Delete
					else if (AorD == 2)
						{
							System.out.println("Who would you like to delete?");
							String dele = userStringInput.nextLine();
							
							String ttt[] = dele.split(" ", 2);
							String firstN = ttt[0];
							String lastN = ttt[1];
							
							
							while(myClass.hasNext())
								{
									if (Roster.roster.get(0).getFirstName().equals(firstN) && (Roster.roster.get(1).getLastName().equals(lastN)))
										{
											//ACTUALLY DELETE STUDENT HERE
										}
									else
										{
											System.out.println("don't recognize this student");
										}
								}
						}
					else 
						{
							System.out.println("command not recognised");
						}
				}
			else
				{
					System.out.println("Go away Fool");
				}
		//option 1: add or delete student
		//option 2: change student grades/schedule
		//option 3: sort students
		
		}
	}
