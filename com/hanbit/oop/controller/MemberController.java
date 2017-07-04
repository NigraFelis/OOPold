package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.serviceImpl.MemberService2;

import javax.swing.*;

public class MemberController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MemberService2 memberService = new MemberService2();
		MemberBean member = new MemberBean();

		while(true){
			switch(JOptionPane.showInputDialog("0.end 1.등록 .2로그인")) {
				case "0": 
					System.out.print("end");
				return;
				
				case "1":
					member.setName(JOptionPane.showInputDialog("Name"));
					member.setId(JOptionPane.showInputDialog("Id"));
					member.setPassword(JOptionPane.showInputDialog("Password"));
					member.setSNN(JOptionPane.showInputDialog("SSN"));
					
					System.out.println("wlecome"+memberService.join(member));
					break;

				case "2":
					MemberBean temp = new MemberBean();
					temp.setId(JOptionPane.showInputDialog("Id"));
					temp.setPassword(JOptionPane.showInputDialog("Pw"));
					
					System.out.println(memberService.login(member));

					break;
				
				default:
					break;
			}
		}
	}
	
}
