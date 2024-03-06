package ejemplo12;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "partidos")
public class Partido implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPartido;
	private String partido;
	
	@ManyToOne
	@JoinColumn(name = "fk_campo") 
	private Campo campo;
	public int getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public Campo getCampo() {
		return campo;
	}
	public void setCampo(Campo campo) {
		this.campo = campo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idPartido);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		return idPartido == other.idPartido;
	}
	@Override
	public String toString() {
		return "Partido [idPartido=" + idPartido + ", partido=" + partido + ", campo=" + campo + "]";
	}
	
	
}
