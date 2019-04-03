package paquete;

public class Ej22 {
	private int numero;
// getter & setter 
	private int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}
	// constructor 
	
	public Ej22 () {
		
	}
	
	// metodo
	
	private void setearNumero () {
		int numeroIngresado;
		do {
				InAndOut.mostrarMensaje("Debe ingresar un numero positivo");
				numeroIngresado=InAndOut.pedirEntero();
		} while (numeroIngresado<=0);
		setNumero(numeroIngresado);
	}
	
	protected int cantDeCifras (int numeroRecibido) {
		StringBuffer buffer=new StringBuffer();
		buffer.append(numero);
		
		return buffer.length();
	}
	
	public void  cifrasDeUnNumero () {
		setearNumero();
		int cantidad=cantDeCifras(getNumero());
		if (numero==1) {
			InAndOut.mostrarMensaje("Su numero solo tiene " + cantidad + "cifra");
		}else {
			InAndOut.mostrarMensaje("Su numero  tiene " + cantidad + " cifrassssssssssss ");
		}
		
	}
	
	
	
}
