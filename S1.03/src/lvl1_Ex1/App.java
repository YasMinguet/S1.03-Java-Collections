package lvl1_Ex1;

import java.util.*;

public class App {
	public static void main(String[] args) {
		ArrayList<Month> monthYear = new ArrayList<Month>();
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
		for (Month m : monthYear) {
			System.out.println(m.getName());
		}
		
		System.out.println("---------------------");
		
		monthYear.add(7, new Month("Agosto"));
		for (Month m : monthYear) {
			System.out.println(m.getName());
		}
	}
}
