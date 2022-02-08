package paquete2;

import paquete1.ClaseDefaultJava;
//import paquete1.ClaseProtected;
public class Main extends paquete1.ClaseProtected {

	public static void main(String[] args) {
		ClaseDefaultJava claseDef=new ClaseDefaultJava();
		//claseDef.mostrar();
		
		ClasePrivadaJava privada=new ClasePrivadaJava();
		
		
		privada.nombre="Jose";
		
		privada.telefono="32432432";
		
		//privada.edad=34;
		
		Main protegido=new Main();
		
		protegido.setEdad(23);
		System.out.println(protegido.getEdad());
		

	}

}
