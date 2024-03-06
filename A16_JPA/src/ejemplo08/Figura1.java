package ejemplo08;

import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name = "figuras01")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_figura", discriminatorType = DiscriminatorType.STRING)
public abstract class Figura1  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFigura;
	private double x;
	private double y;
	
	public Figura1(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Figura1() {}
	
	public abstract double area();
	
	public abstract double perimetro();
	
	public int getIdFigura() {
		return idFigura;
	}

	public void setIdFigura(int idFigura) {
		this.idFigura = idFigura;
	}

	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFigura);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura1 other = (Figura1) obj;
		return idFigura == other.idFigura;
	}
}
