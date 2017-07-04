package com.hanbit.oop.serviceImpl;
public class BMIService {
      private double height, weight, bmi;
      private String result;
      public void setHeight(double height){
            this.height=height;
      }
      public double getHeight(){
            return height;
      }
      public void setWeight(double weight){
            this.weight=weight;
      }
      public double getWeight(){
            return weight;
      }
      public void setBMI(){
            bmi=weight/(height*height);
      }
      public double getBMI(){
            return bmi;
      }
      public void setResult(){
            if(bmi<=24.9) {
                  if(bmi<=18.5) {
                        result = "low weight";  
                  }
                  else{
                        result = "nomal";
                  }
            }
            else if(bmi>24.9) {
                  if(bmi>=29.9) {
                        result = "over weight"; 
                  }
                  else{
                        result = "fat";
                  }
            }     
      }
      public String getResult() {
            return result;
      }
}
