package paquete;

public class Libro extends EjemplarLiterario {
	private String isbn;

	private String getIsbn() {
		return isbn;
	}

	private void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public Libro () {
		super();
		setIsbn("");
	}
	
	public Libro (String nombrePasado, int cantidadDeHojasIndicados, int cantidadDeCopiasInidicadas, float precioDeLaObra, String nombreDelAutor, String apellidoDelAutor, String emailDelAutor, char genero, int cantidadDeObrasEscritas, String isbnIndicado) {
		super(nombrePasado, cantidadDeHojasIndicados,cantidadDeCopiasInidicadas, precioDeLaObra, nombreDelAutor, apellidoDelAutor, emailDelAutor, genero, cantidadDeCopiasInidicadas);
		setIsbn(isbnIndicado);
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		InAndOut.mostrarMensaje("Y su isbn es: "+ getIsbn());
	}

}
