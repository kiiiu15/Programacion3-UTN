package paquete;

public class Ej7 {
	private int  numerosAContar;
	private int sumatoria;
	
	//getter & setters
	
	private int getSumatoria() {
		return sumatoria;
	}

	private void setSumatoria(int sumatoria) {
		this.sumatoria = sumatoria;
	}

	private int getNumerosAContar() {
		return numerosAContar;
	}

	private void setNumerosAContar(int numerosAContar) {
		this.numerosAContar = numerosAContar;
	}
	
	// contructor
	
	public Ej7() {
		setNumerosAContar(10);
		setSumatoria(0);
	}
	public Ej7(int pedidos) {
		setNumerosAContar(pedidos);
		setSumatoria(0);
	}
	
	

	

	
	/// metodos


private void setearNumerosAContar (int limite) {
	int nuevoIngreso;
	if (limite> 0) {
		setNumerosAContar(limite);
	}else {
			do {
				InAndOut.mostrarMensaje("Se debe ingresar un nummero positivo hasta el cuyal contar");
				nuevoIngreso=InAndOut.pedirEntero();
			} while (nuevoIngreso<0);
		
			setNumerosAContar(nuevoIngreso);
			
		}

}
	
	public int sumatoriaprimerosXNumerosNaturalesConsecutivos () {
			for(int i=0; i<getNumerosAContar();i++) {
				setSumatoria(getSumatoria()+i);
			}
			
			return getSumatoria();
	}



	public int sumatoriaprimerosXNumerosNaturalesConsecutivos (int limite) {
			setearNumerosAContar(limite);
			for(int i=0; i<getNumerosAContar();i++) {
				setSumatoria(getSumatoria()+i);
			}
	
			return getSumatoria();
	}







}

