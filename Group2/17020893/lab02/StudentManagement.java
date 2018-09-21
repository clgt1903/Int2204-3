package JavaWeek2;

public class StudentManagement {
	public static Student[] students = new Student[100];

	public boolean sameGroup(Student s1, Student s2) {
		boolean result = s1.getGroup().equals(s2.getGroup());
		return result;
	}

	// in danh sách sinh viên theo lớp
	public void studentByGroup() {
		for (int i = 0; i < students.length - 1; i++)
			for (int j = 0; j < students.length; j++)
				if (students[i].getGroup().compareTo(students[i].getGroup()) < 0) {
					Student A = new Student();
					A = students[i];
					students[i] = students[j];
					students[j] = A;
				}

		String group = " ";

		int i = 0, n = students.length;
		while (i < n) {
			if (students[i].getGroup().equals(group) == false) {
				group = students[i].getGroup();
				System.out.println("Cac sinh vien thuoc lop " + group + ": ");
				System.out.println(students[i]);
			} else {
				System.out.println(students[i]);
			}
			i++;
		}

	}

	public void removeStudent(String newid) {
		int n = students.length;
		for (int i = 0; i < n; i++)
			if (students[i].getGroup() == newid) {
				for (int j = i; j < n - 1; j++)
					students[j] = students[j + 1];
				n--;
			}
	}

	public static void main(String[] args) {
		students[0] = new Student();
		students[0].setName("Le Duc Minh");
		students[0].setId("1702089");
		students[0].setGroup("K62-CD");
		students[0].setEmail("nickcuaducminh@gmail.com");
		System.out.println(students[0].getName());
		System.out.println(students[0].getInfo());
		System.out.println("\n");

		students[1] = new Student();
		students[1].Student();
		System.out.println(students[1].getInfo());
		System.out.println("\n");

		students[2] = new Student();
		students[2].Student("dep trai vl", "123456", "deptraivl@gmail.com");
		students[2].setGroup("K59CB");
		System.out.println(students[2].getInfo());
		System.out.println("\n");

		students[3] = new Student();
		Student s = new Student();
		s.setName("xinh gai vl");
		s.setId("456789");
		s.setGroup("K62-ABC");
		s.setEmail("xinhgaivl@gmail.com");
		students[3].Student(s);
		System.out.println(students[3].getInfo());
		System.out.println("\n");

		// test sameGroup
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		st1.setGroup("K59CLC");
		st2.setGroup("K59CLC");
		st3.setGroup("K59CB");
		StudentManagement test = new StudentManagement();
		if (test.sameGroup(st1, st2) == true)
			System.out.println("st1 and st2 same Group");
		else
			System.out.println("st1 and st2 aren't same Group");
		if (test.sameGroup(st3, st2) == true)
			System.out.println("st3 and st2 same Group");
		else
			System.out.println("st3 and st2 aren't same Group");
		if (test.sameGroup(st1, st3) == true)
			System.out.println("st1 and st3 same Group");
		else
			System.out.println("st1 and st3 aren't same Group\n\n");


		}
}
