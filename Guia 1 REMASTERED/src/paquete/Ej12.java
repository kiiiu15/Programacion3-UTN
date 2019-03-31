package paquete;


public class Ej12 {
	private float area;
	private int lado1;
	private int lado2;
	private final  float  PI =(float) 3.14;
	///getter & setters
	private float getArea() {
		return area;
	}
	private void setArea(float area) {
		this.area = area;
	}
	private int getLado1() {
		return lado1;
	}
	private void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	private int getLado2() {
		return lado2;
	}
	private void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	private float getPI() {
		return PI;
	}
	
	 

	//constructos
	
	public Ej12 () {
		setLado1(0);
		setLado2(0);
		setArea(getLado1()*getLado2());
	}
	
	//
	
	private int menu () {
		InAndOut.mostrarMensaje("De que tipo de figura desea sacar el area? /n 1. Triangulo /n 2. Rectangulo/n 3. Cuadrado/n 4. Circulo/n 5. salir");
		int opcion=InAndOut.pedirEntero();
		return opcion;
	}
	
	public float calcularArea () {
		int opcion;
		do {
			 opcion=menu();
			switch (opcion) {
			case 1:
					pedirLados(2, "base", "altura");
					setArea(((float)getLado1()*(float)getLado2())/2);
				break;
			case 2:
				pedirLados(2, "base", "altura");
				setArea((float)getLado1()*(float)getLado2());
				break;
			case 3:
				pedirLados(1, "", "");
				setArea((float)Math.pow((float)getLado1(), 2));
				break;
			case 4:
				pedirLados(1, "radio", "");
				setArea((float)Math.pow((float) getLado1(),2)*getPI());
				break;
			case 0: 
				
				break;
			default:
				InAndOut.mostrarMensaje("Opcion Invalida. Por favor reingrese.");
				opcion=-1;
				break;
			}
		} while (opcion == -1);
		
		return getArea();
	}
	
	private void pedirLados(int cantidad, String nombreLado,String nombreLado2) {
		for (int i=1; i<=cantidad;i++) {
			
			switch (i) {
			case 1:
				InAndOut.mostrarMensaje("Ingrese la longitud del lado " + nombreLado);
				setLado1(InAndOut.pedirEntero());
				break;
			case 2:
				InAndOut.mostrarMensaje("Ingrese la longitud del lado " + nombreLado2);
				setLado2(InAndOut.pedirEntero());
				break;
			}
			
		}
	}
}
