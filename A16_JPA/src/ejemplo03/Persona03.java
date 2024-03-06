package ejemplo03;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.AttributeAccessor;

import ejemplo02.Genero;



@Entity
//como no coincide el nombre de la tabla con el de la clase se usa @table
@Table(name = "persona_04")
public class Persona03 implements Serializable{ //tabla persona 14_curso_jpa
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//esta anotacion indica que los id son autoingrement. Se genera en BD
	@Column(name = "idpersona")
	private int idPersona;
	
	@Column (name = "apellidos")
	private String apellidos;
	
	@Column (name = "apodo")
	private String apodo;
	
	@Column (name = "nombre")
	private String nombre;
	
	@Column (name = "dni")
	private String dni;
	
	/*
	 * El comprotamiento por defecto guarda el ordinal del enumerado
	 * pero poniendo la anotacion enumerated guarda 
	 * los nombres de las constantes. En este caso masc y femen
	 */
	@Column(name = "genero")
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	@Embedded
	@AttributeOverride(name = "tipoVia", column = @Column(name = "tipo_via"))
	@AttributeOverride(name = "codigoPostal", column = @Column(name = "codigo_postal"))
	private Domicilio dom;
	
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
		Persona03 other = (Persona03) obj;
		return idPersona == other.idPersona;
	}
	@Override
	public String toString() {
		return "Persona03 [" + idPersona + ", " + apellidos + ", " + apodo + ", "
				+ nombre + ", " + dni + 
				"," + dom + "]";
	}
	
	
	
	
	
		

}
