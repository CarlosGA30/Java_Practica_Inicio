import java.util.Scanner;

import javax.swing.text.DefaultCaret;

public class EstructuraDeControlSwitch {
	/*
	 switch(){
	 	case "valor":
	 		//codigo
	 		//break;
	 		
	 	case "n":
	 		//codigo
	 		//break;
	 	default:
	 		//codfigo a ejecutar
	 }
	 * */

	public static void main(String[] args) {
		//solicitar al usuario un dia de la semana y mostrar un mensaje
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un dia");
		String dia=sc.nextLine();
		String mensaje="";
		switch(dia.toLowerCase()) { 
		
			case "lunes":
				mensaje="principio de samana";
				break;
			case "martes":
				mensaje="ni te cases ni te embarques pa' que voy a arriesgarme";
				break;
			case "miercoles":
				mensaje="se casa la patrona a que pachangona";
				break;
			case "jueves":
				mensaje="estoy muy desvelado me siento hasta mareado";
				break;
			case "viernes":
				mensaje="se muere Jesucristo ¿donde se ha visto?";
				break;
			case "sabado":
				mensaje="trabajo medio dia ¿por medio dia?  ";
				break;
			case "domingo":
				mensaje="dia de descanso bien merecido no voy a trabajar ";
				break;
			default:
				mensaje="Ese dia no lo manejo";
		}
		System.out.println(mensaje+" no voy a trabajar");

	}

}
