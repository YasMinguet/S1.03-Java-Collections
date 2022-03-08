package lvl1_Ex4;

import java.util.*;

public class App {

	public static void main(String[] args) {
		ArrayList<String>lista=new ArrayList<String>();
		lista.add("Juan");
		lista.add("Sandra");
		recorre(lista);
		
		System.out.println("-----------------");
		
		LinkedList<Integer>lista1=new LinkedList<Integer>();
		lista1.add(15);
		lista1.add(90);
		lista1.add(-3);
		recorre(lista1);
		
		System.out.println("-----------------");
		
		HashSet<Double>lista2=new HashSet<Double>();
		lista2.add(15.5);
		lista2.add(90.9);
		lista2.add(-3.7);
		lista2.add(-56.3);
		recorre(lista2);
		
		System.out.println("-----------------");
		
		LinkedHashSet<String>lista3=new LinkedHashSet<String>();
		lista3.add("Gato");
		lista3.add("Perro");
		lista3.add("Marmota");
		recorre(lista3);
		
		System.out.println("-----------------");
		
		TreeSet<Character>lista4=new TreeSet<Character>();
		lista4.add('A');
		lista4.add('P');
		lista4.add('@');
		recorre(lista4);
		
		System.out.println("-----------------");

	}
	static <T> void recorre(Collection<T> c) {
		Iterator<T> it = c.iterator();
		while (it.hasNext()) {
			T elemento=it.next();
			System.out.println(elemento.toString());
		}
		
	}
	
	

}
