package lvl1_Ex5;

import java.util.*;

public class App {

	public static void main(String[] args) {
		List<Integer>lista=new ArrayList<Integer>();
		lista.add(15);
		lista.add(90);
		lista.add(-3);
		List<Integer>lista2=new ArrayList<Integer>();
		lista2.add(15);
		lista2.add(90);
		lista2.add(-3);
		
		ListIterator<Integer> it=lista.listIterator(lista.size());
		while (it.hasPrevious()) {
			lista2.add(it.previous());
		}
		
		/*for (int i=lista.size()-1;i>=0;i--) {
			lista2.add(lista.get(i));
		} "una altra forma de poder gestionar-ho"*/
		for (Integer i:lista2) {
			System.out.println(i);
		}

	}

}
