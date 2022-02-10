package com.generation;

import java.util.HashSet;
import java.util.Set;

public class OrdenTacos {
	Set<Taco> tacos=new HashSet<Taco>();
	float total=0;
	void agregarTaco(Taco taco){
		tacos.add(taco);
		total+=taco.getPrecio();
	}
	float total(){
		return total;
	}
	public String toString() {
		return "OrdenTacos total "+total+" [tacos=" + tacos + "]";
	}
	
}
