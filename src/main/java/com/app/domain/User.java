package com.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DB")
public class User {
	@Id
	@GeneratedValue
	@Column(name="uId")
	private String uId;
	@Column(name="uName")
	private String uName;
	@Column(name="pwd")
	private String pwd;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String uId, String uName, String pwd) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.pwd = pwd;

	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", pwd=" + pwd + "]";
	}

}
