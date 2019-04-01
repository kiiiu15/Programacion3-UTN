package paquete;

public class Ej13 {
	private String nombre ;
	private String saludo;
	
	//setter & getters
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String getSaludo() {
		return saludo;
	}
	private void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	
	//cponstructor
	
	public Ej13 () {
		setSaludo("Buenos dias ");
		setNombre("");
	}
	
	
	//metodos..
	
	public void saludador () {
		
		InAndOut.mostrarMensaje("Ingrese su nombre:");
		setNombre(InAndOut.pedirString());
		InAndOut.mostrarMensaje(getSaludo() + getNombre());
	}
}
