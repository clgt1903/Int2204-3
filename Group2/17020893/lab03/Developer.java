package JavaWeek3;

public class Developer {
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
		System.out.println("Nhập tên cho lập trình viên: ");
	}
	public void setAge() {
		System.out.println("Nhập tuổi cho lập trình viên: ");
	}
	public void getInfo() {
		System.out.println("Tôi là lập trình viên");
		System.out.println("Tên tôi là " + this.getName());
		System.out.println("Năm nay tôi " + this.getAge()+" tuổi");
		System.out.println("Công việc của tôi là lập trình web");
		System.out.println("Ước mơ của tôi là có người yêu");
	}
}
