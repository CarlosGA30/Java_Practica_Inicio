package metodos;

public class Metodos {
	int a,b;//atributos
	
	public void sumar() {
		int resultado=a+b;
		System.out.println("La suma de "+a+" y "+b+""+resultado);
	}
	public int sumaConRetorno() {
		int resultado=a+b;
		return resultado;
	}
	 public double multiplicacionConArgumentos(int arg1,double arg2) {
		return arg2*arg1;
		
	}
	
}
