package com.brain.proxy;

import java.util.Random;

public class Car implements Moveable {

	public void move() {
		//??????
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("???????....");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
