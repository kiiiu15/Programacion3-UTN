package paquete;

public class Ej10 {
	private char caracter;
///  getter & setter
	private char getCaracter() {
		return caracter;
	}

	private void setCaracter(char caracter) {
		this.caracter = caracter;
	}
// contrcutor 
	public Ej10 () {
		setCaracter(' ');
	}
	
	
	//metodos..
	
	public int  codigoAsciiDelCaracter(char este) {
		setCaracter(este);
		return (int) getCaracter();
	}
}
