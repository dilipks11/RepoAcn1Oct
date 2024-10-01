package com.accenture.lkm.serialization;

import java.io.Serializable;

public class Employee implements Serializable
{
	private int empId;
	private String empName;
	private double salary;
	private static String orgName="Accenture";
	private transient String hobby;
	public Employee(int empId, String empName, double salary, String hobby) 
	{
		super();
		System.out.println("Employee Created");
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.hobby = hobby;
	}
	public void display()
	{
		System.out.println(" "+empId+" "+empName+" "+salary+" "+hobby);
	}
	public static void showOrg()
	{
		System.out.println("Organization : "+orgName);
	}
	
}
