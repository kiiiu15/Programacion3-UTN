package paquete;
import java.util.Scanner;
public class InAndOut {
	public static Scanner scan= new Scanner (System.in);
	
	
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	
	public int pedirEntero () {
		return scan.nextInt();
	}
	
	public String pedirString () {
		return scan.next();
	}
	
	public float pedirFloat() {
		return scan.nextFloat();
	}
	public double pedirDoble() {
		return scan.nextDouble();
	}
	
	public char pedirCaracter() {
		return scan.next().charAt(0);
	}
}
