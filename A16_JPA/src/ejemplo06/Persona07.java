package ejemplo06;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "personas")
public class Persona07 implements Serializable {
	
	private int idPersona;
	private String apellidos;
	private String apodo;
	private String nombre;
	private String dni;
	
	private Genero genero;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_persona")
	public int getIdPersona() {
		return idPersona;
	}
	
	@Column(name = "p_apellidos")
	public String getApellidos() {
		return apellidos;
	}
	
	
	@Column(name = "p_apodo")
	public String getApodo() {
		return apodo;
	}
	
	@Column(name = "p_nombre")
	public String getNombre() {
		return nombre;
	}

	
	@Column(name = "p_sexo")
	@Enumerated(EnumType.STRING)
	public Genero getGenero() {
		return genero;
	}

	@Column(name = "p_dni")
	public String getDni() {
		return dni;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	


	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	@Transient //aquellas cosas que no queramos que lo lea Hibernate
	public String getNombreCompleto() {
		return nombre + " " + apellidos;
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
		Persona07 other = (Persona07) obj;
		return idPersona == other.idPersona;
	}
	
	@Override
	public String toString() {
		return "Persona01 [" + idPersona + ", " + apellidos + ", " + apodo + ", " + nombre + ", " + dni + "]";
	}
}
