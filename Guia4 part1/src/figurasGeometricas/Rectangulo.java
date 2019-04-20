package figurasGeometricas;

public class Rectangulo {
	private float ancho;
	private float alto;
	
	
	
	private float getAncho() {
		return ancho;
	}
	private void setAncho(float ancho) {
		this.ancho = ancho;
	}
	private float getAlto() {
		return alto;
	}
	private void setAlto(float alto) {
		this.alto = alto;
	}
	
	
	public Rectangulo () {
		setAlto(1);
		setAncho(1);
	}
	
	public Rectangulo (float altoIndicado, float anchoIndicado) {
		setAlto(altoIndicado);
		setAncho(anchoIndicado);
	}
	
	
	public float obtenerArea() {
		return getAlto()*getAncho();
	}
	
	public float obtenerPerimetro() {
		return 2*getAlto()+2*getAncho();
	}
	
	public void modificarAncho(float anchoNuevo) {
		if (anchoNuevo>0) {
			setAncho(anchoNuevo);
		}
	}
	
	
	public void modificarAlto(float altoNuevo) {
		if (altoNuevo>0) {
			setAlto(altoNuevo);
		}
	}
	
	public void mostrarValoresDeAtributos () {
		InAndOut.mostrarMensaje("La altura es de: " + getAlto() + " y su ancho es de: "+ getAncho());
	}
	
}
