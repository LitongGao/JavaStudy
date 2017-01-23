/**
 * 
 */
/**
 * @author gao_l
 *
 */
package com.Study.ClassAndObject;

import java.io.*;

public class Employee{
	String name;
	int age;
	String designation;
	double salary;
	
	//constructor
	public Employee(String name){
		this.name = name;
	}
	
	public void empAge(int empAge){
		this.age = empAge;
	}
	
	public void empDesignation(String empDesign){
		designation = empDesign;
	}
	
	public void empSalary(double empSalary){
		this.salary = empSalary;
	}
	
	public void printEmployeeInfo(){
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Post is " + designation);
		System.out.println("Salary is " + salary);
	}
}

