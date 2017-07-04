package com.hanbit.oop.inheritance;

public class Iphone extends CellPhone{
	protected String data;
	// KIND = 스마트폰이라 오버라이딩
	public final static String KIND="스마트폰";
	public final static String BRAND="아이폰";
	public void setData(String data){
		this.data=data;
		setPortable(true);
	}
	@Override
	public String toString (){
		//스마트폰이기 떄문에 이동가능한 상태로 홍길동에게 010번호로
		//아이폰을 사용해서 안녕이라고 문자를 전송했다
		return String.format("%s 이기 때문에 %s 상태로 %s 에게 %s 번호로 %s 을 사용해서 이라고 문자를 전송",
				KIND,
				move,
				name,
				phoneNo,
				BRAND,
				data
		);
		
	}
}
