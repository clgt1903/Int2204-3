public class StudentManagement{
        public static void studentsByGroup(Student[] Students){
                  String[] Gr;
                  Gr = new String[10];
                  int i = 0;
			int sl = 0;
			int check=0;
                  Gr[0]= Students[0].Getgroup();
		     for(int j=0;j<Students.length;j++)
				{
					for(int k=0;k<=sl;k++)
					{			
						if(Students[j].Getgroup()!=Gr[k])
							 {
								 check++;
							 }
                             			if(check==sl+1)
							 {
								 sl++;
								 Gr[sl]=Students[j].Getgroup();								 
							 }								 							 
					}
						  check=0;						  
				}
		  for(int j=0;j<=sl;j++)
				{
						  
					System.out.print("Sinh vien thuoc lop ");
					System.out.println(Gr[j]);
					for(int k=0;k<Students.length;k++)
						  {
							  if(Students[k].Getgroup()==null)
							  {
								  break;
							  }
							  if(Students[k].Getgroup()==Gr[j])
							  {
								  System.out.println(Students[k].Getname());
							  }
						  }
				}
					  //System.out.println(sl);
					  											  
                    
			 }
             public static boolean sameGroup(Student s1, Student s2){
                            if(s1.Getgroup()==s2.Getgroup()){
                               return true;
                            }else return false;
                             
             }
             
             public static void main(String[] args){
                                /*Student Cat = new Student();
                                Cat.Setname("Ngoc");
                                Cat.Setid("17020935");
                                Cat.Setgroup("K62IE3");
                                Cat.Setemail("nguyentrungbrosaigon.com");
                                //System.out.println(Cat.Getname());
                                Cat.GetInfo();*/



                                /*Student p1 = new Student();
                                Student p2 = new Student("Ngoc","17020935","nguyentrungbrosaigon@gmail.com");
                                Student p3 = new Student(p1);
                                p1.GetInfo();
                                p2.GetInfo();
                                p3.GetInfo();*/


                                Student p1 = new Student();
                                p1.Setgroup("K59CLC");
                                Student p2 = new Student(p1);
                                Student p3 = new Student();
                                p3.Setgroup("K59CB");



                               
                                if(sameGroup(p1,p2)==true)
				{
                                   System.out.println("true");
                                }
				else System.out.println("false");
                                Student[] Students = new Student[10];
                                for(int i = 0;i<10;i++)
					{
					Students[i]= new Student(p1);
					}
				Students[1].Setgroup("K60clc");
				Students[2].Setgroup("Kc");
				Students[3].Setgroup("Kd");
				studentsByGroup(Students);

             }
                                         
}