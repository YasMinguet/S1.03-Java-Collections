package lvl1_Ex7;
import java.util.*;

public class App {

	public static void main(String[] args) {
		
		Map<Integer, Empleado> personal=new HashMap<Integer, Empleado>();
		personal.put(96, new Empleado("Jorge"));
		personal.put(105, new Empleado("Antonia"));
		personal.put(55, new Empleado("Ana"));
		personal.put(77, new Empleado("Luan"));
		
		Map<Integer,Empleado>personalTreeMap=convertToTreeMap(personal); //mantiene el orden del integer(clave)
		Iterator<Integer> it= personalTreeMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key= it.next();
			System.out.println("Clave: "+key+". Valor: "+personalTreeMap.get(key));
		}
		
		System.out.println("-----------------------------");
		
		LinkedHashMap<Integer,Empleado>linked= new LinkedHashMap<Integer,Empleado>(personal); //mantiene el orden de inserción
		it= linked.keySet().iterator();
		while(it.hasNext()) {
			Integer key= it.next();
			System.out.println("Clave: "+key+". Valor: "+linked.get(key));
		}
		
		System.out.println("-----------------------------");
		
		Set<Integer>keySetList=new HashSet<Integer>(personalTreeMap.keySet());
		it= keySetList.iterator();
		while(it.hasNext()) {
			Integer key= it.next();
			System.out.println(key);
		}
		
		System.out.println("-----------------------------");
		
		Set<Integer>LinkedHashSetList=new LinkedHashSet<Integer>(personalTreeMap.keySet());
		it= LinkedHashSetList.iterator();
		while(it.hasNext()) {
			Integer key= it.next();
			System.out.println(key);
		}
		
	}
	
	public static <K,V> Map<K,V>convertToTreeMap(Map<K,V>hashMap){
		Map<K,V>treeMap=new TreeMap<>();
		treeMap.putAll(hashMap);
		return treeMap;
	}

}
