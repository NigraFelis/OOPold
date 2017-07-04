package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.GradeBean;

public class GradeService {
   //field

	public int getTotal(GradeBean grade) {
      return grade.getKor()+grade.getEng()+grade.getMath();
   }

   public int getAvg(int total) {
	    return (total/3);
/*	   return ((g.getKor()+g.getEng()+g.getMath())/3);*/
   }
   
   public String getGrade(int avg) {
      //method area
	  String grade = "";
	      switch (avg/10) {
	     
	      case 10 :
	         grade = "A";
	         break;
	      case 9 :
	    	  grade = "A";
	    	  break;
	      case 8 :
	         grade = "B";
	         break;
	      case 7 :
	         grade = "C";
	         break;
	      case 6 :
	         grade = "D";
	         break;
	      default :
	         grade = "F";
	         break;
	      }
	      
	      return grade;

   }

}