package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;

public class MemberServiceImpl implements MemberService {
	MemberBean session;
	public MemberServiceImpl(){
		session=new MemberBean();
	}
	@Override
	public String getGender(MemberBean member) {
		String gender="";
		char ch = member.getSSN().charAt(7);
		switch(ch){
		case '1' : case '3' :
			gender = "남자"; 
			break;
		case '2' : case '4' :
			gender = "여자";
			break;
		case '5' : case '6' :
			gender = "외국인";
			break;
		default :
			gender = "기타";
			break;
		}
		return gender;
	}

	@Override
	public String getAge(MemberBean member) {
		int age=0;
		String birth = member.getSSN().substring(0,2);
		if(Integer.parseInt(birth)>=17){
			age = 2017-Integer.parseInt(birth)-1900+1;
		}else{
			age = 2017-Integer.parseInt(birth)-2000+1;
		}
		return String.valueOf(age);
	}

	@Override
	public String join(MemberBean member) {
		session=member;
		return "환영합니다 "+session.getName();
	}

	@Override
	public String login(MemberBean member) {
		return (session.getId().equals(member.getId())&&session.getPassword().equals(member.getPassword()))?
				"SUCCESS":"로그인실패..";
	}

}