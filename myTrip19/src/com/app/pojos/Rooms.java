package com.app.pojos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Rooms {
Integer roomId, roomNo;
private String descr;
String roomType;
Integer rate;
private Hotel hotel;
private Customer cust;

@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Integer getRoomId() {
	return roomId;
}
public void setRoomId(Integer roomId) {
	this.roomId = roomId;
}
public Integer getRoomNo() {
	return roomNo;
}
public void setRoomNo(Integer roomNo) {
	this.roomNo = roomNo;
}
public String getDescr() {
	return descr;
}
public void setDescr(String descr) {
	this.descr = descr;
}
public String getRoomType() {
	return roomType;
}
public void setRoomType(String roomType) {
	this.roomType = roomType;
}
public Integer getRate() {
	return rate;
}
public void setRate(Integer rate) {
	this.rate = rate;
}
@ManyToOne 
@JoinColumn(name = "hid")
public Hotel getHotel() {
	return hotel;
}
public void setHotel(Hotel hotel) {
	this.hotel = hotel;
}
@ManyToOne 
@JoinColumn(name = "cid")
public Customer getCust() {
	return cust;
}
public void setCust(Customer cust) {
	this.cust = cust;
}

}