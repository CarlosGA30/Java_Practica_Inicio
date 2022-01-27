
public class ConversionDatos {

	public static void main(String[] args) {
		byte numeroByte=10;
		
		short numeroShort=numeroByte;
		
		int numeroInt=numeroShort;
		
		long numeroLong = numeroInt;
		
		float numeroFloat = numeroLong;
		
		double numeroDouble=numeroFloat;
		
		numeroFloat=(float)numeroDouble;
		
		int otroInt=(int) numeroFloat;
		
		short numero1=123;
		short numero2= 1234;
		byte numero3=13;
		byte numero4= 12;
		
		short suma =(short)(numero1+numero2);
		byte suma2=(byte)(numero3+numero4);
		
	
		int entero=(int)-14.98800;		
		System.out.print(entero);
		

	}

}
