package com.hanbit.oop.inheritance;

public class AndroidPhone extends Iphone{
	// Brand 갤럭시 노트
	// data를 오버라이딩 해서 카톡메세지 라고 출력시킴
	public final static String KIND="안드로이드";
	public final static String DATA="카톡메세지";
	
	private String size,appl;
	
	public void setSize(String size){
		setPortable(true);
		this.size = size;
	}
	public String getSize(){
		return size;
	}
	public void setAppl(String appl){
		this.appl = appl;
	}
	public String getAppl(){
		return appl;
	}
	
	
	@Override
	public String toString (){
		//스마트폰이기 떄문에 이동가능한 상태로 홍길동에게 010번호로
		//갤럭시 노트 6인치를 사용해서 안녕이라고 어플을 전송했다
		return String.format("%s 이기 때문에 %s 상태로 %s 에게 %s 번호로 %s %인치을 사용해서 %s 이라고 전송",
				KIND,
				move,
				name,
				phoneNo,
				BRAND,
				size,
				data,
				appl
		);
		
	}
}
