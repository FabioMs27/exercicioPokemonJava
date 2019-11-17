package br.com.igor.view;

import javax.swing.JOptionPane;

public abstract class View {
	
	public static String getString(String msg) {
		String aux = JOptionPane.showInputDialog(null, msg);
		return aux;
	}
	
	public static int getInt(String msg) {
		int aux = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
		return aux;
	}
	
	public static void getMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg); 
	}
	
	public static void getMsgError(String msg) {
		JOptionPane.showMessageDialog(null, msg, null, JOptionPane.INFORMATION_MESSAGE);
	}
}
