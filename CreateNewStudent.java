package hw;

import java.util.Scanner;

public class CreateNewStudent {

	Scanner sc = new Scanner (System.in);
	
	public void addStudent () {
		
		System.out.println("¬ведите им€");
		String name = sc.nextLine();
		
		System.out.println("¬ведите фамилию");
		String lastName = sc.nextLine();
		
		System.out.println("¬ведите возраст");
		int age = sc.nextInt();
		
		System.out.println("¬ведите пол");
		String gender = sc.nextLine();
		
		System.out.println("¬ведите номер зачЄтки");
		long recordBook = sc.nextLong();
		
		System.out.println("¬ведите номер группы");
		String groupNumber = sc.nextLine();
		
		Student student = new Student(name, lastName, age, Gender.valueOf(gender), recordBook, groupNumber);
		
	}
}
