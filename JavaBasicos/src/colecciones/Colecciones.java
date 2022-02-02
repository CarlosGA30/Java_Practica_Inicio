package colecciones;

import java.util.*;
/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
*/

//Las colecciones nos Sirve para almacenar un conjunto de objetos
//la diferencia de las colecciones y los objetos 
//es que las coleciones son dinamicas
//pueden cambiar el numero de objetos agregados
public class Colecciones {
	public static void main(String[] args) {
		/*set tiene 3 implementaciones
		* 	no puede contener elemntos repetidos
		*/
		//HashSet
		//	-los Elementos no mantienen un orden
		// 	.Es la i,plementacion mas rapida
//		Set<String> frutas=new HashSet<String>();
//		frutas.add("mango");
//		frutas.add("granada");
//		frutas.add("piña");
//		frutas.add("sandia");
//		frutas.add("fresa");
//		frutas.add("mamey");
//		System.out.println(frutas.toString());
//		for (String fruta : frutas) {
//			System.out.println(fruta);
//		}
		
		//treeSet
		//ordena los elementos
//		Set<String> frutas=new TreeSet<String>();
//		frutas.add("mango");
//		frutas.add("granada");
//		frutas.add("piña");
//		frutas.add("sandia");
//		frutas.add("fresa");
//		frutas.add("mamey");
//		System.out.println(frutas.toString());
//		for (String fruta : frutas) {
//			System.out.println(fruta);
//		}
		//linkedhashset
		//ordena los elementos en orden de inserccion
//		Set<String> frutas=new LinkedHashSet<String>();
//		frutas.add("mango");
//		frutas.add("granada");
//		frutas.add("piña");
//		frutas.add("sandia");
//		frutas.add("fresa");
//		frutas.add("mamey");
//		System.out.println(frutas.toString());
//		for (String fruta : frutas) {
//			System.out.println(fruta);
//		}
		/* List
		 * 	Se permite elementos duplicados
		 * acceder a elementos especificos
		 * buscar elementos
		 * */
		//ArrayList
//		List<String> pokemones=new ArrayList<String>();
//		pokemones.add("chicorita");
//		pokemones.add("Eevee");
//		pokemones.add("Psyduck");
//		pokemones.add("Dragonite");
//		pokemones.add("Charizard");
//		pokemones.add("Gengar");
//		pokemones.add(2,"Pikachu");
//		for (String pokemon : pokemones) {
//			System.out.println(pokemon);
//		}
//		System.out.println("**********************");
//		System.out.println(pokemones.get(4));
//		//indexOf, nos va a devolver la posocion del
//		//primer elemento que coinsida
//		//y si el elemento no esta nos devolver un -1
//		System.out.println(pokemones.indexOf("Gengar"));
//		
//		//remove remueve el elemento
//		pokemones.remove(5);
//		
//		pokemones.set(3, "Flaeron");
//		System.out.println(pokemones);
		//
		List<String> digimones=new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Grayamon");
		System.out.println(digimones);

		/*Map
		 * Asocia claves a valores 
		 * No puede contener claves duplicadas 
		 * Solo puede tener un volar asociado
		 * */
		
		//HashMap
		//tiene mejor rendimiento pero no garantiza un orden
		//a la hora de hacer iteraciones
		Map<Integer,String> usuarios=new HashMap<Integer,String>();
		usuarios.put(111, "Carlos");
		usuarios.put(211, "Raul");
		usuarios.put(311, "Rodrigo");
		System.out.println(usuarios);
		//KeySet-nospermite recuperar el valor de la clave
		System.out.println(usuarios.keySet());
		//vlues - nos permite recuprar el valor directamente
		
		System.out.println(usuarios.values());
		
		
		//TreeMap
		Map<String,String> tamales=new TreeMap<String,String>();
		tamales.put("Juanita","verde");
		tamales.put("Rodrigo","dulce");
		tamales.put("Carlos","mole");
		tamales.put("Raul","oaxaqueño");
		System.out.println(tamales.toString());
		tamales.entrySet().forEach(clave->{
			System.out.println(clave.getKey());
		});
		

		//LinkedHashMap
		Map<Integer,String> carros=new LinkedHashMap<Integer,String>();
		carros.put(1, "Volvo");
		carros.put(13, "Pointer");
		carros.put(14, "Mustang");
		System.out.println(carros.toString());
		
		
		
	}
	
}
