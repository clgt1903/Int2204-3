package JavaWeek3;

public class police {
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
		System.out.println("Nhập tên cho chú công an: ");
	}
	public void setAge() {
		System.out.println("Nhập tuổi cho chú công an: ");
	}
	public void getInfo() {
		System.out.println("Tôi là công an");
		System.out.println("Tên tôi là " + this.getName());
		System.out.println("Năm nay tôi " + this.getAge()+" tuổi");
		System.out.println("Việc của tôi là bắt cướp");
	}
}
