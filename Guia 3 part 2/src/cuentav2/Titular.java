package cuentav2;
import Persona.Persona;
import interacionConElUsuario.InAndOut;

public class Titular  extends Persona{
	private String idTitular;

	private String getIdTitular() {
		return idTitular;
	}

	private void setIdTitular(String idTitular) {
		this.idTitular = idTitular;
	}

	
	
	public Titular () {
		super();
		setIdTitular("");
	}
	
	public Titular (String nombreDelTitular, String apellidoDelTitular, String emailDelTitular, char generoDelTitular, String idDelTitular) {
		super(nombreDelTitular,apellidoDelTitular,emailDelTitular,generoDelTitular);
		setIdTitular(idDelTitular);
	}
	
	
	public void mostrarDatos() {
		super.mostrarDatos();
		InAndOut.mostrarMensaje("y su id de cliente es: " +getIdTitular());
	}

	
	
	
	
	
	
	
	
	
	
}
