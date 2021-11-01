public class Student
	{
		private String firstName;
		private String lastName;
		private String firstClass;
		private String firstGrade;
		private String secondClass;
		private String secondGrade;
		private String thirdClass;
		private String thirdGrade;
		private String GPA;
		
		public Student(String n, String l, String fc, String fg, String sc,  String sg, String tc,String tg, String g)
			{
				firstName = n;
				lastName = l;
				GPA = g;
				firstClass = fc;
				firstGrade = fg;
				secondClass = sc;
				secondGrade = sg;
				thirdClass = tc;
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

		public String getFirstClass()
			{
				return firstClass;
			}

		public void setFirstClass(String firstClass)
			{
				this.firstClass = firstClass;
			}

		public String getFirstGrade()
			{
				return firstGrade;
			}

		public void setFirstGrade(String firstGrade)
			{
				this.firstGrade = firstGrade;
			}

		public String getSecondClass()
			{
				return secondClass;
			}

		public void setSecondClass(String secondClass)
			{
				this.secondClass = secondClass;
			}

		public String getSecondGrade()
			{
				return secondGrade;
			}

		public void setSecondGrade(String secondGrade)
			{
				this.secondGrade = secondGrade;
			}

		public String getThirdClass()
			{
				return thirdClass;
			}

		public void setThirdClass(String thirdClass)
			{
				this.thirdClass = thirdClass;
			}

		public String getThirdGrade()
			{
				return thirdGrade;
			}

		public void setThirdGrade(String thirdGrade)
			{
				this.thirdGrade = thirdGrade;
			}

		public String getGPA()
			{
				return GPA;
			}

		public void setGPA(String gPA)
			{
				GPA = gPA;
			}


		
	}