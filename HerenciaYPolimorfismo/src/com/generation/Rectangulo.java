package com.generation;

public class Rectangulo extends FiguraGeometrica {

	public Rectangulo() {
		super("Rectangulo");
		// TODO Auto-generated constructor stub
	}

	
	public float calcularArea() {
		return getAlto()*getAncho();
	}

	
	public float perimetro() {
		return getAlto()*4;
	}

	

}
