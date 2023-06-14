package com.kh.step4;

import javax.swing.JOptionPane;

public class InputDataThread implements Runnable{
	InputThreadTest2 process;
	
	InputDataThread() {}
	InputDataThread(InputThreadTest2 process){
		this.process = process;
	}

	@Override
	public void run() {
		// 1. 데이터 입력
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요....");
		System.out.println("입력하신 숫자는 " + input + "입니다.");
		
		process.inputCheck = true;
	}

}
