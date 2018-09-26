package JavaWeek3;

public class Cat {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setName() {
		System.out.println("Nhập tên cho con mèo: ");
	}
	public void setAge() {
		System.out.println("Nhập tuổi cho con mèo: ");
	}
	public void getInfo() {
		System.out.println("Tớ là mèo");
		System.out.println("Tên tớ là " + this.getName());
		System.out.println("Năm nay tớ " + this.getAge()+" tuổi");
		System.out.println("Việc của tớ là bắt chuột\n");
	}
	
}
