package com.ezenb2.recipe.dto;

import java.sql.Timestamp;

public class RecipeVO {

	private Integer rnum;  // ? ??Ό ?±λ‘? λ²νΈ
	private String id; // ?? ??΄?
	private String subject; // ? ??Ό ? λͺ?
	private String content; // ? ??Ό ?΄?©
	private Timestamp indate; // κΈ??΄ ? μ§??
	private Integer views; //μ‘°ν?
	private Integer  time; // μ‘°λ¦¬?κ°?
	private Integer likes; // μΆμ²?
	private Integer  type; //  μ’λ₯λ³?
	private Integer  ing; // ?¬λ£λ³
	private Integer theme; // ?λ§λ³
	private Integer rec; // μΆμ 
	private Integer report; // κ²½κ³ ?λ°μ???
	private String thumbnail; // ?Έ?€?Ό ?΄λ―Έμ?
	
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public Integer getRnum() {
		return rnum;
	}
	public void setRnum(Integer rnum) {
		this.rnum = rnum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getIndate() {
		return indate;
	}
	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getIng() {
		return ing;
	}
	public void setIng(Integer ing) {
		this.ing = ing;
	}
	public Integer getTheme() {
		return theme;
	}
	public void setTheme(Integer theme) {
		this.theme = theme;
	}
	public Integer getRec() {
		return rec;
	}
	public void setRec(Integer rec) {
		this.rec = rec;
	}
	public Integer getReport() {
		return report;
	}
	public void setReport(Integer report) {
		this.report = report;
	}
	
	
	
}
