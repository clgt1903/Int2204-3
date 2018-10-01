package com.tuan3.java;
public class president {
	private String country;
	private String sex;
	private int old;
	public void setCountry(String country) {
		this.country=country;
	}
	public String getCountry() {
		return this.country;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
	public String getSex() {
		return this.sex;
		
	}
	public void setOld(int  old)
	{
		this.old=old;
	}
	public int getOld()
	{
		return this.old;
	}
	public String getInfo()
	{
		return "lanh dao quoc gia: "+country+"\ngioi tinh tong thong: "+sex+"\ntuoi tong thong: "+old;
	}
	public president() {
		country="United States";
		sex="nam";
		old=60;
	}
	public president(String country,String sex,int old){
		this.country=country;
		this.sex=sex;
		this.old=old;
	}
}
