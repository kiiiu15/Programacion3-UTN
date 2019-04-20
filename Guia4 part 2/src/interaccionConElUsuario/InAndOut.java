package interaccionConElUsuario;

import java.util.Scanner;

public class InAndOut {
	public static Scanner scan=new Scanner(System.in);
	
	public static void mostrarMensaje (String mensaje) {
		System.out.println(mensaje);
	}
	
	public static int pedirEntero() {
		return scan.nextInt();
	}
	
	public static char pedirCaracter() {
		return scan.next().charAt(0);
	}
	
	public static float pedirFloat() {
		return scan.nextFloat();
	}
	
	public static String pedirString() {
		return scan.next();
	}
	
	public static double pedirDouble() {
		return scan.nextDouble();
	}
	
	
}
