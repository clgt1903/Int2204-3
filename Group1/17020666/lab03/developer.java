package com.tuan3.java;
import java.util.Scanner;

public class developer {
	private String name;
	private int old;
	private String workplace;
	public void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		name=scan.nextLine();
		old=scan.nextInt();
		workplace=scan.nextLine();
		System.out.println(getName());
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	public String getName() {
		return this.name;
	}
	public int getOld() {
		return this.old;
	}
	public String workplace() {
		return this.workplace;
	}
	public developer(developer s) {
		this.name = s.name;
		this.old =s.old;
		this.workplace=s.workplace;
	}
	public String getInfo() {
		return "ten la: "+name+"\ntuoi la: "+old+"\nnoi lam viec: "+workplace;
	}
}
