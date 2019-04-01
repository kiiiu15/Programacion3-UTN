package paquete;

public class Ej15 {
	private float celcius;
	private float farenheit;
	
	//getter & setters
	private float getCelcius() {
		return celcius;
	}
	private void setCelcius(float celcius) {
		this.celcius = celcius;
	}
	private float getFarenheit() {
		return farenheit;
	}
	private void setFarenheit(float farenheit) {
		this.farenheit = farenheit;
	}
	
	//constructor 
	
	public Ej15() {
		setCelcius(0);
		setFarenheit(32);
	}
	
	private float deCaF () {
		setFarenheit(32+ (9/5)*(getCelcius()));
		
		return getFarenheit();
	}
	
	public float PasarCaF () {
		float celcius;
		InAndOut.mostrarMensaje("Ingrese la temperatura en Celcius ");
		celcius=InAndOut.pedirFloat();
		setCelcius(celcius);
		return deCaF();
	}
	
}
