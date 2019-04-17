package paquete;



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
}
