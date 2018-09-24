import java.util.ArrayList;

public class StudentManagement {
    public static ArrayList<Student> students= new ArrayList<>();              
    public static void main (String []args){
        Student me= new Student("Thuong","17020168","nguyentrongthuong1998@gmail.com");      
        Student me1= new Student("Emperor","20166823","abc@gmail.com");
        Student hii= new Student(me);
        Student son= new Student();
//        System.out.println(hii.getName());
//        System.out.println(hii.getInfo());
        StudentManagement test = new StudentManagement();
//        System.out.println(test.sameGroup(hii, me));
        System.out.println("----------");

        students.add(me);                                                   
        students.add(hii);
        students.add(son);
        students.add(me1);
        students.add(son);
        students.add(me1);
        for (Student elements: students){                                   
                System.out.println(elements.getInfo());
        }

        System.out.println("----------");        
        System.out.println("----------"); 
        test.studentByGroup();
        System.out.println("----------");        
        for (int i=0;i<students.size();i++)                                
            test.removeStudent("17021004");
        for (Student elements: students){                                   
                System.out.println(elements.getInfo());
        }

    }
    public boolean sameGroup (Student s1, Student s2){                     
        return s1.getGroup().equals(s2.getGroup());
    }
    public void removeStudent (String id){                                 
            for (int i=0;i<students.size();i++){
                Student stud=students.get(i);                              
                if (stud.getId().equals(id)) 
                    students.remove(i);                                    

            }
        }
    public void studentByGroup (){                                           
        Student tem=students.get(0);
        String presentGroup =tem.getGroup();                                
        String nextGroup="";                                                

        int size=students.size();                                         
        boolean[] check= new boolean[size];                                 
        for (int i=0;i<size;i++)
        {
            Student temStudent= students.get(i);
            if (check[i]!=true)                                             
            {
                if (temStudent.getGroup().equals(presentGroup))             
                {
                    System.out.println(temStudent.getInfo());              
                    check[i]=true;                                          
                }
            else
            {
                nextGroup=temStudent.getGroup();                          
            }
                if (i==size-1)                                            
                {
                    i=0;                                                   
                    presentGroup=nextGroup;                                
                }
            
            }
        } 
}
}