package paquete;

public class Producto {
	private float precio;
	
	private float getPrecio() {
		return precio;
	}

	private void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public Producto () {
		setPrecio(0);
	}
	
	public Producto (float valor) {
		setPrecio(valor);
	}
	
	
	public float obtenerPrecio () {
		return getPrecio();
	}
}
