package hw;

import java.util.Scanner;

public class CreateNewStudent {

	Scanner sc = new Scanner (System.in);
	
	public void addStudent () {
		
		System.out.println("������� ���");
		String name = sc.nextLine();
		
		System.out.println("������� �������");
		String lastName = sc.nextLine();
		
		System.out.println("������� �������");
		int age = sc.nextInt();
		
		System.out.println("������� ���");
		String gender = sc.nextLine();
		
		System.out.println("������� ����� �������");
		long recordBook = sc.nextLong();
		
		System.out.println("������� ����� ������");
		String groupNumber = sc.nextLine();
		
		Student student = new Student(name, lastName, age, Gender.valueOf(gender), recordBook, groupNumber);
		
	}
}
