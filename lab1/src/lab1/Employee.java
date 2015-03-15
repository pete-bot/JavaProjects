package lab1;

public class Employee implements Cloneable{

	// public variables go here (inc static)
	
	//public Employee(){} 						//this is the default constructor 
	
	public Employee(String name, double salary){
		this.employeeName = name;
		this.employeeSalary = salary;
	}
			
	public String getName(){
		return this.employeeName;
	}
	
	public double getSalary(){
		return this.employeeSalary;
	}
	
	// private variables go here (inc static)
	private String employeeName;
	private double employeeSalary;

}
