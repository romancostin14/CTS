package ro.ase.csie.cts.seminar2.solid;

import java.util.Date;

public class Persoana {
	private String name;
	private String address;
	private Date birthDate;
	private long salary;
	public String getName() {
		return name;
	}
	public Persoana(String name) {
		this.name=name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}
