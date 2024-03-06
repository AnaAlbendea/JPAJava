package ejemplo11;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contacto")
public class Contacto03 implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idContacto;
	private String nombre;
	private String apellidos;
	private String apodo;
	
	@OneToOne
	@JoinColumn(name = "fk_domicilio")//nombre de la fk de contacto a domicilio
	private Domicilio03 dom;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "telefonos", joinColumns = {@JoinColumn(name ="fk_contacto")}) //un array de anotaciones @joincloumn
	@Column(name = "telefono")
		private Set<String> telefonos; //una coleccion de estilos basicos. PARA jpa es un element collection
		
	
	public Set<String> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(Set<String> telefonos) {
		this.telefonos = telefonos;
	}
	public int getIdContacto() {
		return idContacto;
	}
	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public Domicilio03 getDom() {
		return dom;
	}
	public void setDom(Domicilio03 dom) {
		this.dom = dom;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idContacto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto03 other = (Contacto03) obj;
		return idContacto == other.idContacto;
	}
//	@Override
//	public String toString() {
//		return "Contacto [" + idContacto + ", " + nombre + ", " + apellidos + ", " + apodo + ", " + dom + "]";
//	}
	@Override
	public String toString() {
		return "Contacto03 [idContacto=" + idContacto + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", dom=" + dom + ", telefonos=" + telefonos + "]";
	}
	
	
	
}
