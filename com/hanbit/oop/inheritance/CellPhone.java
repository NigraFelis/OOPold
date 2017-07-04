package com.hanbit.oop.inheritance;

public class CellPhone extends Phone{
	private boolean portable;
	protected String move;
	public final static String KIND="휴대폰";
	
	public void setMove(String move){
		this.move=move;
	}
	public String getMove(){
		return move;
	}
	
	public void setPortable(boolean portable){
		if(portable){
			this.setMove("이동 가능");
		}
		else{
			this.setMove("이동 불가능");
		}
		this.portable=portable;
	}
	public boolean isPortable(){
		return portable;
	}
	
	
	@Override
	public String toString (){
		String.format("%s 에게 %s 번호로 %s %s 를 사용해서 %s",
		super.name,
		super.phoneNo,
		KIND,
		super.call
		);
		
		return "";
	}
}
