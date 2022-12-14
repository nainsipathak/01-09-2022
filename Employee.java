package com.oops.demo;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private double salary;


	Employee() //Default constructor
	{


	}


	Employee(int id,String firstName, String lastName,double salary)
	{
	this.id=id;
	this.firstName=firstName;
	this.lastName=lastName;
	this.salary=salary;


	}


	public int getId()
	{
		return id;
	}


	public String getFirstName()
	{
		return firstName;
	}


	public String getLastName(){
		return lastName;
	}


	public String getName()
	{
		return firstName+lastName;
	}


	public double getSalary()
	{
		return salary;
	}


	public void setSalary(double salary)
	{
		this.salary =salary;
	} 


	public double getAnnualSalary()
	{
		return salary*12;
	}


	public double getraiseSalary(int percent)
	{
		return salary*12+(salary*12*(percent/100F));
	}


	@Override
	public String toString()
	{
		return ""+"Employee id:"+id+" Name:"+firstName+" "+lastName+"Salary :"+salary;
	}
	    
	}




