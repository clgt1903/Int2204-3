package JavaWeek3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// test cat
		Cat cat = new Cat();
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		
		cat.setName();
		name = sc.nextLine();
		cat.setName(name);
		
		cat.setAge();
		age = sc.nextInt();
		cat.setAge(age);
		
		cat.getInfo();
		sc.close();
	}
}