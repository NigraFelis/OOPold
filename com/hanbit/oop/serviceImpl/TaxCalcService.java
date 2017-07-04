package com.hanbit.oop.serviceImpl;
/*package com.hanbit.oop.service;

import com.hanbit.oop.domain.TaxcalcBean;

public class TaxCalcService {
	
	TaxcalcBean session; //생성자 만들때 이 부분이 의미 하는것은?
	public TaxCalcService(){
		session = new TaxcalcBean();
	}
	
	public double exTaxRatio(TaxcalcBean salar){
	    double taxRatio = 0.0;  
	    if(salar.getSalar()<=1200){
	    	taxRatio = 0.08;
	    }
	    else if(salar.getSalar()>1200&&salar.getSalar()<=4600){
	    	taxRatio = 0.17;
	    }
	    else if(salar.getSalar()>4600&&salar.getSalar()<=8800){
	    	taxRatio = 0.26;
	    }
	    else if(salar.getSalar()>8800){
	    	taxRatio = 0.35;
	    }
	    session.setTaxRatio(taxRatio);//컨트롤에서 만든 bean에 접근을 할 방법을 몰라 새로 만든 섹션에 세율 저장
	    
	    return taxRatio;
	    	
	}
	
	public int exTaxCalc(TaxcalcBean salar){  
		return (int)(salar.getSalar()*(session.getTaxRatio()));
		//컨트롤에서 만든 bean에 저장된연봉과 session에서 만든 bean에 저장된 세율 연산 
	}
	//toString 위치가 서비스에 있어도 되는지? 
	public String toString(TaxcalcBean taxcalcBean) {
		return taxcalcBean.getName()+"\t"+taxcalcBean.getSalar()+"\t"+exTaxRatio(taxcalcBean)+"\t"+exTaxCalc(taxcalcBean) ;
	}
      
}


package com.hanbit.oop.service;
import java.util.Scanner;
public class TaxCalcService {
	public String ExTaxCalc(String name, int salar){
		
		double tax = 0;
		if(salar<=1200){
			tax = 0.08;
		}
		else if(salar>1200&&salar<=4600){
			tax = 0.17;
		}
		else if(salar>4600&&salar<=8800){
			tax = 0.26;
		}
		else if(salar>8800){
			tax = 0.35;
		}
		int result = (int)(salar * tax);;
			
		String Tax = ("********************************\n"
						+"이름  |  연봉  |  세율  |  납부할 세금\n"
						+name+"/t"+salar+"/t"+(int)(tax*100)+"/t"+result+"\n"
						+"********************************\n");
		return Tax;
				
	}
}*/