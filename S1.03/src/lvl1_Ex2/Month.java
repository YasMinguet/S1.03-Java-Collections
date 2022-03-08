package lvl1_Ex2;

import java.util.Objects;

public class Month {
	
	private String name;
	
	Month (String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public int hashCode() {
		return Objects.hash(name);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return Objects.equals(name, other.name);
	}

}
