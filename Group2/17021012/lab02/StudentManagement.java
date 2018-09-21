/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;
import java.util.ArrayList;
public class StudentManagement {

   public static ArrayList<Student> students= new ArrayList<>();  
    public static void main(String[] args) {
        //Khoi tao
        Student hs= new Student("Thai","17021012","thainguyenhong28@gmail.com"); 
        Student hs1= new Student("Ngoc","17021911","ngochong@gmail.com");
        Student hs2= new Student(hs);
        Student hs3= new Student();
        System.out.println(hs2.getName());
        System.out.println(hs2.getInfo());
        StudentManagement test = new StudentManagement();
        System.out.println(test.sameGroup(hs2, hs));

        //Them doi tuong vao arraylist
        students.add(hs);                                                   
        students.add(hs1);          
        students.add(hs2);
        students.add(hs3);
        
        for (Student elements: students){                               
                System.out.println(elements.getInfo());
        }

        
        test.studentByGroup();
        //Chuyen doi tuong  
        for (int i=0;i<students.size();i++)                                 
            test.removeStudent("17021012");
        //List sau khi chuyen
        for (Student elements: students){                                   
                System.out.println(elements.getInfo());
        }

    }
    public boolean sameGroup (Student s1, Student s2){                      
        return s1.getGroup().equals(s2.getGroup());
    }
    public void removeStudent (String id){                                  
            for (int i=0;i<students.size();i++)
            {
                Student hocsinh=students.get(i);                               
                    if (hocsinh.getId().equals(id)) 
                        students.remove(i);                                     

            }
        }
    //Sap xep sinh vien
    public void studentByGroup (){                                           
        Student t =students.get(0);
        String Groupdau =t.getGroup();                                
        String Groupsau="";    //Group sau chua duyet                                            

        int size=students.size();                                           
        boolean[] check= new boolean[size]; //check phan tu list duoc xuat ra chua                               
        for (int i=0;i<size;i++)
        {
            Student tStudent= students.get(i);
            if (check[i]!=true)                                             
            {
                if (tStudent.getGroup().equals(Groupdau))             
                {
                    System.out.println(tStudent.getInfo());   //in ra neu trong gr
                    check[i]=true;                                          
                }
            else
            {
                Groupsau=tStudent.getGroup();         

            }
                if (i==size-1)                                              
                {
                    i=0;            //den cuoi duyet tu dau                                        
                    Groupdau=Groupsau;           
                }
            
                
        }                                      
    }
}
    
}
