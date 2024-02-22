package com.lumen.string;

public class Student {
	String studentName;
	int studentId;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		System.out.println("Cloning...");
		return super.clone();
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + "]";
	}
	
}
