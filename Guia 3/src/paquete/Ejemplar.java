package paquete;

import interacionConElUsuario.InAndOut;

public class Ejemplar {
	private float precio;

	private float getPrecio() {
		return precio;
	}

	private void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	public Ejemplar () {
		setPrecio(0);
	}
	
	public Ejemplar (float precioInidcado) {
		setPrecio(precioInidcado);
	}
	
	public float obtenerPrecio() {
		return getPrecio();
	}
	
	
	public void mostrarDatos () {
		InAndOut.mostrarMensaje("Su precio es de: "+ getPrecio());
	}
	
	
	public void modificarDatos (float nuevoPrecio) {
		setPrecio(nuevoPrecio);
	}
	
	
	public void mostrarPrecioDelEjemplar() {
		InAndOut.mostrarMensaje(""+getPrecio());
	}
	
	
	
}
