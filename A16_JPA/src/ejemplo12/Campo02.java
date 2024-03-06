package ejemplo12;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "campos")
public class Campo02 implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCampo;
	
	@Column(name = "campo")
	private String nombreCampo;
	
	@Column(name = "direccion")
	private String domicilio;
	
	@OneToMany(mappedBy = "campo")	
	private Set<Partido02> partidos; //es un to many
	
	
	public int getIdCampo() {
		return idCampo;
	}
	public void setIdCampo(int idCampo) {
		this.idCampo = idCampo;
	}
	public String getNombreCampo() {
		return nombreCampo;
	}
	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public Set<Partido02> getPartidos() {
		return partidos;
	}
	
	public void setPartidos(Set<Partido02> partidos) {
		this.partidos = partidos;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idCampo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campo02 other = (Campo02) obj;
		return idCampo == other.idCampo;
	}
	
	
}
