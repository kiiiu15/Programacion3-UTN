package videoClub;

public class Copia {
	private String idDeCopia;
	private elementoParaAlquiler copia;

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

	public void asignarIdDeCopia (String iD) {
		setIdDeCopia(iD);
	}
	
	
	
	public Copia (String idPasada, Pelicula laPelicula) {
		setIdDeCopia(idPasada);
		setCopia(laPelicula);
		
	}
	
	
	
}
