package lab1;

import java.util.*;

public class Manager extends Employee implements Cloneable{

	public Manager(String name, double salary, String hireDate){
		super(name, salary);
		this.hireDate = hireDate;
	}
	
	public void setDate(String newDate){
		this.hireDate = newDate;
	}
	
	
	public String getDate(){
		return this.hireDate;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	private String hireDate;
	
}
