import java.util.Scanner;

public class EstructudaDeControlIf {
	/*
	 * Estructuras de control de flujo sirven para
	 * Cmbiar el flujo de nuestro programa
	 * evaluando una condicion y apartir de una condicion 
	 * se realiza una condicion u otra
	 * */
	 public static void main(String[] args) {
		System.out.println("Introduce tu edad");
		Scanner scaner= new Scanner(System.in);
		int edad=scaner.nextInt();
		String mensaje="";
		if(edad>=18) {
			mensaje="Eres mayor de edad";
		}else {
			mensaje="Eres menor de edad";
		}
		System.out.println(mensaje);
		/*
		 * Pedir 3 numeros y
		 *  mostrar el mayor
		 * */
		
		
	 }
}
