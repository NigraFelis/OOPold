package com.hanbit.oop.serviceImpl;

public class CalendarService {
	private int year,month,date,day;
	
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	public int getMonth(){
		return month;
	}
	
	public void setDate(int date){
		this.date = date;
	}
	public int getDate(){
		return date;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	public int getDay(){
		return day;
	}
	
	public String toString(){
		return "year,month,date,day";
	}
	
}
