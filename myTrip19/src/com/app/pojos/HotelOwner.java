package com.app.pojos;

import java.util.List;

import javax.persistence.*;
@Entity
@Table(name = "hotelOwner")
public class HotelOwner {
	private Integer hoid;
	private String name,username,password,address,city,contact,role;
	private List<Hotel> hotel;
	public HotelOwner(String name, String username, String password, String address, String city, String contact,
			String role) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.city = city;
		this.contact = contact;
		this.role = role;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getHoid() {
		return hoid;
	}
	public void setHoid(Integer hoid) {
		this.hoid = hoid;
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
	@Column(length = 20)
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Column(length = 10)
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@OneToMany(mappedBy = "ownedBy",cascade = CascadeType.ALL)
	public List<Hotel> getHotel() {
		return hotel;
	}
	public void setHotel(List<Hotel> hotel) {
		this.hotel = hotel;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "HotelOwner [hoid=" + hoid + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", address=" + address + ", city=" + city + ", contact=" + contact + "]";
	}	
}
