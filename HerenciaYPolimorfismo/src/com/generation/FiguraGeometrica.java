package com.generation;

 public abstract class FiguraGeometrica {
	private String nombre;
	private float alto;
	private float ancho;
	
	public FiguraGeometrica(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getAlto() {
		return alto;
	}


	public void setAlto(float alto) {
		this.alto = alto;
	}


	public float getAncho() {
		return ancho;
	}


	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public abstract float calcularArea() ;
	
	public abstract float perimetro();

}
