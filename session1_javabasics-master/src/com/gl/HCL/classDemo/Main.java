package com.gl.HCL.classDemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.empId=6;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		emp.setEmpId(scan.nextInt());
	//	emp.setEmpId(5);
		System.out.println("Enter Employee Name");
		emp.setEmpName(scan.next());
		System.out.println("Enter Employee Email");
		emp.setEmpEmail(scan.next());
		System.out.println(emp);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpEmail());

	}

}
