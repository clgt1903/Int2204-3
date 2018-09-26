package STD;


public class StudentManagement {

	public boolean sameGroup(Student st1, Student st2) {
		if (st1.getGroup().equals(st2.getGroup())) {
			return true;
		} else {
			return false;
		}
	}

	Student[] arr = new Student[100];

	public static void main(String[] args) {
		Student hang = new Student();
		hang.setName("Phan Thanh Hang");
		hang.setid("17020725");
		hang.setGroup("K62_CD ");
		hang.setEmail("phanthanhhang.lhp@gmail.com");
		System.out.println(hang.getName());
		System.out.println(hang.getInfo());

		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();

		st1.setName("x");
		st1.setid("123");
		st1.setGroup("INT22041");
		st1.setEmail("x@gmail.com");

		st2.setName("y");
		st2.setid("456");
		st2.setGroup("INT22041");
		st2.setEmail("y@gmail.com");

		st3.setName("z");
		st3.setid("789");
		st3.setGroup("INT22042");
		st3.setEmail("xyz@gmail.com");

		StudentManagement SV = new StudentManagement();
		SV.arr[0] = new Student("A", "110", "Amail", "INT22041");
		SV.arr[1] = new Student("B", "111", "Bmail", "INT22042");
		SV.arr[2] = new Student("C", "112", "Cmail", "INT22042");
		SV.arr[3] = new Student("D", "113", "Dmail", "INT22043");
		SV.arr[4] = new Student("E", "114", "Email", "INT22043");

		if (SV.sameGroup(st1, st3)) {
			System.out.println("cung lop");
		} else {
			System.out.println("khong cung lop");
		}
		SV.removeStudent("113");
		SV.studentsByGroup();

	}

	public void studentsByGroup() {
		System.out.println("\n \n");

		for (int i = 0; arr[i] != null; i++) {
			if (arr[i].check) {

				System.out.println(arr[i].getGroup() + ":");

				for (int j = i; arr[j] != null; j++) {
					if (arr[j].getGroup().equals(arr[i].getGroup())) {
						System.out.println(arr[j].getInfo());

						arr[j].check = false;
					}
				}
				System.out.println("\n \n");
			}
			arr[i].check = true;
		}

	}

	public void removeStudent(String id) {
		int n = 0, tmp = 0;
		for (int i = 0; arr[i] != null; i++) {
			n++;
		}
		for (int i = 0; i < n; i++) {
			if (!arr[i].getid().equals(id)) {
				arr[tmp] = arr[i];
				tmp++;
			}
		}
		for (int i = tmp; i < n; i++) {
			arr[i] = null;
		}
		for (int i = 0; i < tmp; i++) {
			System.out.println(arr[i].getName());
		}
	}

}