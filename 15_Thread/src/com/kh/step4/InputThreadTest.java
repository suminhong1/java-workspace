package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest {

	public static void main(String[] args) {

		CountingThread ct = new CountingThread();
		InputDataThread idt = new InputDataThread();
		
		Thread cThread = new Thread(ct, "CountingThread");
		Thread idThread = new Thread(idt, "InputDataThread");
		
		cThread.start();
		idThread.start();
	}

}
