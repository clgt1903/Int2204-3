
public class StudentManagement {
    public Student[] stud = new Student[100];
    public boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }
    public void studentsByGroup()
    {
        int[] classes = new int[stud.length];
        for(int i=0;i<stud.length;i++)
            classes[i]= 0;
        for(int i=0;i<stud.length;i++)
        {
            if (classes[i] == 0)
            {
                System.out.println("Lop "+stud[i].getGroup());
                for (int j = i; j < stud.length ; j++)
                {
                    if (stud[j].getGroup().equals(stud[i].getGroup()))
                    {
                        System.out.println(stud[j].getInfo());
                        classes[j]=1;
                    }
                }
            }
        }
    }
  
    public void removeStudent(String id)
    {
        int n =stud.length;
        for(int i=0;i<n;i++)
        {
            if(stud[i].getId().equals(id))
            {
                int newStudSize = n-1;
                for(int j = i ;j < newStudSize +1 ;j++)
                {
                    stud[j] = stud[j+1];
                }
                n--;
            }
        }
    }
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setName("Nguyen Quang Linh");
        std1.setId("17020856");
        std1.setGroup("INT22043");
        std1.setEmail("quanglinh12111973@gmail.com");
        System.out.println("Name: "+std1.getName());
        System.out.println("Thong tin sinh vien:"+ std1.getInfo());
        
        Student std2 = new Student();
        System.out.println(std2.getInfo());
        Student std3 = new Student("Quang", "17021001", "quang@gmail.com");
        System.out.println(std3.getInfo());
        Student std4 = new Student(std3);
        System.out.println(std4.getInfo());

        StudentManagement stm = new StudentManagement();
        System.out.println(stm.sameGroup(std1, std2));
        stm.studentsByGroup();
        stm.removeStudent("17020856");
    }
}
