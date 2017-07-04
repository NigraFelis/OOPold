package com.hanbit.oop.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.Iphone;
import com.hanbit.oop.inheritance.Phone;

public class PhoneController {
	public static void main(String[] args){
		Phone phone = new Phone();
		CellPhone nokia = new CellPhone();
		Iphone iphone = new Iphone();
		AndroidPhone android = new AndroidPhone();
		
		while(true){
            switch (JOptionPane.showInputDialog("0.stop 1.call 2.cellphone 3. Iphone")) {
				case "0":
					JOptionPane.showInputDialog(null, "end");
					return;
					
				case "1":
					phone.setName(JOptionPane.showInputDialog("Insert name"));
					phone.setPhoneNo(JOptionPane.showInputDialog("Insert Num"));
					phone.setBrand(JOptionPane.showInputDialog("Insert Brand"));
					phone.setCall(JOptionPane.showInputDialog("Insert Massage"));
                	JOptionPane.showMessageDialog(null, phone.toString());
					break;
				case "2":
					nokia.setName(JOptionPane.showInputDialog("Insert name"));
					nokia.setPhoneNo(JOptionPane.showInputDialog("Insert Num"));
					nokia.setBrand(JOptionPane.showInputDialog("Insert Brand"));
					nokia.setPortable(true);
					nokia.setCall(JOptionPane.showInputDialog("Insert Massage"));
                	JOptionPane.showMessageDialog(null, nokia.toString());
					
					break;
				case "3":
					iphone.setName(JOptionPane.showInputDialog("Insert name"));
					iphone.setPhoneNo(JOptionPane.showInputDialog("Insert Num"));

					/*iphone.setPortable(true);*/
					
					iphone.setData(JOptionPane.showInputDialog("Insert Massage"));
                	JOptionPane.showMessageDialog(null, iphone.toString());
					
					break;
				case "4":
					android.setName(JOptionPane.showInputDialog("Insert name"));
					android.setPhoneNo(JOptionPane.showInputDialog("Insert Num"));
					android.setData(JOptionPane.showInputDialog("Insert Massage"));
                	JOptionPane.showMessageDialog(null, android.toString());
					
					break;
            }
			
		}
	}
}
