package paquete;

public class Ej20 {
	private int limite;
	private int limiteFinal;
	private float numeroGenerado;
	
	// getters & setters
	private int getLimite() {
		return limite;
	}
	private void setLimite(int limite) {
		this.limite = limite;
	}
	private int getLimiteFinal() {
		return limiteFinal;
	}
	private void setLimiteFinal(int limiteFinal) {
		this.limiteFinal = limiteFinal;
	}
	private float getNumeroGenerado() {
		return numeroGenerado;
	}
	private void setNumeroGenerado(float numeroGenerado) {
		this.numeroGenerado = numeroGenerado;
	}
	
	// constructor 
	
	public Ej20 () {
		setLimite(0);
		setNumeroGenerado(100);
		
	}
	
	
	public Ej20 (int minimo, int maximo) {
		setLimite(minimo);
		setNumeroGenerado(maximo);
		
	}
	
	// metodos
	
	protected float generarNumeroEntre (int numero1/* y */, int numero2) {
		setLimite(numero1);
		setLimiteFinal(numero2);
		setNumeroGenerado((float)(Math.random()+getLimite())%getLimiteFinal());
		
		return getNumeroGenerado();
	}
	
	public float  numeroRandom() {
		InAndOut.mostrarMensaje("Ingrese numero minimo, ENTER, numer maximo, Enter para generar numero aleatorio ");
		return (float)generarNumeroEntre(InAndOut.pedirEntero(), InAndOut.pedirEntero());
	}
}
