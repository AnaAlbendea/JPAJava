package ejemplo02;

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



@Entity
//como no coincide el nombre de la tabla con el de la clase se usa @table
@Table(name = "personas")
public class Persona02 implements Serializable{ //tabla persona 14_curso_jpa
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//esta anotacion indica que los id son autoingrement. Se genera en BD
	@Column(name = "id_persona")
	private int idPersona;
	
	@Column (name = "p_apellidos")
	private String apellidos;
	
	@Column (name = "p_apodo")
	private String apodo;
	
	@Column (name = "p_nombre")
	private String nombre;
	
	@Column (name = "p_dni")
	private String dni;
	
	/*
	 * El comprotamiento por defecto guarda el ordinal del enumerado
	 * pero poniendo la anotacion enumerated string guarda 
	 * los nombres de las constantes. En este caso masc y femen
	 */
	//Cuando un enum se almacena como ordinal en JPA (Java Persistence API), significa que en la base de datos se guarda la posición del valor del enum en la declaración original. Es decir, en lugar de almacenar el nombre del enum, se guarda un número entero que representa la posición del valor en la declaración.

//Por ejemplo, si tenemos un enum con valores "A", "B" y "C", y se guarda como ordinal, en la base de datos se guardaría 0 para "A", 1 para "B" y 2 para "C".
	@Column (name = "p_sexo")
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
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
	
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
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
		Persona02 other = (Persona02) obj;
		return idPersona == other.idPersona;
	}
	@Override
	public String toString() {
		return "Persona02 [" + idPersona + ", " + apellidos + ", " + apodo + ", "
				+ nombre + ", " + dni + "]";
	}
	
	
	
	
	
		

}
