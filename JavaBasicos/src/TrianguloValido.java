import java.util.Scanner;

public class TrianguloValido {
	public static void main(String[] args) {
		int totalAngulos=0;
		Scanner scaner= new Scanner(System.in);
		System.out.println("Coloca el valor de los 3 angulos ");
		System.out.println("Dame el primer angulo ");
		totalAngulos+=scaner.nextInt();
		System.out.println("Dame el segundo angulo ");
		totalAngulos+=scaner.nextInt();
		System.out.println("Dame el tercer angulo ");
		totalAngulos+=scaner.nextInt();
		System.out.println(""+((totalAngulos==180)?"si":"no")+" es un triangulo ");
		/**if(totalAngulos==180) {
			System.out.println("si es un triangulo ");
		}else {
			System.out.println("no es un triangulo ");
		}/**/
	}
}
