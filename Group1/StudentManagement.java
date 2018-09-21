package JavaWeek2;

public class StudentManagement {
	public static Student[] students = new Student[100];
	public boolean sameGroup(Student s1, Student s2) {
		boolean result = s1.getGroup().equals(s2.getGroup());
		return result;
	}
	public void StudentByGroup() {
		students[0].Student("nguyen van a", "12345678", "nguyenvana@gmail.com");
		students[0].setGroup("INT22042");
		students[1].Student("nguyen van b", "12345678", "nguyenvanb@gmail.com");
		students[1].setGroup("INT22043");
		students[2].Student("nguyen van c", "123456789", "nguyenvanc@gmail.com");
		students[2].setGroup("INT22043");
		students[3].Student("nguyen van d", "123456789", "nguyenvand@gmail.com");
        for (int i = 4; i < students.length - 1; i++) {
        	students[i] = null;
        }
        for (int i = 0;  students[i]!= null; i++) {
            for (int j = i + 1; students[j]!= null; j++) {
                if (0 <= students[i].getGroup().compareTo(students[j].getGroup())) {
                    Student a = new Student();
                    a = students[i];
                    students[i] = students[j];
                    students[j] = a;
                }
            }
        }
        students[0].setGroup("group");
        int x = 0;
        while (students[x] != null) {
            if (students[x].getGroup().equals("group") == true) {
                System.out.println(students[x].getInfo());
            } 
            else {
                System.out.println("-----------");
                System.out.println(students[x].getInfo());
            }
            x++;
       }
}
	//remove Student
	 public void removeStudent( String d ) {
	        for (int i = 0; students[i] != null; i++) {
	            if ((students[i].getId()).equals(d)) {
	                for(int j=i; students[j]!= null; j++){
	                   students[j]=students[j+1]; 
	                }
	            }
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
		if(test.sameGroup(st1, st2)==true) System.out.println("st1 and st2 same Group");
		else System.out.println("st1 and st2 aren't same Group");
		if(test.sameGroup(st3, st2)==true) System.out.println("st3 and st2 same Group");
		else System.out.println("st3 and st2 aren't same Group");
		if(test.sameGroup(st1, st3)==true) System.out.println("st1 and st3 same Group");
		else System.out.println("st1 and st3 aren't same Group\n\n");
		
		 // In ra danh sách sinh viên theo lớp
        System.out.println("Danh sách sinh viên theo lớp. ");
        test.StudentByGroup();
        //xóa sinh viên có mssv là 17020893 trong danh sách.
        String d="17020893";
        test.removeStudent(d);
        //in ra danh sách sinh viên theo lớp sau khi xóa.
        System.out.println("\nDanh sách sinh viên theo lớp sau khi xóa. ");
        for(int j=0; test.students[j] != null ; j++){
           System.out.println(test.students[j].getInfo());
        }
	}
}
