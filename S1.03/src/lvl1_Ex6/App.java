package lvl1_Ex6;

import java.util.*;

public class App {

	public static void main(String[] args) {
		List <Integer> lista= new LinkedList<Integer>();
		for (int i=0;i<6;i++) {
				my_add(lista,numRandom());					
		}
		for (Integer i:lista) {
			System.out.println(i);
		}
	}
	
	static int numRandom() {
		int numRandom=(int)(Math.random() * 100) + 1;
		return numRandom;
	}
	
	private static void my_add(List<Integer> linkedList, int value){
        ListIterator<Integer> listIterator = linkedList.listIterator(linkedList.size()/2);
        listIterator.add(value);
	}

}
