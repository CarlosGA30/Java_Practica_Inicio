import java.util.Scanner;

/*
 * Crear un nuevo proyecto llamado NumeroParImpar
crear el m�todo main
crear una funci�n que eval�e si un n�mero es par o impar (se puede usar el operador ternario)
Imprimir en terminal el resultado

*extra, investigar c�mo usar la clase Scanner en java.

 * */
public class ParInpar {
	

	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    System.out.println("Inserta el numero");
		    //int numero = input.nextInt();
		    
		    //System.out.println("El numero es "+((input.nextInt() % 2==0)?"par":"impar"));
		    /**
		   	if(numero%2==0){
		   		System.out.println("El numero es par");
		   	}else{
		   		System.out.println("El numero es impar");
		   	}
		     /**/
		    
		    /**
		    
		    String resp=(numero%2==0)?" par":" impar";
		    
		    System.out.println("El numero "+numero+resp);
		    
		    
		
		// TODO Auto-generated method stub/* */

	}

}
