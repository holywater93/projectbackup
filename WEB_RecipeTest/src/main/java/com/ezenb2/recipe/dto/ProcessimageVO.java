package com.ezenb2.recipe.dto;

public class ProcessimageVO {

	private Integer iseq;  // 조리방법?��?��?
	private String links; // ?���? ?��?��경로
	private String description; // 조리 ?���?
	private Integer rnum; // ?��?��?�� 게시�? 번호
	
	public Integer getIseq() {
		return iseq;
	}
	public void setIseq(Integer iseq) {
		this.iseq = iseq;
	}
	public String getLinks() {
		return links;
	}
	public void setLinks(String links) {
		this.links = links;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getNumber() {
		return rnum;
	}
	public void setNumber(Integer number) {
		this.rnum = number;
	}
	
	
}
