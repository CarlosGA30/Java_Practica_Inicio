package arreglos;
//Crea una clase llamara ManipularArreglo
//crea un array con los siguientes números enteros:
//
//1, 6, 45, 53, 80, 102, 145, 326, 450, 892
//Crea un programa que use un ciclo que tome los números de arreglo y devuelva la suma total, la suma de los números pares y la suma de los números impares.

public class ManipularArreglo {
	public static void main(String[] args) {
//		int[] numEnteros=new int[]{1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int[] numEnteros=new int[10];
		for (int i = 0; i < numEnteros.length; i++)
			numEnteros[i]=(int)(Math.random()*1000);

		int sumPar=0;
		int sumInpar=0;
		System.out.println("\nla Suma de los Numeros inpares y pares del arreglo es: ");
		for (int i = 0; i < numEnteros.length; i++) {
			System.out.print(numEnteros[i]+" ");
			if(numEnteros[i]%2==0) {
				sumPar+=numEnteros[i];
			}
			else {
				sumInpar+=numEnteros[i];
			}
		}
		System.out.println("\nla Suma de los Numeros inpares y pares del arreglo es: ");
		System.out.println("Pares: "+sumPar);
		System.out.println("Inpares: "+sumInpar);
		System.out.println("Total : "+(sumInpar+sumPar));
	}
	
}
