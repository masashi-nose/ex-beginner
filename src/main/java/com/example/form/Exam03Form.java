package com.example.form;

public class Exam03Form {
	private String itemPrice1;
	private String itemPrice2;
	private String itemPrice3;

	public String getItemPrice1() {
		return itemPrice1;
	}

	public void setItemPrice1(String itemPrice1) {
		this.itemPrice1 = itemPrice1;
	}

	public String getItemPrice2() {
		return itemPrice2;
	}

	public void setItemPrice2(String itemPrice2) {
		this.itemPrice2 = itemPrice2;
	}

	public String getItemPrice3() {
		return itemPrice3;
	}

	public void setItemPrice3(String itemPrice3) {
		this.itemPrice3 = itemPrice3;
	}

	@Override
	public String toString() {
		return "Exam03Form [itemPrice1=" + itemPrice1 + ", itemPrice2=" + itemPrice2 + ", itemPrice3=" + itemPrice3
				+ "]";
	}
	
	

}
