package com.gatitos;

public class Gato implements Mascota {
	private String nombre;
	private int patas;
	private boolean adoptado;
	private int id;
	
	
	public Gato() {
		id=Mascota.creaId();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		if(patas>=0 && patas<=5) 
			this.patas = patas;
		else
			throw new IllegalArgumentException("El numero de patas es invalido");
	}
	@Override
	public boolean isAdoptado() {
		// TODO Auto-generated method stub
		return adoptado;
	}
	@Override
	public int getIdMascota() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + ", id=" + id + "]";
	}
	
	
	
	

}
