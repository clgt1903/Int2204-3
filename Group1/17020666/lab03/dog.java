package com.tuan3.java;

public class dog {
	private String maulong;
	private String gtinh;
	private int tuoi;
	public void setMaulong(String maulong) {
		this.maulong=maulong;
		
		
	}
	public String getMaulong() {
		return this.maulong;
	}
	public void setGtinh(String gtinh) {
		this.gtinh=gtinh;
	}
	public String getGtinh()
	{
		return this.gtinh;
	}
	public void setTuoi(int tuoi) {
		this.tuoi=tuoi;
		}
	public int getTuoi() {
		return this.tuoi;
	}
	public String getInfo() {
		return "mau long cua cho la: "+maulong+"\ngioi tinh cua cho: "+gtinh+"\ntuoi cua cho: "+tuoi;
	}
	public dog() {
		this.maulong="vang";
		this.gtinh="cho gai";
		this.tuoi=3;
	}
	public dog(String maulong,String gtinh,int tuoi) {
		this.maulong=maulong;
		this.gtinh=gtinh;
		this.tuoi=tuoi;
		
	}
}
