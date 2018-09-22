package lab02;


class Student {
	private String name;
	private String id;
	private String group;
	private String email;
	public void setname(String name)
	{
		this.name=name;
	}
	public void setid(String id)
	{
		this.id=id;
	}
	public void setgroup(String group)
	{
		this.group=group;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public String getname()
	{
		return this.name;
	}
	public String getid()
	{
		return this.id;
	}
	public String getgroup()
	{
		return this.group;
	}
	public String getemail()
	{
		return this.email;
	}
	public void getInfo()
	{
		System.out.println("My name: "+this.getname());
		System.out.println("My id: "+this.getid());
		System.out.println("My group: "+this.getgroup());
		System.out.println("My email: "+this.getemail());
	}
	public Student()
	{
		name="Student";
		id="000";
		group="INT22041";
		email="@uet.vnu.edu.vn";
	}
	public Student(String n, String sid, String em )
	{
		name=n;
		id=sid;
		group="INT22041";
		email=em;
	}
	public Student(Student s)
	{
		name=s.name;
		id=s.id;
		group=s.group;
		email=s.email;
	}
	
}
class  StudentManagement
{
	public static void main(String[] args)
	{
		Student s1= new Student();
		s1.setname("Bui Manh Hung");
		s1.setid("17020782");
		s1.setgroup("k62CD");
		s1.setemail("@uetmail.com");
		s1.getInfo();
		Student s2=new Student();
		s2.getInfo();
		Student s3=new Student("Bui Hung","170","hung_1599@gmail.com");
		s3.getInfo();
		Student s4=new Student(s1);
		s4.getInfo();
		
	}
}
