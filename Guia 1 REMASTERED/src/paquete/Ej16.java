package paquete;

public class Ej16  extends Ej12{
	float perimetro;
	float area;
	///Getter & Setter
	private float getPerimetro() {
		return perimetro;
	}

	private void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}
	
	// contructor
	
	public Ej16 () {
		setPerimetro(0);
	}
	
	///metodos
	
	public void AreaYPerimetroCirculo() {
		do {
			InAndOut.mostrarMensaje("1. Area  2.Perimetro 0. Salir");
			switch (InAndOut.pedirEntero()) {
				case 1:
					calcularArea(4);
					InAndOut.mostrarMensaje("El area del circulo es de: " + getArea());
					break;
				case 2:
					pedirLados(1, "radio", "");
					setPerimetro(calcularPerimetroCirculo(getLado1()));
					InAndOut.mostrarMensaje("El perimetro del circulo es de: " + getPerimetro());
					break;
				case 0 :
					
					break;
					
			}
			
			InAndOut.mostrarMensaje("Desea realizar otra operacion? S/N ");
			
		} while (InAndOut.pedirChar()=='s');
	}
	
	private float calcularPerimetroCirculo (int radio) {
		return (float) (radio*2*Math.PI);
	}
}
