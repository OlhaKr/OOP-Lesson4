package hw;

import java.util.Comparator;

public class SortStudentsByLastNameComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {

		Student student1 = (Student) arg0;
		Student student2 = (Student) arg1;

		String name1 = student1.getLastName();
		String name2 = student2.getLastName();

		return name1.compareTo(name2);

	}

}
