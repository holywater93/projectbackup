package com.ezenb2.recipe.dto;

import java.sql.Timestamp;

public class MemberVO {

	private String id; // ??΄?
	private String pwd; // λΉλ?λ²νΈ
	private String name; // ?΄λ¦?
	private String phone; // ? ?λ²νΈ
	private String email; // ?΄λ©μΌ
	private String nick; // ??€?
	private String address1; // μ£Όμ1
	private String address2; // μ£Όμ2
	private String zip_num; // μ§μ°?Έμ£Όμ?
	private Timestamp indate; // κ°??? μ§??
	private String img; // ?λ‘ν?¬μ§??
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getZip_num() {
		return zip_num;
	}
	public void setZip_num(String zip_num) {
		this.zip_num = zip_num;
	}
	public Timestamp getIndate() {
		return indate;
	}
	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
}
