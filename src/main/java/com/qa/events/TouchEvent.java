package com.qa.events;

import com.qa.worldentitys.WorldEntity;

public class TouchEvent{
	private WorldEntity entity1;
	private WorldEntity entity2;
	
	public TouchEvent(WorldEntity entity1, WorldEntity entity2) {
		this.entity1 = entity1;
		this.entity2 = entity2;
	}
	


	public WorldEntity getEntity1() {
		return entity1;
	}
	public void setEntity1(WorldEntity entity1) {
		this.entity1 = entity1;
	}
	public WorldEntity getEntity2() {
		return entity2;
	}
	public void setEntity2(WorldEntity entity2) {
		this.entity2 = entity2;
	}
}
