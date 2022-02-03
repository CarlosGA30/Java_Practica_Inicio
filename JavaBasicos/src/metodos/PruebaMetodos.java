package metodos;

public class PruebaMetodos {
	
	public static void main(String[] args) {
		Metodos metodoPrueba=new Metodos();
		metodoPrueba.a=10;
		metodoPrueba.b=67;
		metodoPrueba.sumar();
		int resultadoSuma=metodoPrueba.sumaConRetorno();
		System.out.println(resultadoSuma);
		double multiplicacion=metodoPrueba.multiplicacionConArgumentos(16, 11.5);
		System.out.println("El resultado de la multiplicacion es "+multiplicacion);
	
	}
}
