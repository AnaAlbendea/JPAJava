package ejemplo05;

import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "persona_03")
public class Persona06 {

	@EmbeddedId
	@AttributeOverride(name = "nroDni", column = @Column(name="nrodoc"))
	@AttributeOverride(name = "letraDni", column = @Column(name="letradoc"))
	private Dni06 dni;
	
	private String nombre;
	
	public Dni06 getDni() {
		return dni;
	}
	public void setDni(Dni06 dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona06 other = (Persona06) obj;
		return Objects.equals(dni, other.dni);
	}
	@Override
	public String toString() {
		return "Persona06 [" + dni + ", " + nombre + "]";
	}
	
	
}