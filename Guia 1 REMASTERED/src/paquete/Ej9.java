package paquete;

public class Ej9 {
	private static int anioDeReferencia=2018;
	private static int getAnioDeReferencia() {
		return anioDeReferencia;
	}
	private static void setAnioDeReferencia(int anioDeReferencia) {
		Ej9.anioDeReferencia = anioDeReferencia;
	}


	private int anioARevisar;
	
	// Getters & settter
	private int getAnioARevisar() {
		return anioARevisar;
	}
	private void setAnioARevisar(int anioARevisar) {
		this.anioARevisar = anioARevisar;
	}
	
	
	// contructor 
	
	public Ej9() {
		setAnioARevisar(2000);
	}	
	
	
	//metodos..
	
	public boolean esBiciesto (int anio) {
		setAnioARevisar(anio);
		
		return (getAnioARevisar()-getAnioDeReferencia())%4==0;
	}
}
