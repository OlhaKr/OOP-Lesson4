package hw;

import java.util.Arrays;
import java.util.Comparator;

public class Group {

	private String groupName;
	private Student[] student = new Student[10];

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	public Group() {
		super();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", student=" + Arrays.toString(student) + super.toString() + "]";
	}

	public void addStudent(Student newStudent) {

		try {

			for (int i = 0; i < student.length; i++) {

				if (student[i] == null) {
					student[i] = newStudent;
					newStudent.setGroupNumber(groupName);
					System.out.println("Student " + student[i].getRecordBook() + " is added!");
					break;
				}
			}
			throw new FullGroupException();
		} catch (FullGroupException e) {
			System.out.println("Group is full");
		}
	}

	public void delStudent(long recordBook) {
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				if (student[i].getRecordBook() == recordBook) {
					System.out.println("Student " + student[i].getRecordBook() + " is deleted");
					student[i] = null;

				}
			}
		}
	}

	public void searchStudent(String lastName) {

		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				if (student[i].getLastName().equals(lastName)) {
					System.out.println("Student " + lastName + " " + " is found");
				}
			} else {
				System.out.println("Student isn't found");
			}
		}
	}

	public void sortStudentsByLastName() {

		for (int i = 0; i < student.length; i++) {
			Arrays.sort(student, Comparator.nullsFirst(new SortStudentsByLastNameComparator()));
		}
	}
}
