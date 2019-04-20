package Persona;

import interaccionConElUsuario.InAndOut;;

public class Persona {
	private enum  genero {m,f,x};
	private String nombre;
	private String apellido;
	private String email;
	private genero generoDeLaPersona;
	private String dni;
	
	
	
	//getter & setters
	
	
	
	private String getNombre() {
		return nombre;
	}
	private String getDni() {
		return dni;
	}
	private void setDni(String dni) {
		this.dni = dni;
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
		setGeneroDeLaPersona(genero.x);
		setDni("");
		
	}
	
	
	public Persona (String nombre, String apellido, String email, char genero) {
		
		setNombre(nombre);
		setApellido(apellido);
		setEmail(email);
		asignarGenero(genero);
		setDni("");
		
	}
	

	
	
	public Persona (String nombre, String apellido, String email, char genero, String dni) {
		
		setNombre(nombre);
		setApellido(apellido);
		setEmail(email);
		asignarGenero(genero);
		setDni(dni);
		
	}
	
	private void asignarGenero (char generoPasado) {
		int ok=0;
		do {
			switch (Character.toLowerCase(generoPasado)) {
			case 'm':
				setGeneroDeLaPersona(genero.m);
				ok=1;
				break;
			case 'f':
				setGeneroDeLaPersona(genero.f);
				ok=1;
				break;
			case 'x':
				setGeneroDeLaPersona(genero.x);
				ok=1;
				break;

			default:
				InAndOut.mostrarMensaje("El genero ingresado es incorrecto por favor indique nuevamente el genero teniendo en cuenta: M: masculino F: Femenino X: No especificado");
				generoPasado=InAndOut.pedirCaracter();
				break;
			}
		} while (ok==0);
	}
	
	public String obtenerDatosDelaPersona () {
		return obtenerNombreYApellido();
		
	}
	
	private String obtenerNombreYApellido() {
		return getNombre()+" "+getApellido();
	}
	
	private String obtenerContacto () {
		return getEmail();
	}
	
	private String obtenerGenero () {
		return getGeneroDeLaPersona().toString();
	}

	public void  mostrarDatos() {
		InAndOut.mostrarMensaje("dni: "+getDni() +", "+getNombre()+", "+getApellido());
	}
	
	public void modificaDatos () {
		/// para pedirselos al usuario
	}
	
	public void modificaDatos (String nuevoNombre, String nuevoApellido, String nuevoEmail, char nuevoGenero) {
		setNombre(nuevoNombre);
		setApellido(nuevoApellido);
		setEmail(nuevoEmail);
		asignarGenero(nuevoGenero);
	} 
	
	
	public void modificaDatos (String nuevoNombre, String nuevoApellido, String nuevoEmail, char nuevoGenero, String nuevoDni) {
		setNombre(nuevoNombre);
		setApellido(nuevoApellido);
		setEmail(nuevoEmail);
		asignarGenero(nuevoGenero);
		setDni(nuevoDni);
	} 


}
