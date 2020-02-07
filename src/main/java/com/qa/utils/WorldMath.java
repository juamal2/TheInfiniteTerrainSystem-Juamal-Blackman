package com.qa.utils;
import java.lang.Math;

import com.qa.worldentitys.WorldEntity;
public class WorldMath {
	
	
	public static int random10() {
		int number = (int) (Math.random()*10);
		return number;
	}
	
	
	public static double distance2d(WorldEntity en1 , WorldEntity en2) {
		double x;
		double y;
		double z;
		
		if (en1.getLocationX() >= en2.getLocationX()) {
			x = en1.getLocationX() - en2.getLocationX();
		}else {x = en2.getLocationX() - en1.getLocationX();}
		if (en1.getLocationY() >= en2.getLocationY()) {
			y = en1.getLocationY() - en2.getLocationY();
		}else {y = en2.getLocationY() - en1.getLocationY();}
		z = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
		return z;
	}
}
