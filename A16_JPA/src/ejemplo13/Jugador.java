package ejemplo13;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="jugadores_03")
public class Jugador implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idJugador;
	
	@Column(name = "nombreyapellidos")
	private String nombre;
	private int dorsal;
	
	@ManyToMany
	@JoinTable(name = "equipos_jugadores_03",
				joinColumns = @JoinColumn(name="fk_jugador"), 
				inverseJoinColumns = @JoinColumn(name = "fk_equipo"))
	private Set<Equipo> equipos;
	
	public int getIdJugador() {
		return idJugador;
	}
	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(Set<Equipo> equipos) {
		this.equipos = equipos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idJugador);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return idJugador == other.idJugador;
	}
	@Override
	public String toString() {
		return "Jugador [idJugador=" + idJugador + ", dorsal=" + dorsal + ", nombre=" + nombre 
				+ "]";
	}
	
	
}

