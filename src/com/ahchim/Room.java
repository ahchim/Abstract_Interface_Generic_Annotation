package com.ahchim;

public abstract class Room {
	public void openDoor(){
		System.out.println("문을 열었습니다.");
	}
	
	public abstract void openWindow();
}
