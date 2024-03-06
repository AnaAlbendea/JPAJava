package ejemplo04;

import java.io.Serializable;
import java.util.Objects;

public class Dni05 implements Serializable {

	private int nroDni;
	private char letraDni;
	
	public Dni05() {} //en javabeans constructor por defecto
	//en este caso explicito
	
	public Dni05(int nroDni, char letraDni) {
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
		Dni05 other = (Dni05) obj;
		return letraDni == other.letraDni && nroDni == other.nroDni;
	}
	@Override
	public String toString() {
		return "Dni [" + nroDni + letraDni + "]";
	}
	
	
	
}
