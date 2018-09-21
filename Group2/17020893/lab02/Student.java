package JavaWeek2;

public class Student {
	private String name;
	private String id;
	private String group;
	private String email;
	
	//Setter getter
	// Name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	// Id
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	// Group
	public void setGroup(String group) {
		this.group = group;
	}
	public String getGroup() {
		return this.group;
	}
	// Email
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	public String getInfo() {
		  return "Name: "+this.name+"\nId: "+this.id+"\nGroup "+this.group+"\nEmail: "+this.email;
	}
	public void Student() {
		this.setName("Student");
		this.setId("000");
		this.setGroup("K59CB");
		this.setEmail("uet@vnu.edu.vn");
	}
	
	public void Student(String n, String sid, String em) {
		this.setName(n);
		this.setId(sid);
		this.setEmail(em);
		this.group = "K59CB";		
	}
	public void Student(Student s){
		this.setName(s.name);
		this.setId(s.id);
		this.setGroup(s.group);
		this.setEmail(s.email);
	}
	
}
