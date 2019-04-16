package paquete;

public class EjemplarLiterario extends Ejemplar {
	private String nombreDeLaObra;
	private Autor autorDelEjemplar;
	private int cantidadDeHojas;
	private int cantidadDeCopias;
	private String getNombreDeLaObra() {
		return nombreDeLaObra;
	}
	private void setNombreDeLaObra(String nombreDeLaObra) {
		this.nombreDeLaObra = nombreDeLaObra;
	}
	private Autor getAutorDelEjemplar() {
		return autorDelEjemplar;
	}
	private void setAutorDelEjemplar(Autor autorDelEjemplar) {
		this.autorDelEjemplar = autorDelEjemplar;
	}
	private int getCantidadDeHojas() {
		return cantidadDeHojas;
	}
	private void setCantidadDeHojas(int cantidadDeHojas) {
		this.cantidadDeHojas = cantidadDeHojas;
	}
	private int getCantidadDeCopias() {
		return cantidadDeCopias;
	}
	private void setCantidadDeCopias(int cantidadDeCopias) {
		this.cantidadDeCopias = cantidadDeCopias;
	}
	
	
	public mostrarDatos () {
		InAndOut.mostrarMensaje("El nombre del ejemplar es: "+ getNombreDeLaObra()+ "\n su autor es: "+ getAutorDelEjemplar().mostrarDatos());
	}
}
