package paquete;

public class Ej23 {
	private int operandoA;
	private int operandoB;
	private String signoAritmetico;
	private float resultado;
	/// getters & setters 
	
	private float getResultado() {
		return resultado;
	}





	private void setResultado(float resultado) {
		this.resultado = resultado;
	}





	private String getSignoAritmetico() {
		return signoAritmetico;
	}





	private void setSignoAritmetico(String signoAritmetico) {
		this.signoAritmetico = signoAritmetico;
	}





	private int getOperandoA() {
		return operandoA;
	}





	private void setOperandoA(int operandoA) {
		this.operandoA = operandoA;
	}





	private int getOperandoB() {
		return operandoB;
	}





	private void setOperandoB(int operandoB) {
		this.operandoB = operandoB;
	}

// contructor
	
	public Ej23 () {
		
	}



	public void calculadoraPolacaInversaApp () {
		pedirOperandos();
		setSignoAritmetico(pedirOperacion());
		switch (getSignoAritmetico()) {
		case "+":
		setResultado(suma(getOperandoA(), getOperandoB()));
		break;
		case "-":
			setResultado(resta(getOperandoA(), getOperandoB()));
		break;
		case "*":
			setResultado(multiplicacion(getOperandoA(), getOperandoB()));
		break;
		
		case "/":
			setResultado((float)divison(getOperandoA(), getOperandoB()));
		break;
		
		case "^":
			setResultado(potencia(getOperandoA(), getOperandoB()));
		break;
		case "%":
			setResultado(modulo(getOperandoA(), getOperandoB()));
		break;
		}
		
		InAndOut.mostrarMensaje("El resultado de su operacion es "+ getResultado());
		
	}
	
	private void pedirOperandos () {
		InAndOut.mostrarMensaje("Ingrese un opernado, ENTER,  y el otro operando ");
		setOperandoA(InAndOut.pedirEntero());
		setOperandoB(InAndOut.pedirEntero());
	}
	
	private String pedirOperacion() {
		String signo = new String ();
		String opciones= new String ("Suma: + \nResta:  - \nMultiplicacion * \nDivision: / \nPotencia: ^ \nResto Divison Entero:  % ");
		do {
			signo= " ";
			InAndOut.mostrarMensaje("Ingrese la operacion que desea relizar, luego ENTER");
			InAndOut.mostrarMensaje(opciones);
			signo=InAndOut.pedirString();
				if (!signo.equals("+")&&!signo.equals("-")&&!signo.equals("*")&&!signo.equals("/")&&!signo.equals("^")&&!signo.equals("%")) {
					InAndOut.mostrarMensaje("SYNTAX ERROR. REINGRESE");
					signo=" "; 
				}
		} while (signo.equals(" "));
		return signo;
	}
	
	
	//operaciones de la caslculadora 
	protected float suma (int A, int B) {return A+B;}
	protected float resta (int A, int B) {return A-B;}
	protected float multiplicacion (int A, int B) {return A*B;}
	protected double divison (int A, int B) {return (double) A/B;}
	protected float potencia (int A, int B) {return (float) Math.pow(A,B);}
	protected float modulo (int A, int B) {return A%B;}
	
}
