package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.service.GradeService;

public class GradeServiceImpl implements GradeService{
	
	@Override
	public int getTotal(GradeBean grade) {
	      return grade.getKor()+grade.getEng()+grade.getMath();
	   }
	@Override
	public int getAvg(int total) {
	    return (total/3);
   }
	@Override
	public String getGrade(int avg) {
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
