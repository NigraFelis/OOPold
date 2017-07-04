package com.hanbit.oop.serviceImpl;
import com.hanbit.oop.domain.LeapYearBean;
 
public class LeapYearService {
	public String excuteLeapYear(LeapYearBean year) {
		String result = "";  
		if(year.getYear()%4==0){
			result = "leap year";
	      if(year.getYear()%100==0){
	        result = "nomal year";  
	        if(year.getYear()%400==0){
	        result = "leap year";
	        }
	      }                 
	    }
	    else {
	          result = "nomal year";
	    }     
		return result;
	}
}
/*
public class LeapYearService {
	public String excuteLeapYear(int year) {
		String result = "";  
		if(year.getYear()%4==0){
			result = "leap year";
	      if(year.getYear()%100==0){
	        result = "nomal year";  
	        if(year.getYear()%400==0){
	        result = "leap year";
	        }
	      }                 
	    }
	    else {
	          result = "nomal year";
	    }     
		return result;
	}
}*/