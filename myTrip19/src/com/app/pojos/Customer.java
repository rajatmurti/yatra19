package com.app.pojos;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "customer")
public class Customer {
Integer cid;Date dob;
String name,username,password,address,city,contact,panno,creditcard,debitcard,role;
private List<Rooms> room;

public Customer() {
	System.out.println("In cust Pojo Contr");
}
public Customer(Date dob, String name, String username, String password, String address, String city, String contact,
		String panno, String creditcard, String debitcard, String role) {
	super();
	this.dob = dob;
	this.name = name;
	this.username = username;
	this.password = password;
	this.address = address;
	this.city = city;
	this.contact = contact;
	this.panno = panno;
	this.creditcard = creditcard;
	this.debitcard = debitcard;
	this.role = role;
}
@OneToMany(mappedBy = "cust",cascade = CascadeType.ALL)
public List<Rooms> getRoom() {
	return room;
}
public void setRoom(List<Rooms> room) {
	this.room = room;
}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
@Column(length = 20)
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Column(length = 20)
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Column(length = 20)
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Column(length = 20)
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Column(length = 20)
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Temporal(TemporalType.DATE)
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
@Column(length = 12)
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
@Column(length = 20)
public String getPanno() {
	return panno;
}
public void setPanno(String panno) {
	this.panno = panno;
}
@Column(length = 20)
public String getCreditcard() {
	return creditcard;
}
public void setCreditcard(String creditcard) {
	this.creditcard = creditcard;
}
@Column(length = 20)
public String getDebitcard() {
	return debitcard;
}
public void setDebitcard(String debitcard) {
	this.debitcard = debitcard;
}
@Column(length = 20)
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}
