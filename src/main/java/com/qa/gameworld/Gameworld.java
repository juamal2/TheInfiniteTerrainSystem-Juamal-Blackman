package com.qa.gameworld;

import java.util.ArrayList;

import com.qa.events.*;
import com.qa.utils.WorldMath;
import com.qa.worldentitys.*;

public class Gameworld {

	private ArrayList<WorldEntity> entitys = new ArrayList<WorldEntity>();

	private ArrayList<TouchEvent> event = new ArrayList<TouchEvent>();

	public ArrayList<TouchEvent> getEvent() {
		return event;
	}

	public void setEvent(ArrayList<TouchEvent> event) {
		this.event = event;
	}

	public ArrayList<WorldEntity> getEntitys() {
		return entitys;
	}

	public void setEntitys(ArrayList<WorldEntity> entitys) {
		this.entitys = entitys;
	}

	public WorldEntity addEntity(String type) {
		switch (type) {
		case "Treasure":
			entitys.add(new Treasure(WorldMath.random10(), WorldMath.random10()));
			return entitys.get(entitys.size() - 1);
		case "Player":
			entitys.add(new Player(WorldMath.random10(), WorldMath.random10()));
			return entitys.get(entitys.size() - 1);
		default:
			return null;
		}
	}

	public void generateTouchEvents() {
		for (int i = 0; i < entitys.size(); i++) {
			try {
				Player player = (Player) entitys.get(i);
				for (int j = 0; j < entitys.size(); j++) {
					if (i != j) {
						WorldEntity entity = entitys.get(j);
						if (player.getLocationX() == entity.getLocationX()
								&& player.getLocationY() == entity.getLocationY()) {
							System.out.println("hit");
							event.add(new TouchEvent(entitys.get(i), entitys.get(j)));
						}
					}
				}
			} catch (ClassCastException failcast) {

			}
		}
	}

	public void clearTouchEvents() {
		event.clear();
	}

}
