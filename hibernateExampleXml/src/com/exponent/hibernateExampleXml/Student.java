package com.exponent.hibernateExampleXml;

public class Student {
int id;
String sName;
String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [id=" + id + ", sName=" + sName + ", address=" + address + "]";
}

}
