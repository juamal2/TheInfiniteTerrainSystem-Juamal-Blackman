package com.qa.worldentitys;

public class Player extends WorldEntity implements Moveable {
	private String name = "";
	
	public Player(int x, int y) {
		super(x,y);
	}
	
	public Player(int x, int y, String name) {
		super(x,y);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void move(String direction) {
		switch (direction) {
		case "NORTH":
			this.setLocationY(this.getLocationY()+1);
			break;
		case "SOUTH":
			this.setLocationY(this.getLocationY()-1);
			break;
		case "EAST":
			this.setLocationX(this.getLocationX()+1);
			break;
		case "WEST":
			this.setLocationX(this.getLocationX()-1);
			break;
		default:
		}
		
	}



	
}
