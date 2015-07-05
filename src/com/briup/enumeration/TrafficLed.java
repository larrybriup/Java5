package com.briup.enumeration;

public class TrafficLed extends Thread{
	//自编红绿灯
	public void shift(Led led) throws InterruptedException {
		switch (led) {
		case RED:
			System.out.println("红灯!stop");
			for (int i = 0; i < 30; i++) {
				System.out.println((i+1)+"红秒");
				sleep(1000);
			}
			System.out.println();
			break;
		case GREEN:
			System.out.println("绿灯!go");
			for (int i = 0; i < 30; i++) {
				System.out.println((i+1)+"绿秒");
				sleep(1000);
			}
			System.out.println();
			break;
		case YELLOW:
			System.out.println("黄灯!wai and turn!");
			for (int i = 0; i < 10; i++) {
				System.out.println((i+1)+"黄秒");
				sleep(1000);
			}
			System.out.println();
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		TrafficLed tl = new TrafficLed();
		while(true){
			tl.shift(Led.RED);
			tl.shift(Led.YELLOW);
			tl.shift(Led.GREEN);
			tl.shift(Led.YELLOW);
		}
		
	}

}

enum Led {
	RED, GREEN, YELLOW
}