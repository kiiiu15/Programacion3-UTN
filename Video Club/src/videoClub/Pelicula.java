package videoClub;

import java.util.ArrayList;

public class Pelicula extends elementoParaAlquiler {
	private String genero;
	private float durecionEnMinutos;
	private Creador director;
	
	
	//getters & setters
	private String getGenero() {
		return genero;
	}
	private void setGenero(String genero) {
		this.genero = genero;
	}
	private float getDurecionEnMinutos() {
		return durecionEnMinutos;
	}
	private void setDurecionEnMinutos(float durecionEnMinutos) {
		this.durecionEnMinutos = durecionEnMinutos;
	}
	private Creador getDirector() {
		return director;
	}
	private void setDirector(Creador director) {
		this.director = director;
	}
	

	
	// constructor
	
	public Pelicula () {
		super();
		setDurecionEnMinutos(60);
		setDirector(new Creador());
		setGenero("");
		setCopias(new ArrayList <Copia>(0));
	}
	
	
	public Pelicula (String tituloDeLaPelicula,String nombreDelAutor, String apellidoDelCreador, String genero, float duracionEnMinutosDeLaPelicula) {
		super(tituloDeLaPelicula);
		setDurecionEnMinutos(duracionEnMinutosDeLaPelicula);
		setDirector(new Creador (nombreDelAutor,apellidoDelCreador));
		
	}
	
	public void crearCopia() {
		 getCopias().add(new Copia (getIdElemento()+"N"+getCopias().size()+1 , new Pelicula (getTitulo(), getDirector().obtenerNombre(),getDirector().obtenerApellido(), getGenero(), getDurecionEnMinutos() ))) ;	
	}
	@Override
	protected void asignarID(String idPasada) {
		// TODO Auto-generated method stub
		super.asignarID("P"+idPasada);
	}
	
	
	
	
}
