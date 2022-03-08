package lvl1_Ex8;

public class Empleado {
	private String name;
	private double salary;
	
	public Empleado (String name){
		this.name=name;
		salary=1500;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "El empleado/a "+name+", tiene un salario de "+salary+"€.";
	}
}
