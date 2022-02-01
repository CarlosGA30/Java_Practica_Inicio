import java.io.IOException;
import java.util.Scanner;

public class ScannerYBuffer {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("introduce un numero ");
		int numero=sc.nextInt();
//		System.out.print("introduce un numero ");
//		int numero2=sc.nextInt();
		sc.nextLine();
		System.out.print("intoduce tu nombre ");
		String nombre=sc.nextLine();
		sc.close();
		
		System.out.println("tu nombre es "+nombre
				+" tu numero es "+numero
//				+" tu numero2 es "+numero2
				);
	}

}
