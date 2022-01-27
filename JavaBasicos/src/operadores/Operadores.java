package operadores;

public class Operadores {
	public static void main(String args[]) {
		int a=10;
		int b=20;
		
		int c=a+b;
		
		System.out.println(c);
		
		String str1="El resultado de la suma es ";
		
		System.out.println(str1+c);
		System.out.println("El resultado de la resta es "+(b-a));
		
		
		float division=a/b;
		System.out.println("El resultado de la divicion es "+division);
		
		//opereadores de declaracion conpuesta
		//+=,-=,/=,*=,%=
		int f=0;
		f+=5;
		int h=15,i=25;
		String j="hola";
		String charter="hola";
		System.out.println(h>i);
		System.out.println(i!=h);

		System.out.println(j==charter);
		//operador unario
		//++.--
		//preasignacion --k, ++k
		//post asignacion k++,k--
		int k=5;
		System.out.println(k++);
		System.out.println(++k);
		
		int oper=(4+5)*6/3;
		System.out.println(++k);
		int x=0,y=0;
		int oper2=++x + y--; //da 1
		//int oper2= y-- + ++x; da 1
		System.out.println(oper2);
		int edad=18, v1=0,v2=1;
		int res=(edad<=18)?v1:v2;
		System.out.println(res);
		
	}
}
