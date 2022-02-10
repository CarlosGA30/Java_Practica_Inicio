package com.generation;

public class Triangulo extends FiguraGeometrica {

	public Triangulo() {
		super("Triangulo");
		// TODO Auto-generated constructor stub
	}

	
	public float calcularArea() {
		return getAlto()*getAncho()/2;
	}


	@Override
	public float perimetro() {
		return getAncho()*3;
		
	}

}
