package ejemplo01;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
//como no coincide el nombre de la tabla con el de la clase se usa @table
@Table(name = "persona")
public class Persona01 implements Serializable{ //tabla persona base de datos 14_curso_jpa
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//esta anotacion indica que los id son autoingrement. Se genera en BD
	private int idPersona;
	private String apellidos;
	private String apodo;
	private String nombre;
	private String dni;
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idPersona);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona01 other = (Persona01) obj;
		return idPersona == other.idPersona;
	}
	@Override
	public String toString() {
		return "Persona01 [" + idPersona + ", " + apellidos + ", " + apodo + ", "
				+ nombre + ", " + dni + "]";
	}
	
	
	
	
	
		

}
