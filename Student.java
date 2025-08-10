package com.student.manage;

public class Student {
private int studentId;
private String studentName;
private String studenPhone;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudenPhone() {
	return studenPhone;
}
public void setStudenPhone(String studenPhone) {
	this.studenPhone = studenPhone;
}
public String getStudenCity() {
	return studenCity;
}
public void setStudenCity(String studenCity) {
	this.studenCity = studenCity;
}
private String studenCity;
public Student(int studentId, String studentName, String studenPhone, String studenCity) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studenPhone = studenPhone;
	this.studenCity = studenCity;
}
public Student(String studentName, String studenPhone, String studenCity) {
	super();
	this.studentName = studentName;
	this.studenPhone = studenPhone;
	this.studenCity = studenCity;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studenPhone=" + studenPhone
			+ ", studenCity=" + studenCity + "]";
}


}