package object.stream;

import java.io.Serializable;

public class Employee implements Serializable{
	private String name;
	private int experience;
	private double salary;
	
	public Employee(String name, int experience, double salary) {
		this.name = name;
		this.experience = experience;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
