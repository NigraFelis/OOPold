package com.hanbit.oop.serviceImpl;
public class SecondCalcService {
      private int second;
      private String time;
      
      public void setSecond(int second){
            this.second = second;
      }
      public int getSecond(){
            return second;
      }
            
      public void setSecondCalc(){
            time = String.valueOf((second/3600)+"시"+(second%3600/60)+"분"+(second%3600%60)+"초");
      }
      public String getSecondCalc(){
            return time;
      }
}


/*package com.hanbit.oop.service;

public class SecondCalcService {
	public int[] ExSecandCalc(int sec){
		
		
		시 - 초 /3600 의 int값
		분 - 초 / 3600 한 나머지 값을 / 60 의 int값
		초 - 초 / 3600 하고 나머지 값 /60의 나머지 값은 초
		
		
		int arr[] = {sec/3600, sec % 3600 / 60, sec % 3600 % 60};
		
		return arr;
 
		
	}
}*/
