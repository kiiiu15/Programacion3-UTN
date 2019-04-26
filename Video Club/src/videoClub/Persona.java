package videoClub;

public class Persona {
	private String nombre;
	private String apellido;
	
	// getters & setters
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String getApellido() {
		return apellido;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//constructor 
	
	public Persona () {
		setNombre("");
		setApellido("");
	}
	
	public Persona (String nombre, String apellido) {
		setNombre(nombre);
		setApellido(apellido);
	}
	
	//metodos 
	
	public void mostrarDatos() {
		InAndOut.mostrarMensaje("Su nombre es "+ getNombre());
		InAndOut.mostrarMensaje("Su apellido es "+ getApellido());
	}
	
	public String obtenerApellido () {
		return getApellido();
	}
	
	public String obtenerNombre () {
		return getNombre();
	}
	
}
