package ejemplo11;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "domicilio")
public class Domicilio03 implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDomicilio;
	private String tipoVia;
	private String via;
	private int numero;
	private int piso;
	private String puerta;
	@Transient
	private String codigoPostal;
	private String ciudad;
	@Transient
	private String provincia;
	
	@OneToOne(mappedBy = "dom")//nombre del atributo de clase donde fue mapead
	private Contacto03 contacto;

	public int getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public Contacto03 getContacto() {
		return contacto;
	}
	public void setContacto(Contacto03 contacto) {
		this.contacto = contacto;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public String getPuerta() {
		return puerta;
	}
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idDomicilio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domicilio03 other = (Domicilio03) obj;
		return idDomicilio == other.idDomicilio;
	}
	@Override
	public String toString() {
		return "Domicilio [" + tipoVia + ", " + via + ", " + numero + ", " + piso + ", " + puerta + ", " + codigoPostal
				+ ", " + ciudad + ", " + provincia + "]";
	}
}
