public class Student
	{
		private String firstName;
		private String lastName;
		private String firstClass;
		private String secondClass;
		private String thirdClass;
		private String firstGrade;
		private String secondGrade;
		private String thirdGrade;
		private double GPA;
		
		public Student(String n, String l, String fc, String sc, String tc, String fg, String sg, String tg, double g)
			{
				firstName = n;
				lastName = l;
				GPA = g;
				firstClass = fc;
				secondClass = sc;
				thirdClass = tc;
				firstGrade = fg;
				secondGrade = sg;
				thirdGrade = tg;
			}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public double getGPA()
			{
				return GPA;
			}

		public void setGPA(double gPA)
			{
				GPA = gPA;
			}

		public String getFirstClass()
			{
				return firstClass;
			}

		public void setFirstClass(String firstClass)
			{
				this.firstClass = firstClass;
			}

		public String getSecondClass()
			{
				return secondClass;
			}

		public void setSecondClass(String secondClass)
			{
				this.secondClass = secondClass;
			}

		public String getThirdClass()
			{
				return thirdClass;
			}

		public void setThirdClass(String thirdClass)
			{
				this.thirdClass = thirdClass;
			}

		public String getFirstGrade()
			{
				return firstGrade;
			}

		public void setFirstGrade(String firstGrade)
			{
				this.firstGrade = firstGrade;
			}

		public String getSecondGrade()
			{
				return secondGrade;
			}

		public void setSecondGrade(String secondGrade)
			{
				this.secondGrade = secondGrade;
			}

		public String getThirdGrade()
			{
				return thirdGrade;
			}

		public void setThirdGrade(String thirdGrade)
			{
				this.thirdGrade = thirdGrade;
			}
		
	}
