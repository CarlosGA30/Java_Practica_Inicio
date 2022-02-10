package com.generation;

enum Guisado {Bistek,Suadero,Pastor,Alambre}
enum Tortilla{Nopal,Maiz,Harina,Maiz_Azul}
enum TamTortilla{mediana,chica,grande}
enum Salsa{verde,roja,de_la_que_no_pica,Sin_salsa}
public class Taco {
	private Tortilla tipoDeTortilla;
	private Guisado tipoDeGuisado;
	private int numeroDeTortillas;
	private TamTortilla tamanioDeTortila;
	private float precio;
	private Salsa tipoDeSalsa;
	
	
	
	public Taco() {
	}
	
	
	
	public Taco(Tortilla tipoDeTortilla, Guisado tipoDeGuisado, int numeroDeTortillas, TamTortilla tamanioDeTortila,
			float precio, Salsa tipoDeSalsa) {
		super();
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortillas = numeroDeTortillas;
		this.tamanioDeTortila = tamanioDeTortila;
		this.precio = precio;
		this.tipoDeSalsa = tipoDeSalsa;
	}
	public Taco( Guisado tipoDeGuisado, TamTortilla tamanioDeTortila,
			float precio) {
		super();
		this.tipoDeTortilla = Tortilla.Maiz;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortillas = 2;
		this.tamanioDeTortila = tamanioDeTortila;
		this.precio = precio;
		this.tipoDeSalsa = Salsa.Sin_salsa;
	}



	public Tortilla getTipoDeTortilla() {
		return tipoDeTortilla;
	}



	public void setTipoDeTortilla(Tortilla tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}



	public Guisado getTipoDeGuisado() {
		return tipoDeGuisado;
	}



	public void setTipoDeGuisado(Guisado tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}



	public TamTortilla getTamanioDeTortila() {
		return tamanioDeTortila;
	}



	public void setTamanioDeTortila(TamTortilla tamanioDeTortila) {
		this.tamanioDeTortila = tamanioDeTortila;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		
		if(precio>0)
			this.precio = precio;
		else
			throw new IllegalArgumentException("La cantidad de tortillas "+numeroDeTortillas+" no es posible");
	}



	public Salsa getTipoDeSalsa() {
		return tipoDeSalsa;
	}



	public void setTipoDeSalsa(Salsa tipoDeSalsa) {
		this.tipoDeSalsa = tipoDeSalsa;
	}



	public int getNumeroDeTortillas() {
		return numeroDeTortillas;
	}

	public void setNumeroDeTortillas(int numeroDeTortillas) {
		if(numeroDeTortillas>0 && numeroDeTortillas<=4)
			this.numeroDeTortillas = numeroDeTortillas;
		else
			throw new IllegalArgumentException("La cantidad de tortillas "+numeroDeTortillas+" no es posible");
	}

	void preparar() {
		System.out.println("Preparando tu rico taco de "+tipoDeGuisado);
	}
	void vender() {
		System.out.println("Taco vendido");
		
	}
	void ponerSalsa(){
		System.out.println("Agregando Salsa");
		
	}
	void subirPrecio(float extra) {
		precio+=extra;
	}
	@Override
	public String toString() {
		return "Taco [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortillas="
				+ numeroDeTortillas + ", tamanioDeTortila=" + tamanioDeTortila + ", precio=" + precio + ", tipoDeSalsa="
				+ tipoDeSalsa + "]";
	}
	
}
