package com.gl.HCL.classDemo;
// Employee Pojo
public class Employee {
	int empId;
	String empName;
	String empEmail;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
    public String toString() {
    	return "Id = "+empId
    			+"  Name is= "+empName
    			+" Email id is= "+empEmail;
    }


}
