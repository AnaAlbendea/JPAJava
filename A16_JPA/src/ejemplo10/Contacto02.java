package ejemplo10;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contacto")
public class Contacto02 implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idContacto;
	private String nombre;
	private String apellidos;
	private String apodo;
	
	@OneToOne
	@JoinColumn(name = "fk_domicilio")//nombre de la fk de contacto a domicilio
	private Domicilio02 dom;
	
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
	public Domicilio02 getDom() {
		return dom;
	}
	public void setDom(Domicilio02 dom) {
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
		Contacto02 other = (Contacto02) obj;
		return idContacto == other.idContacto;
	}
	@Override
	public String toString() {
		return "Contacto [" + idContacto + ", " + nombre + ", " + apellidos + ", " + apodo + ", " + dom + "]";
	}
	
	
}
