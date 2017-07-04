package com.hanbit.oop.controller;

import javax.swing.JOptionPane;
import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;

public class AdminController {
//1회원 추가 2.회원수 보기 3회원 목록보기
	
	public static void main(String[] args) {
		String sCount=(JOptionPane.showInputDialog("관리자님 총 최원수를 입력해주세요"));
		int count = Integer.parseInt(sCount);
		AdminService service = new AdminServiceImpl(count);
		MemberBean member = null;
		while(true){
			switch(JOptionPane.showInputDialog("0.end 1.추가 .2수 3.목록 4.findById 5.findByName 6.update")){
			case "0" :
				return;
			case "1" :
				member = new MemberBean();
				String[] arr = JOptionPane.showInputDialog("name/id/pass/snn").split("/");
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPassword(arr[2]);
				member.setSNN(arr[3]);
				service.addMember(member);
				JOptionPane.showMessageDialog(null, "welecome");
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, service.countMembers());
				break;
				
			case "3" :
				MemberBean[] list = service.getMembers();
				String result[] = new String[list.length];
				
				for(int i=0; i<list.length; i++){
					result[i] = "name:"+list[i].getName() + " Id:"+list[i].getId() + " SSN:"+list[i].getSSN() + " Pw" +list[i].getPassword();
				}
				JOptionPane.showMessageDialog(null, result);
				break;
			
			case "4":
				
				JOptionPane.showMessageDialog(null, (service.findById(JOptionPane.showInputDialog("insert id"))).toString());
				break;
				
			case "5":
				String name = JOptionPane.showInputDialog("insert find id");
				MemberBean[] members=service.findByName(name);
				String result2="";
				if(members.length == 0){
					result2 = "조회할 이름이 없습니다";
				}
				else{
					for (int i=0; i<members.length;i++){
						result2+=members[i].toString()+"\n";
					}
				}
				JOptionPane.showMessageDialog(null, result2);
				
				/*JOptionPane.showMessageDialog(null, (service.findByName(JOptionPane.showInputDialog("insert name"))));*/
				break;
				
			case "6":
				
				member = new MemberBean();
				member.setId(JOptionPane.showInputDialog("insert find id"));
				member.setPassword(JOptionPane.showInputDialog("insert update password"));
				service.updatePass(member);
				
				JOptionPane.showMessageDialog(null, "비밀번호 변경");
				break;
			}
		}
	}
}
