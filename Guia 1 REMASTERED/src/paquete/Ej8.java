package paquete;

public class Ej8 {
	private int contador;
	private int numero;
	//getter & setter (si autogenerados y que?)
	private int getContador() {
		return contador;
	}
	private void setContador(int contador) {
		this.contador = contador;
	}

	
	//constructor
	
	public Ej8 (){
		setContador(0);
	}
	
	// metods..
	
	private boolean esPositivo (int numero) {
		return numero>0 ? true : false;
	}
	
	public int cuantosPositivos() {
		do {
			InAndOut.mostrarMensaje("Ingrese un numero: ");
			if (esPositivo(InAndOut.pedirEntero())) {
				InAndOut.mostrarMensaje("Es positvo");
				setContador(getContador()+1);
			} else {
				InAndOut.mostrarMensaje("No es positivo");
			}
			InAndOut.mostrarMensaje("Desea vovler a ingresar otro numero? s/n ");
		} while (InAndOut.pedirChar()=='s');
		return getContador();
	}
	
	
	
}
