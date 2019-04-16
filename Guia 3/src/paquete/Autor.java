package paquete;

import paquete.Persona.genero;

public class Autor extends Persona {
	private int cantidadDeObras;

	private int getCantidadDeObras() {
		return cantidadDeObras;
	}

	private void setCantidadDeObras(int cantidadDeObras) {
		this.cantidadDeObras = cantidadDeObras;
	}
	
	
	public Autor () {
		super("","","",genero.x);
		setCantidadDeObras(0);
		
	}
	
	
	public Autor (String nombre, String apellido, String email, genero generoPasado, int cantidadDeObrasIndicadas) {
		super(nombre,apellido,email,generoPasado);
		setCantidadDeObras(cantidadDeObrasIndicadas);
	}
	
	
	public void mostrarDatos() {
		super.mostarDatos();
		InAndOut.mostrarMensaje("Realizo "+ getCantidadDeObras()+ "hasta el mometo");
	}
}
