package com.sample;
import javax.swing.JOptionPane;

public class GUI {
	public static String question(Object[] values, String q) {
		Object selectedValue = JOptionPane.showInputDialog(null,q+" Choose one",
				 "Input",JOptionPane.INFORMATION_MESSAGE, null,values, values[0]);
		return selectedValue.toString();
	}
	
	public static void message(String m) {
		JOptionPane.showMessageDialog(null, m,"information", JOptionPane.INFORMATION_MESSAGE);
	}
}
