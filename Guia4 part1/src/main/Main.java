package main;
import figurasGeometricas.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo miRectangulo=new Rectangulo(15,25);
		miRectangulo.mostrarValoresDeAtributos();
		InAndOut.mostrarMensaje("El perimetro de rectangulo es de: " + miRectangulo.obtenerPerimetro() + " y el area es de: "+miRectangulo.obtenerArea());
		miRectangulo.modificarAlto(10);
		miRectangulo.modificarAncho(15);
		InAndOut.mostrarMensaje("El perimetro de rectangulo es de: " + miRectangulo.obtenerPerimetro() + " y el area es de: "+miRectangulo.obtenerArea());
		miRectangulo=new Rectangulo();
		InAndOut.mostrarMensaje("El perimetro de rectangulo es de: " + miRectangulo.obtenerPerimetro() + " y el area es de: "+miRectangulo.obtenerArea());
	}

}
