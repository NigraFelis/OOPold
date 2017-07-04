package com.hanbit.oop.serviceImpl;

public class CalcService {
			
	public String calcPlus(String a, String b){
		return String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));
	}
	public String calcMinus(String a, String b){
		return String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
	}
	public String calcBy(String a, String b){
		return String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
	}
	public String calcDivide(String a, String b){
		return String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
	}
	public String calcTax(String num1, String num2){	
		String result = "";
		return result;
	}
	public String calcTime(String second){	
		String result = "";
		return result;
	}	
}
