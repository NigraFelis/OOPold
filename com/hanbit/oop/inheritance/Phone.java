package com.hanbit.oop.inheritance;

public class Phone {
	protected String name, phoneNo,brand, call;
	public final static String KIND = "집전화";
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPhoneNo(String phoneNo){
		this.phoneNo=phoneNo;
	}
	public String getPhoneNo(){
		return phoneNo;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBradn(){
		return brand;
	}
	public void setCall(String call){
		this.call=call;
	}
	public String getCall(){
		return call;
	}
	
	public String toString(){

		return String.format("%s 에게 %s 번호로 %s %s 를 사용해서 %s", name,phoneNo,brand,call);
				/*(name + "에게"+ phoneNo + "번호로" + brand + "를 사용해서 안녕이라고 통화했다");*/
	}
}
