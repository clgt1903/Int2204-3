/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahuhu;

/**
 *
 * @author Administrator
 */
public class studentmangerment {
    public  student sv[] = new student[100];
    public  boolean sameGroup(student s1,student s2){
         return  s1.getGroup().equals(s2.getGroup());
     }
    public void studentsByGroup(){
        int[] dl=new int[100];
        for (int i = 0; i < 100; i++){dl[i]=0;}
  
       for (int i = 0; i < 100; i++){
            if (sv[i].getGroup()==null) break;
            if(dl[i]==0) {
                System.out.println("gr " + sv[i].getGroup());
                for (int j = i; j < 100; j++){
                if (sv[j].getGroup()==null) break;
                if (sv[j].getGroup()==sv[i].getGroup()){
                     System.out.println(sv[j].getinfo());
                     dl[j]=1;
                }
                
            }
            
            }
        }
    }  
    public void removestudent(String id){
        int i;
        int n=sv.length;
        int newsize;
        for(i=0;i<n;i++){
        if(sv[i].getId() == id)
        {   newsize=n-1;
            for(int j=i ;j< newsize;j++)
            {   sv[j]= sv[j+1];
            }
            n--;    }
            }
    }
    
    
    
    public static void main(String[] args) {
        
        
        studentmangerment apdung = new studentmangerment();
        for (int i = 0; i < 100; i++){
        apdung.sv[i]=new student();}
        
          
        
        student sv0  =new student();
        sv0.setName("thuyet");
        sv0.setId("17021056"); 
        sv0.setGroup("INT22041");
        sv0.setEmail("thuyettheory123@gmail.com");
        student sv1 =new student();
        sv1.setName("hanh oc cho");
        sv1.setId("17020749");
        sv1.setGroup("INT22041");
        sv1.setEmail("hanhoccho@gmail.com");
        student sv2=new student();
        sv2.setName("tuyen");
        sv2.setId("17021116");
        sv2.setGroup("INT22042");
        sv2.setEmail("tuyenngao@gmail.com");
        System.out.println("hai hoc viem co cung lop khong:"+apdung.sameGroup(sv1, sv2));
   
        apdung.sv[0].student(sv0);
        apdung.sv[1].student(sv1);
        apdung.sv[2].student(sv2);
        apdung.studentsByGroup();
        apdung.removestudent("17021116");
        
         for (int i = 0; i < 100; i++){
            if (apdung.sv[i].getGroup()==null) break;
            System.out.println(apdung.sv[i].getinfo());
        }
        System.out.println("het danh sach");
    }
}
