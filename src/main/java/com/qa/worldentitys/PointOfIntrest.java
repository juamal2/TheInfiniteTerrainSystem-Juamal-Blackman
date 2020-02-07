package com.qa.worldentitys;

public abstract class PointOfIntrest extends WorldEntity{
	

	private String message;
	
	public PointOfIntrest(int x, int y) {
		super(x, y);
	}

	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
