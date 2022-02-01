package arreglos;

public class Arreglos {
	public static void main(String[] args) {
		int numeros[];
		numeros=new int[4];
		String[] nombres=new String[5]; 
		
		String[] frutas=new String[]{"Manzana","Pera","Uva","Piña"};
		numeros[0]=100;
		numeros[1]=10;
		numeros[2]=1;
		numeros[3]=1000;
		nombres[0]="jose";
		nombres[1]="pepe";
		nombres[2]="charlie";
		nombres[3]="carlos";
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			System.out.println(nombres[i]);
			System.out.println(frutas[i]);
			System.out.println();
		}
		
		
	}
}
