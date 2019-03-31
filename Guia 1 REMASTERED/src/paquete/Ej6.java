package paquete;
import java.util.Scanner;
public class Ej6 extends Ej3{
	private boolean continuar;
	private int numeroIngresado;
	private boolean respuesta;
	
	
	///getter & setters
	
	private void setContinuar(boolean valorParaAsignar) {
		continuar=valorParaAsignar;
	}
	
	private boolean getContinuar() {
		return continuar;
	}
	
	private void setNumeroIngresado(int numeroParaAsignar) {
		numeroIngresado=numeroParaAsignar;
	}
	
	private int getNumeroIngresado () {
		return numeroIngresado;
	}
	
	private void setRespuesta(boolean valorParaAsignar) {
		respuesta = valorParaAsignar;
	}
	
	private boolean getRespuesta() {
		return respuesta;
	}
	


	
	// contructores 
	
	public Ej6() {
		super  ();
		setNumeroIngresado(1);
		setRespuesta(false);
		setContinuar(true);
	}
	
	//metodos..
	public void  sonPrimos() {

		while(getContinuar()) {
			InAndOut.mostrarMensaje("Ingrese un numero: ");
			setNumeroIngresado(InAndOut.pedirEntero());
			if (esPrimo(getNumeroIngresado())){
				setRespuesta(true); 
				InAndOut.mostrarMensaje("El numeorIngrsado Es Primo; Desea continuar para vovler a analizar otro numero? S/N"); 
				setContinuar((int)InAndOut.pedirChar()==(int)'s');
				} else { 
					setRespuesta(false);
					InAndOut.mostrarMensaje("El numeorIngrsado Es Primo; Desea continuar para vovler a analizar otro numero? S/N");
					setContinuar((int)InAndOut.pedirChar()==(int)'s');
				}
		}
	}
	

}
