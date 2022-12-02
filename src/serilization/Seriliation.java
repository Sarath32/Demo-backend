package serilization;

import java.io.Serializable;

public class Seriliation implements Serializable{
	
	private String name;
	private String ID;
	private String address;
	private int age;
	
	
	public Seriliation(String name, String iD, String address, int age) {
		super();
		this.name = name;
		ID = iD;
		this.address = address;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
