package com.xworkz.comparelinkedlist;


public class Employee implements  Comparable<Employee> {

	private int employeeId;
	private String employeeName;
	private long phoneNumber;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(int employeeId,String employeeName,long phoneNumber,double salary) {
		super();
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.phoneNumber=phoneNumber;
		this.salary=salary;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId="+employeeId+",employeeName="+employeeName+",phoneNumber="+phoneNumber+",salary="+salary+"]";
	}
	@Override
	public int hashCode() {
		return employeeId;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.employeeId==emp.getEmployeeId() && this.employeeName.equals(emp.getEmployeeName()) && this.phoneNumber== emp.getPhoneNumber()  &&  this.salary==emp.getSalary())
			return true;
		return false;
	}
	
	
	@Override
	public int compareTo(Employee emp) {
		int value = this.employeeName.compareTo(emp.getEmployeeName());
		System.out.println("Invoked compareTo()");
		if(value > 0)
			return 30;
		if(value < 0)
			return -30;
		if(value == 0)
			return 0;
		
	    return 0;
	}
	
	
}
