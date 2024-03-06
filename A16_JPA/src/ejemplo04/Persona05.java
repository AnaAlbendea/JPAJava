package ejemplo04;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name = "persona_03")
//como se llama la clase que represente mi Id compuesta
@IdClass(Dni05.class)
public class Persona05  implements Serializable{

	@Id
	@Column(name = "nrodoc")
	private int nroDni;
	
	@Id
	@Column(name = "letradoc")
	
	private char letraDni;
	private String nombre;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		Persona05 other = (Persona05) obj;
		return letraDni == other.letraDni && nroDni == other.nroDni;
	}
	@Override
	public String toString() {
		return "Persona05 [DNI " + nroDni + letraDni + ", nombre " + nombre + "]";
	}
	
	
	
}
