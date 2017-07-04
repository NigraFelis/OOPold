package com.hanbit.oop.controller;
import java.util.Scanner;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.domain.LeapYearBean;
import com.hanbit.oop.domain.TaxCalcBean;
import com.hanbit.oop.serviceImpl.BMIService;
import com.hanbit.oop.serviceImpl.CalcService;
import com.hanbit.oop.serviceImpl.GradeService;
import com.hanbit.oop.serviceImpl.LeapYearService;
import com.hanbit.oop.serviceImpl.SecondCalcService;

import javax.swing.*;

public class GradeController {
      public static void main(String[] args) {
            
        Scanner s = new Scanner(System.in);
        CalcService s2 = new CalcService();
        LeapYearService leapYearService = new LeapYearService();
        LeapYearBean leapYearBean = new LeapYearBean();
        TaxCalcBean taxcalcBean = new TaxCalcBean();
        SecondCalcService s6 = new SecondCalcService();
        BMIService bmi = new BMIService();
        GradeService g = new GradeService();
        GradeBean gradebean = new GradeBean();
        
        
        while(true){
            
              switch (JOptionPane.showInputDialog("0.stop 1.grade 2.LeapYear 3.Tax")) {
                    case "0":
                          System.out.print("end");
                    return;
              
                    case "1" :
        				gradebean.setName(JOptionPane.showInputDialog("name?"));
        				gradebean.setMajor(JOptionPane.showInputDialog("major?"));
        				gradebean.setKor(Integer.parseInt(JOptionPane.showInputDialog("kor?")));
        				gradebean.setEng(Integer.parseInt(JOptionPane.showInputDialog("eng?")));
        				gradebean.setMath(Integer.parseInt(JOptionPane.showInputDialog("math?")));
        				
        				JOptionPane.showMessageDialog(null, g.getGrade(g.getAvg(g.getTotal(gradebean))));
        				
        				break;
              
                    case "2":
                    	leapYearBean.setYear(Integer.parseInt(JOptionPane.showInputDialog("insert Year\n"))); 
                    	
                    	JOptionPane.showMessageDialog(null, leapYearService.excuteLeapYear(leapYearBean));
                    	/*JOptionPane.showMessageDialog(null, leapYearService.excuteLeapYear(leapYearBean.getYear()));*/
                    	
                    	break;
                    
                    case "3":
                    	
                    	taxcalcBean.setName(JOptionPane.showInputDialog("Insert name")); 
                    	taxcalcBean.setSalar(Integer.parseInt((JOptionPane.showInputDialog("Insert salar"))));
                    	
                    	/*JOptionPane.showMessageDialog(null, taxcalcBean.getName()+"\t"+taxcalcBean.getSalar()+"\t"+taxCalc.exTaxRatio(taxcalcBean)+"\t"+taxCalc.exTaxCalc(taxcalcBean));*/
                    	/*JOptionPane.showMessageDialog(null, taxCalc.toString(taxCalcBean));*/
                    	/*System.out.println("이름 입력");
	                    String name = s.next();
	                      taxCalc.setName(name);
	                      System.out.println("연봉 입력");
	                      int salar = s.nextInt();
	                      taxCalc.setSalar(salar);
	                      taxCalc.setTaxRatio();
	                      taxCalc.setTaxCalc();
	                      System.out.print("************************************************"+"\n"
	                                              +"이름"+"\t"+"연봉"+"\t"+"세율"+"\t"+"납부할 세금"+"\n"
	                                              +name +"\t"+salar+"\t"+taxCalc.getTaxRatio()+"\t"+taxCalc.getTaxCalc()+"\n"
	                                              +"************************************************"+"\n");*/
	                      
	                      break;
                                                               
                    case "5":
                          System.out.println("초를 시간과 분으로 바꾸어 주는 프로그램입니다.\n초를입력해주세요.");
                          int second = s.nextInt();
                          s6.setSecond(second);
                          s6.setSecondCalc();
                          System.out.println(s6.getSecondCalc());
                    
                          
                          break;
                    case "6":
                          System.out.println("insert num1");
                          String a = s.next();
                          System.out.println("insert num2");
                          String b = s.next();
                          String sumResult = s2.calcPlus(a, b);
                          System.out.println(sumResult);
                          break;
                    
                        
                  }
            }
      }
}