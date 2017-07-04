package com.hanbit.oop.serviceImpl;


import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService {
	int count;
	
	MemberBean member;
	MemberBean[] list;
	public AdminServiceImpl(int limit){
		count=0;
		member = new MemberBean();
		list = new MemberBean[limit];
	}
	
	@Override
	public void addMember(MemberBean member) {
		list[count] = member;
		for(int i=0;i<(count+1);i++){
			System.out.println(list[i].toString());
		}
		count ++;
	}

	@Override
	public MemberBean[] getMembers() {
		return list;
	}

	@Override
	public int countMembers() {
		return count;
	}

	/*@Override
	public MemberBean findById(String id) {
		MemberBean result = null;
		for(int i=0; i<list.length; i++){
			if(id.equals (list[i].getId())){
				result = list[i];
			}
		}
		return result;
	}*/
	@Override
	public MemberBean findById(String id) {
		member=new MemberBean();
		for(int i=0;i<list.length;i++){
			if(id.equals(list[i].getId())){
				member=list[i];
				
			}
		}
		return member;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int count=0;
	
		for(int i=0; i<list.length; i++){
			if(name.equals (list[i].getName())){
				count++;
			}
		}
		MemberBean[] temp = new MemberBean[count];
		
		/*for(int i=0; i<count; i++){
			for(int j=0; j<list.length; j++){
				if(name.equals (list[j].getName())){
					temp[i] = list[j];	
				}
			}
		}*/
		
		int j=0;
		for(int i=0;i<list.length;i++){
			if(name.equals(list[i].getName())){
				temp[j]=list[i];
				j++;
			}
			if(count==j){
				break;
			}
		}
		return temp;
	}

	@Override
	public void updatePass(MemberBean member) {
		
		for(int i=0;i<list.length;i++){
			if(member.getId().equals(list[i].getId())){
				list[i].setPassword(member.getPassword());;
			}
		}
		
		
		
	}
}
