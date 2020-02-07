package com.brain.OOM;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
	public static class Man{}
	
	public static void main(String ... args) {
		List<Man> mans = new ArrayList<Man>();
		while(true) {
			mans.add(new Man());
		}
	}
}
