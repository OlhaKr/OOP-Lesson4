package hw;

public class Student extends Human {

	private long recordBook;
	private String groupNumber;

	public Student(String name, String lastName, int age, Gender gender, long recordBook, String groupNumber) {
		super(name, lastName, age, gender);
		this.recordBook = recordBook;
		this.groupNumber = groupNumber;
	}

	public Student(String name, String lastName, int age, Gender gender) {
		super(name, lastName, age, gender);
	}

	public long getRecordBook() {
		return recordBook;
	}

	public void setRecordBook(long recordBook) {
		this.recordBook = recordBook;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	@Override
	public String toString() {
		return "Student [recordBook=" + recordBook + ", groupNumber=" + groupNumber + super.toString() + "]";
	}

}
