package ejemplo08;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CIRCULO")
public class Circulo1 extends Figura1 {

	private double radio;
	
	public Circulo1() {}
	
	public Circulo1(double x, double y, double radio) {
		super(x,y);
		this.radio = radio;
	}
	
	public double area() {
		return Math.PI * radio * radio;
	}
	
	public double perimetro() {
		return Math.PI * 2 * radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String toString() {
		return "Circulo[" + getX() + ", " + getY() + ", " + radio + "]";
	}
}
