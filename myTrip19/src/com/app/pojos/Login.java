package com.app.pojos;
import javax.persistence.*;
@Entity
@Table(name = "login")
public class Login {
private Integer loginId;
private String username,password,priviledge;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Integer getLoginId() {
	return loginId;
}
public void setLoginId(Integer loginId) {
	this.loginId = loginId;
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
public String getPriviledge() {
	return priviledge;
}
public void setPriviledge(String priviledge) {
	this.priviledge = priviledge;
}

}