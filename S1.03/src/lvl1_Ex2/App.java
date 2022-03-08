package lvl1_Ex2;

import java.util.*;

public class App {
	public static void main(String[] args) {
		HashSet<Month> monthYear = new HashSet<Month>();
		monthYear.add(new Month("Enero"));
		monthYear.add(new Month("Febrero"));
		monthYear.add(new Month("Marzo"));
		monthYear.add(new Month("Abril"));
		monthYear.add(new Month("Mayo"));
		monthYear.add(new Month("Junio"));
		monthYear.add(new Month("Julio"));
		monthYear.add(new Month("Septiembre"));
		monthYear.add(new Month("Octubre"));
		monthYear.add(new Month("Noviembre"));
		monthYear.add(new Month("Diciembre"));
		monthYear.add(new Month("Agosto"));
		monthYear.add(new Month("Agosto")); //no la añade porque detecta que es la misma. (método equals y hashCode sobre escritos en la clase)
		
		for (Month m : monthYear) {
			System.out.println(m.getName());
		}		
		
	}
}
