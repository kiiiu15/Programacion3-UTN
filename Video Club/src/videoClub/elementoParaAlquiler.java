package videoClub;

import java.util.ArrayList;

public class elementoParaAlquiler {
	private String titulo;
	private String idElemento;
	private ArrayList<Copia> copias; 
	//generate getter & setters
	

	protected String getTitulo() {
		return titulo;
	}
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	protected String getIdElemento() {
		return idElemento;
	}
	private void setIdElemento(String idElemento) {
		this.idElemento = idElemento;
	}
	
	protected void setCopias(ArrayList<Copia> copias) {
		this.copias = copias;
	}
	
	protected ArrayList<Copia> getCopias() {
		return copias;
	}
	
	
	
	//constructor
	
	public elementoParaAlquiler () {
		setTitulo("");
		setIdElemento("");
		setCopias(new ArrayList <Copia>(0));
	}
	
	public elementoParaAlquiler (String titulo) {
		
		setTitulo(titulo);
		setIdElemento("");
		setCopias(new ArrayList <Copia>(0));
	}
	
	
	public elementoParaAlquiler (String titulo, int numeroDeCopias) {
		
		setTitulo(titulo);
		setIdElemento("");
		setCopias(new ArrayList <Copia>(numeroDeCopias));
	}
	
	
	
	public void mostrarDatos () {
		InAndOut.mostrarMensaje("Titulo: "+getTitulo());
		InAndOut.mostrarMensaje("ID: "+ getIdElemento());

	}
	
	protected void asignarID (String idPasada) {
		setIdElemento(idPasada);
	}
	
	public int obtenerNumeroDeCopias () {
		return getCopias().size();
	}
	
}
