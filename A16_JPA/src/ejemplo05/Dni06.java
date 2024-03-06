package ejemplo05;
import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable

public class Dni06 implements Serializable {

	private int nroDni;
	private char letraDni;
	
	public Dni06() {}
	
	public Dni06(int nroDni, char letraDni) {
		this.nroDni = nroDni;
		this.letraDni = letraDni;
	}
	
	public int getNroDni() {
		return nroDni;
	}
	public void setNroDni(int nroDni) {
		this.nroDni = nroDni;
	}
	public char getLetraDni() {
		return letraDni;
	}
	public void setLetraDni(char letraDni) {
		this.letraDni = letraDni;
	}
	@Override
	public int hashCode() {
		return Objects.hash(letraDni, nroDni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dni06 other = (Dni06) obj;
		return letraDni == other.letraDni && nroDni == other.nroDni;
	}
}



