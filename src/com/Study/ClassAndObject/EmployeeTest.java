package com.Study.ClassAndObject;

import java.io.*;

public class EmployeeTest {
	
	public static void main(String args[]){
		Employee zhangsan = new Employee("zhangsan");
		Employee lisi = new Employee("lisi");
		
		zhangsan.empAge(29);
		zhangsan.designation="SDET";
		zhangsan.empSalary(9999);
		zhangsan.name="zhangsi";
		zhangsan.printEmployeeInfo();
		
		lisi.empAge(30);
		lisi.empDesignation("Develop");
		lisi.empSalary(10000);
		lisi.printEmployeeInfo();
	}

}
