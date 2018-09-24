package STD;

class Student {

	boolean check = true;
	private String name;
	private String id;
	private String email;
	private String group;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getid() {
		return id;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getGroup() {
		return group;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getInfo() {
		return "Name: " + this.name + "\nId: " + this.id + "\nGroup " + this.group + "\nEmail: " + this.email;
	}

	Student() {
		this.name = "Student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}

	Student(String n, String ids, String em, String gr) {
		this.name = n;
		this.id = ids;
		this.email = em;
		this.group = gr;
	}

	Student(Student s) {
		this.name = s.name;
		this.id = s.id;
		this.group = s.group;
		this.email = s.email;
	}

}
