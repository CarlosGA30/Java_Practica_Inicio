import java.util.Scanner;

public class calculadoraSwitch {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Que operacion quieres realizar");
		System.out.println("suma,resta,multiplicacion,divicion");
		String opcion=sc.nextLine();
		System.out.print("Escriba el primer numero: ");
		double n1=sc.nextDouble();
		System.out.print("Escriba el segundo numero: ");
		double n2=sc.nextDouble();
		sc.close();
		String ms="";
		
		switch (opcion.toLowerCase()) {
		case "suma":
			ms="la "+opcion+" de "+ n1+" y "+n2+" es: "+(n1+n2) ;
			break;
		case "resta":
			ms="la "+opcion+" de "+ n1+" y "+n2+" es: "+(n1-n2) ;
			break;
		case "multiplicacion":
			ms="la "+opcion+" de "+ n1+" y "+n2+" es: "+(n1*n2) ;
			break;
		case "division":
			ms="la "+opcion+" de "+ n1+" y "+n2+" es: "+(n1/n2) ;
			break;	
		default:
			ms="la operacion "+opcion+" no esta definida";
			break;
		}
		System.out.println(ms);
		
	}
}
