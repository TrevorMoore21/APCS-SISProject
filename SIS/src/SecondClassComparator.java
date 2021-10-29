import java.util.Comparator;
public class SecondClassComparator implements Comparator<Student>
	{
				public int compare(Student s1, Student s2)
				{
					return s1.getSecondClass().compareTo(s2.getSecondClass());
				}
	}