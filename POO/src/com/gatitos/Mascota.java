package com.gatitos;

public interface Mascota {
	static int[] id=new int[1];
	boolean isAdoptado();
	int getIdMascota();
	public static int creaId() {
		id[0]=1+id[0];
		return id[0];
	}
}
