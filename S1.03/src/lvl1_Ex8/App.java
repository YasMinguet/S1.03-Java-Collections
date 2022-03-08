package lvl1_Ex8;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Empleado>personal=new LinkedHashMap<String, Empleado>();
		personal.put("A", new Empleado("Jorge"));
		personal.put("Z", new Empleado("Antonia"));
		personal.put("V", new Empleado("Ana"));
		personal.put("M", new Empleado("Luan"));
		
		
		List<Map.Entry<String, Empleado>> list = new ArrayList<Map.Entry<String, Empleado>>(personal.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String, Empleado> >(){
			public int compare(Map.Entry<String, Empleado> entry1,Map.Entry<String, Empleado> entry2) {
				return entry1.getKey().compareTo(entry2.getKey());
			} //se ordena alfabéticamente String (key)
		});	
		personal.clear(); //limpiamos para que puedan entrar los nuevos valores ordenados
		for (Map.Entry<String, Empleado> entry : list) {
			  personal.put(entry.getKey(), entry.getValue());
			}
		
		for(Map.Entry<String, Empleado> s: personal.entrySet()) {
			String key=s.getKey();
			Empleado value=s.getValue();
			System.out.println(key+": "+value);
		} 
	}	

}
