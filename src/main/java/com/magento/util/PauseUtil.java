package com.magento.util;

public class PauseUtil {
	
	public static void pause(int enterTime){
		try {
			Thread.sleep(enterTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
