package com.ezenb2.recipe.dto;

public class IngredientVO {
	
	private Integer rnum; // ?��?��?�� 게시�? 번호
	private String  iname; // ?���? ?���?
	private String  quantity; // ?��?��? 
	private Integer price; // ?���? �?�??
	
	public Integer getRnum() {
		return rnum;
	}
	public void setRnum(Integer rnum) {
		this.rnum = rnum;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
