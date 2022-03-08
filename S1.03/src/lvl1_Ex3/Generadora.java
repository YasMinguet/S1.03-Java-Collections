package lvl1_Ex3;

import java.util.*;

public class Generadora {
	Collection<String>personajes;

	public Generadora(Collection<String>personajes) {
		this.personajes=personajes;
	}

	public String siguientePersonaje() {
		personajes.add("Arya");
		personajes.add("Cersei");
		personajes.add("Tyrion");
		personajes.add("Ramsay");
		personajes.add("Drogon");
		personajes.add("Sansa");
		personajes.add("Jaime");
		String nombre = "";
		int index=0;
		boolean recorre=true;
		Iterator<String> it = personajes.iterator();
		while (it.hasNext()&&recorre) {
			if (index<personajes.size()-1) {
				recorre=false;
			}else {
				nombre=it.next();
				index++;	
			}
		}
		return nombre;

	}

}
