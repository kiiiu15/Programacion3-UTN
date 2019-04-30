package videoClub;

public class Copia {
	private String idDeCopia;
	private elementoParaAlquiler copia;
	private boolean entregado;
	
	private String getIdDeCopia() {
		return idDeCopia;
	}

	private void setIdDeCopia(String idDeCopia) {
		this.idDeCopia = idDeCopia;
	}
	
	
	private elementoParaAlquiler getCopia() {
		return copia;
	}

	private void setCopia(elementoParaAlquiler copia) {
		this.copia = copia;
	}
	
	
	

	private boolean isEntregado() {
		return entregado;
	}

	private void setEntregado (boolean entregado) {
		this.entregado = entregado;
	}

	public void asignarIdDeCopia (String iD) {
		setIdDeCopia(iD);
	}
	
	
	
	public Copia (String idPasada, elementoParaAlquiler laCopia) {
		setEntregado(false);
		setIdDeCopia(idPasada);
		setCopia(laCopia);
		
	}
	
	public void mostrarDatos() {
		if (getCopia() instanceof Pelicula &&  getCopia()!= null) {
			Pelicula miPeliculaTemporalParaMostrarDatos=(Pelicula) getCopia();
			miPeliculaTemporalParaMostrarDatos.mostrarDatos();
			
		}
		
		if (isEntregado()) {
			InAndOut.mostrarMensaje(" NO Disponible");
		} else {
			InAndOut.mostrarMensaje("Disponible");
		}
		
		InAndOut.mostrarMensaje("Id de copia: "+getIdDeCopia());
		
		
	
	}

}