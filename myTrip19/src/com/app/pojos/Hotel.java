package com.app.pojos;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "hotel")
public class Hotel {
private Integer hid;
//public HotelOwner ho;
private String hname, address,city,restoAvail,type,noOfRooms,swim_pool;
@DateTimeFormat(pattern = "yyyy-mm-dd")
private Date openingDate;
private HotelOwner ownedBy;
private List<Rooms> room;
public Hotel(String hname, String address,String city, String restoAvail, String type, String noOfRooms,
		String swim_pool, Date openingDate,HotelOwner hotelowner) {
	super();
	this.hname = hname;
	this.address = address;
	this.city = city;
	this.restoAvail = restoAvail;
	this.type = type;
	this.noOfRooms = noOfRooms;
	this.swim_pool = swim_pool;
	this.openingDate = openingDate;
	this.ownedBy=hotelowner;
}
public Hotel() {
	System.out.println("in Hotel constr");
}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Integer getHid() {
	return hid;
}
public void setHid(Integer hid) {
	this.hid = hid;
}
@Column(length = 20)
public String getHname() {
	return hname;
}
public void setHname(String hname) {
	this.hname = hname;
}
@Column(length = 20)
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Column(length = 20)
public String getRestoAvail() {
	return restoAvail;
}
public void setRestoAvail(String restoAvail) {
	this.restoAvail = restoAvail;
}
@Column(length = 20)
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Column(length = 20)
public String getNoOfRooms() {
	return noOfRooms;
}
public void setNoOfRooms(String noOfRooms) {
	this.noOfRooms = noOfRooms;
}
@Column(length = 20)
public String getSwim_pool() {
	return swim_pool;
}
public void setSwim_pool(String swim_pool) {
	this.swim_pool = swim_pool;
}
@Temporal(TemporalType.DATE)
public Date getOpeningDate() {
	return openingDate;
}
public void setOpeningDate(Date openingDate) {
	this.openingDate = openingDate;
}
@Column(length = 20)
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@ManyToOne 
@JoinColumn(name = "hoid")
public HotelOwner getOwnedBy() {
	return ownedBy;
}
public void setOwnedBy(HotelOwner ownedBy) {
	this.ownedBy = ownedBy;
}
@OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
public List<Rooms> getRoom() {
	return room;
}
public void setRoom(List<Rooms> room) {
	this.room = room;
}
@Override
public String toString() {
	return "Hotel [hid=" + hid + ", hname=" + hname + ", address=" + address + ", city=" + city + ", restoAvail="
			+ restoAvail + ", type=" + type + ", noOfRooms=" + noOfRooms + ", swim_pool=" + swim_pool + ", openingDate="
			+ openingDate + "]";
}

}