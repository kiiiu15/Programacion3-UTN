package paquete;

import javax.swing.border.LineBorder;

import interacionConElUsuario.InAndOut;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Libro miLibro=new Libro("Effective Java", 1000, 150, 450, "Joshua", "Bloch", "joshua@email.com",'m', 5, "asdf1234");
		miLibro.mostrarDatos();
		miLibro.modificarDatos(200, (float)500);
		miLibro.mostrarDatos();
		miLibro.mostrarDatosDelAutor();
		miLibro.mostrarInfoSobreEllibro();
		InAndOut.scan.close();
	}

}
