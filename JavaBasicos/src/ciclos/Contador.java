package ciclos;

public class Contador {
//	Crea una clase llamada contador
//
//	Escribe un ciclo que haga que un contador vaya de 15 a 90, contando de 3 en 3.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 25; i++) {
			System.out.println("el numero "+(i+1)+" es "+(i*3+15));
		}
		int num =15;
		while(num<=90){
			System.out.println("el numero es "+(num));
			num+=3;
		}

	}

}
