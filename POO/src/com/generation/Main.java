package com.generation;

public class Main {

	public static void main(String[] args) {
		Taco taco1= new Taco();
		taco1.setTipoDeTortilla(Tortilla.Maiz_Azul);
		taco1.setNumeroDeTortillas(2);
		taco1.setTipoDeGuisado(Guisado.Pastor);
		taco1.setNumeroDeTortillas(2);
		taco1.setTamanioDeTortila(TamTortilla.mediana);
		taco1.setPrecio(30);
		
		Taco taco2= new Taco(Tortilla.Maiz,Guisado.Alambre,2,TamTortilla.grande,35,Salsa.verde);
		
		OrdenTacos orden1=new OrdenTacos();
		orden1.agregarTaco(taco1);
		orden1.agregarTaco(taco2);
		System.out.println(taco1);
		System.out.println(orden1);
		taco1.setTipoDeTortilla(Tortilla.Harina);
		System.out.println(orden1);

	}

}
