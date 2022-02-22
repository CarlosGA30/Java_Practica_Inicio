package com.generation.animales;

public class Gato extends Animal implements Mascota {
	@Override
	public String jugar() {
		
		return "Estoy jugando\n";
	}

	@Override
	public String correr() {
		// TODO Auto-generated method stub
		return "Estoy corriendo\n";
	}

	@Override
	public String baniar() {
		// TODO Auto-generated method stub
		return "Me Estoy baniando\n";
	}

}
