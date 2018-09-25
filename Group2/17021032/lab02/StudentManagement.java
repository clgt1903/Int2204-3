

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thang
 */
public class StudentManagement {
    public Student[] student = new Student[100];
    public boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }
    public void studentsByGroup(){
        int[] dl=new int[100];
        for (int i = 0; i < 100; i++){dl[i]=0;}
  
       for (int i = 0; i < 100; i++){
            if (student[i].getGroup()==null) break;
            if(dl[i]==0) {
                System.out.println("gr " + student[i].getGroup());
                for (int j = i; j < 100; j++){
                if (student[j].getGroup()==null) break;
                if (student[j].getGroup().equals(student[i].getGroup())){
                     System.out.println(student[j].getInfo());
                     dl[j]=1;
                }
                
            }
            
            }
        }
    }
    
    public void removeStudent(String id){
         for (int i = 0; i < 100; i++){
            if (student[i].getGroup()==null) 
                break;
            if (student[i].getMssv().equals(id))  {   
                for (int j = i; j < 100; j++){
                    if (student[j].getGroup()==null) 
                        break;
                    student[j] =student[j+1];
                    i--;
                }
            }
        }
    }
    public static void main(String[] args) {
        StudentManagement abc = new StudentManagement();
        Student thang=new Student();
        thang.setName("thang");
        thang.setGroup("cc");
        thang.setMssv("17");
        thang.setEmail("@");
        Student manh=new Student();
        manh.Student(thang);
        manh.setGroup("cb");
        manh.setMssv("59");
        Student quang=new Student();
        quang.Student(thang);
        quang.setGroup("cc");
        for (int i = 0; i < 100; i++){
        abc.student[i]=new Student();}
        abc.student[1].Student(thang);
        abc.student[0].Student(thang);
        abc.student[2].Student(manh);
        abc.student[4].Student(manh);
        abc.student[3].Student(quang);
        
       
        for (int i = 0; i < 100; i++){
            if (abc.student[i].getGroup()==null) break;
            System.out.println(abc.student[i].getInfo());
        }
        System.out.println("het danh sach");
        
        
       
        abc.studentsByGroup();
        abc.removeStudent("59");
        System.out.println("het group");
        for (int i = 0; i < 100; i++){
            if (abc.student[i].getGroup()==null) break;
            System.out.println(abc.student[i].getInfo());
        }
    }
    
    
}