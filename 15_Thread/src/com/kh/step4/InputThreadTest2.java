package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest2 {
	
	boolean inputCheck = false;

	public static void main(String[] args) {
		
		InputThreadTest2 process = new InputThreadTest2();
	
		Thread cThread = new Thread(new InputDataThread(process));
		Thread idThread = new Thread(new CountingThread(process));
		
		cThread.start();
		idThread.start();
		
	}
}