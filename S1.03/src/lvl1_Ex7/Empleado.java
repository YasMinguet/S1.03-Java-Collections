package lvl1_Ex7;

public class Empleado {
	private String name;
	private double salary;
	
	public Empleado (String name){
		this.name=name;
		salary=1500;
	}
	
	public String toString() {
		return "El empleado/a "+name+", tiene un salario de "+salary+"€.";
	}
}
