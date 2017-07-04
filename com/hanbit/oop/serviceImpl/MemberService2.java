package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;

public class MemberService2 {
	MemberBean session;
	public MemberService2(){
		session = new MemberBean();
	}

	public String getGender(MemberBean member){
		String gender="";
		char ch = member.getSSN().charAt(7);
		switch (ch){
			case '1' :
				gender = "male";
			break;
			case '2' :
				gender = "female";
			break;
			case '3' :
				gender = "male";
			break;
			case '4' :
				gender = "female";
			break;
			case '5' :
				gender = "foreigner";
			break;
			case '6' :
				gender = "foreigner";
			break;
			default: 
				gender = "error";
			break;
		}
		return gender;
	}
		
	public String getAge(MemberBean member){
		
		int age = 0;
		int year = Integer.parseInt(member.getSSN().substring(0,2));
		
		if(17-year>=0){
			age = (17-year);
		}
		else {
			age = (2017-1900-year);
		}
		return String.valueOf(age);
	}
	
	public String join(MemberBean member){
		System.out.println("회원가입시 사용한 ID"+member.getId());
		System.out.println("회원가입시 사용한 PW"+member.getPassword());
		System.out.println("회원가입시 사용한 이름"+member.getName());
		System.out.println("회원가입시 사용한 SSN"+member.getSSN());
		// session 에다가 회원가입시 입력한 정보를 저장하는 소스
		session = member;
		
		session.setId(member.getId());
		session.setPassword(member.getPassword());
		session.setName(member.getName());
		session.setSNN(member.getSSN());
		String result ="환영합니다"+session.getName();
		return result;
	}
	
	public String login(MemberBean member) {
		String login = "";
		
		/*if(!member.getId().equals(loginId)){
			result = "ID is not exeist";
		}
		else if(member.getPassword().equals(loginId)) {
			if(!member.getPassword().equals(loginPw)){
				result = "wrong password";
			}
			else {
				result = toString();
			}
		}*/
	
		return login;
	}
	
}
