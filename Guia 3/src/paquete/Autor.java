package paquete;

import Persona.Persona;
import interacionConElUsuario.InAndOut;

public class Autor extends Persona {
	private int cantidadDeObras;

	private int getCantidadDeObras() {
		return cantidadDeObras;
	}

	private void setCantidadDeObras(int cantidadDeObras) {
		this.cantidadDeObras = cantidadDeObras;
	}
	
	
	public Autor () {
		super("","","",'x');
		setCantidadDeObras(0);
		
	}
	
	
	public Autor (String nombre, String apellido, String email, char genero, int cantidadDeObrasIndicadas) {
		super(nombre,apellido,email,genero);
		setCantidadDeObras(cantidadDeObrasIndicadas);
	}
	
	
	public void mostrarDatos() {
		super.mostarDatos();
		InAndOut.mostrarMensaje("Realizo "+ getCantidadDeObras()+ "hasta el mometo");
	}
	
	
	public void modificaDatos() {
		//para pedirlos al usuario
	}
	
	
	
	
	public void modificaDatos(String nuevoNombre, String nuevoApellido, String nuevoEmail, char nuevoGenero, int cantidadDeObrasActualizadas) {
		super.modificaDatos(nuevoNombre,nuevoApellido,nuevoEmail, nuevoGenero);
		setCantidadDeObras(cantidadDeObrasActualizadas);
	}
	
	public void mostrarNombreDelAutor () {
		InAndOut.mostrarMensaje(""+ obtenerDatosDelaPersona());
	}
}
