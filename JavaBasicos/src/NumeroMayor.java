import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		/*
		 * Pedir 3 numeros y
		 *  mostrar el mayor
		 * */
		
		
		int numeroMayor=0;
		Scanner scaner= new Scanner(System.in);
		/**
		int n=0;
		 numeroMayor=-2147483648;
		 for(int i=1; i<=3;i++){
			
			System.out.println("Dame el numero "+i);
			n=scaner.nextInt();
		 	numeroMayor=(numeroMayor>n)? numeroMayor : n;
		 }
		 System.out.println("El numero mayor entre "+numeroMayor);
/**/
		 /**/
		System.out.println("Cual numero es mayor?");
		System.out.println("Dame el primer numero");
		
		int n1=scaner.nextInt();
		System.out.println("Dame el Segundo numero");
		int n2=scaner.nextInt();
		System.out.println("Dame el Tercer numero");
		int n3=scaner.nextInt();
		/**
		numeroMayor=(n1>n2)? n1 :n2 ;
		numeroMayor=(numeroMayor>n3)? numeroMayor :n3 ;
		/**/
		/**/
		if(n1>n2) {
			numeroMayor=(n1>n3)? n1 :n3 ;
		}else {
			numeroMayor=(n2>n3)? n2 :n3 ;
		}//**/
		 /**/
		System.out.println("El numero mayor entre "+n1+" "+n2+" "+n3+" es "+numeroMayor);
		//*/
	}
	

}
