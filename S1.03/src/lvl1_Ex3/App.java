package lvl1_Ex3;

import java.util.*;

public class App {

	public static void main(String[] args) {
		ArrayList <String> personajes=new ArrayList<String>();
		Generadora gen=new Generadora(personajes);
		personajes.add(gen.siguientePersonaje());
		for (String p:personajes) {
			System.out.println(p);
		}
		System.out.println("----------------");
		
		LinkedList<String>personajes1=new LinkedList<String>();
		Generadora gen1=new Generadora(personajes1);
		personajes1.add(gen1.siguientePersonaje());
		for (String p:personajes1) {
			System.out.println(p);
		}
		System.out.println("----------------");
		
		HashSet<String>personajes2=new HashSet<String>();
		Generadora gen2=new Generadora(personajes2);
		personajes2.add(gen2.siguientePersonaje());
		for (String p:personajes2) {
			System.out.println(p);
		}
		System.out.println("----------------");
		
		LinkedHashSet<String>personajes3=new  LinkedHashSet<String>();
		Generadora gen3=new Generadora(personajes3);
		personajes3.add(gen3.siguientePersonaje());
		for (String p:personajes3) {
			System.out.println(p);
		}
		System.out.println("----------------");
		
		TreeSet<String>personajes4=new  TreeSet<String>();
		Generadora gen4=new Generadora(personajes4);
		personajes4.add(gen4.siguientePersonaje());
		for (String p:personajes4) {
			System.out.println(p);
		}
		System.out.println("----------------");		

	}

}
