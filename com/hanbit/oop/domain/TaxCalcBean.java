package com.hanbit.oop.domain;

public class TaxCalcBean {
	private String name;
    private int salar;
    private double taxRatio;
    
    public void setName(String name){
          this.name = name;
    }
    public String getName(){
          return name;
    }
    public void setSalar(int salar){
          this.salar = salar;
    }
    public int getSalar(){
          return salar;
    }
    public void setTaxRatio(double taxRatio){
        this.taxRatio = taxRatio;
  }
  public double getTaxRatio(){
        return taxRatio;
  }
}