package com.qa.worldentitys;

public abstract class WorldEntity {
	private int locationX = 0;
	private int locationY = 0;
	
	public WorldEntity(int x,int y) {
		setLocationX(x);
		setLocationY(y);
	}
	
	public void setLocation(int x, int y) {
		setLocationX(x);
		setLocationY(y);
	}

	public int getLocationX() {
		return locationX;
	}

	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}

	public int getLocationY() {
		return locationY;
	}

	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}
	
	
	
	
}
