package com.generation.animales;

public class Animal {
	
	private String nombre;
	private String color;
	private int edad;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String comer() {
		return "Estoy comiendo";
	}
	public String dormir() {
		return "Estoy Durmiendo ZZZZZZ";
	}
}
