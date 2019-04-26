package videoClub;

import java.util.ArrayList;

public class elementoParaAlquiler {
	private boolean entregado;
	private String titulo;
	private String idElemento;
	private ArrayList<Copia> copias; 
	//generate getter & setters
	
	protected boolean isEntregado() {
		return entregado;
	}
	private void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
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
	
	private void setCopias(ArrayList<Copia> copias) {
		this.copias = copias;
	}
	
	private ArrayList<Copia> getCopias() {
		return copias;
	}
	
	
	
	//constructor
	
	public elementoParaAlquiler () {
		setEntregado(false);
		setTitulo("");
		setIdElemento("");
		setCopias(new ArrayList <Copia>(0));
	}
	
	public elementoParaAlquiler (String titulo) {
		setEntregado(false);
		setTitulo(titulo);
		setIdElemento("");
		setCopias(new ArrayList <Copia>(0));
	}
	
	
	public elementoParaAlquiler (String titulo, int numeroDeCopias) {
		setEntregado(false);
		setTitulo(titulo);
		setIdElemento("");
		setCopias(new ArrayList <Copia>(numeroDeCopias));
	}
	
	
	
	public void mostrarDatos () {
		InAndOut.mostrarMensaje("Titulo: "+getTitulo());
		InAndOut.mostrarMensaje("ID: "+ getIdElemento());
		if (isEntregado()) {
			InAndOut.mostrarMensaje(" Disponible: No");
		}else {
			InAndOut.mostrarMensaje(" Disponible: Si");
		}
		
	}
	
	protected void asignarID (String idPasada) {
		setIdElemento(idPasada);
	}
	
	public int obtenerNumeroDeCopias () {
		return getCopias().size();
	}
	
}
