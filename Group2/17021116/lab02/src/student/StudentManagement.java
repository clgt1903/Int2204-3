/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student;
import java.util.ArrayList;
/**
 *
 * @author 123456789
 */
public class StudentManagement{
    
    
    public static ArrayList<Student> students = new ArrayList<>(100);
    public static void main(String ags[]){
        StudentManagement test = new StudentManagement();
        Student sv = new Student();
        sv.setName("Dinh Van Tuyen");
        sv.setId("17021116");
        sv.setGroup("K62CD");
        sv.setEmail("17021116@vnu.edu.vn");
        System.out.println("Ten SV : " + sv.getName());
        System.out.println("\nThong tin sinh vien : \n" + sv.getInfo()+"\n");
        
        Student test1 = new Student();
        System.out.println(test1.getInfo()+"\n");
        
        Student test2 = new Student("Nguyen Van A", "17021110", "vana@gmail.com");
        System.out.println(test2.getInfo()+"\n");
        
        Student test3 = new Student(sv);
        System.out.println(test3.getInfo()+"\n");
        
        Student sv1 =  new Student(test2);
        sv1.setGroup("K59CLC");
        
        Student sv3 = new Student(sv1);
        
        Student sv2 = new Student(test2);
        sv2.setGroup("K59CB");
        
        System.out.println(test.sameGroup(sv1,sv2));
        
        students.add(sv);
        students.add(sv1);
        students.add(sv2);
        students.add(sv3);
//        students.add(test1);
//        students.add(test2);
        
        test.studentByGroup();
    }
    
    public boolean sameGroup(Student s1, Student s2){
        boolean retVal;
        
        retVal = s1.getGroup().equals(s2.getGroup());
        return retVal;
    }
    
    public void studentByGroup(){
        Student temp = students.get(0);
        String presentGroup = temp.getGroup();
        String nextGroup = null;
        int size = students.size();
        boolean[] check = new boolean[size];
        System.out.println("---------------");
        for(int i=0;i < size;i++){
           Student tempStudent = students.get(i);
           
           if(check[i]!=true){
               if(tempStudent.getGroup().equals(presentGroup)){
                    System.out.println(tempStudent.getInfo()+"\n");
                    check[i]=true;
                }
               else nextGroup=tempStudent.getGroup();
               
               if(i==size-1)
                {
                    i=0;
                    presentGroup = nextGroup;
                }
           }
        }
    }
    public void removeStudent(String id){
        Student temp = students.get(0);
        int size = students.size();
        for(int i=0;i<size;i++)
        {
            Student tempStudent = students.get(i);
            if(tempStudent.getId().equals(id))
            {
                students.remove(i);
            }
        }
        
    }
}
