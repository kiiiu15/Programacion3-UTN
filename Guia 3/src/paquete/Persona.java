package paquete;

public class Persona {
	protected enum  genero {m,f,x};
	private String nombre;
	private String apellido;
	private String email;
	private genero generoDeLaPersona;
	
	//getter & setters
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
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private genero getGeneroDeLaPersona() {
		return generoDeLaPersona;
	}
	private void setGeneroDeLaPersona(genero generoDeLaPersona) {
		this.generoDeLaPersona = generoDeLaPersona;
	}
	
	// constructor
	
	public Persona () {
		
		setNombre("");
		setApellido("");
		setEmail("");
		setGeneroDeLaPersona(generoDeLaPersona.x);
		
	}
	
	
	public Persona (String nombre, String apellido, String email, genero generoPasado) {
		
		setNombre(nombre);
		setApellido(apellido);
		setEmail(email);
		setGeneroDeLaPersona(generoPasado);
		
	}
	
	public String obtenerDatosDelaPersona () {
		return obtenerNombreYApellido()+" - "+ obtenerContacto()+" - "+obtenerGenero();
		
	}
	
	private String obtenerNombreYApellido() {
		return getNombre()+getApellido();
	}
	
	private String obtenerContacto () {
		return getEmail();
	}
	
	private String obtenerGenero () {
		return getGeneroDeLaPersona().toString();
	}

	public void  mostarDatos() {
		InAndOut.mostrarMensaje("Su nombre y apellido es: "+ obtenerDatosDelaPersona()+"\n Su contacto es: " + obtenerContacto() +"\n Y su genero es "+ obtenerGenero());
	}

}
