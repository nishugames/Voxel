package com.nishu.voxel.entity;

import org.lwjgl.util.vector.Vector3f;

public class Entity {
	
	private Vector3f position, rotation;
	
	public Entity(float x, float y, float z){
		this.position = new Vector3f(x, y, z);
		this.rotation = new Vector3f(0, 0, 0);
	}

	public Vector3f getPosition() {
		return position;
	}

	public void setPosition(Vector3f position) {
		this.position = position;
	}

	public Vector3f getRotation() {
		return rotation;
	}

	public void setRotation(Vector3f rotation) {
		this.rotation = rotation;
	}

}
