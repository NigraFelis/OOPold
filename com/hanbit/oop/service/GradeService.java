package com.hanbit.oop.service;

import com.hanbit.oop.domain.GradeBean;

public interface GradeService {
	public int getTotal(GradeBean grade);
	public int getAvg(int total);
	public String getGrade(int avg);
}
