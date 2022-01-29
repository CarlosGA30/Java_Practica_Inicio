import java.util.Scanner;

public class Descuentos {
	/*
	// solicitar el total de una compra por consola.
			// si la cuenta es de menos de 1000
			// sila cuenta es de 1001 - 4999 10%
			// si la cuenta es de 5001 a 9999 20%
			// si la copra es de 10000 o más 30%*/
	public static void main(String[] args) {
		int total;
		double descuento=0;
		Scanner scaner= new Scanner(System.in);
		System.out.println("Dame el total de la compra");
		total=scaner.nextInt();
		if(total>=10000) {
			descuento=.3;
			
		}else if(total>=5000 && total<10000) {
			descuento=.2;
			
		}else if(total>=1000 && total<5000) {
			descuento=.1;
			
		}

		System.out.println("Su descuento es "+descuento*100+"% y su total "+(total-(total*descuento)));
		
	}


}
