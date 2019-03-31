package paquete;
import java.util.Scanner;
public class InAndOut {
	public static void mostrarMensaje (String mensaje) {
		System.out.println(mensaje);
	}
	
	public static int pedirEntero() {
		Scanner scan=new Scanner(System.in);
		int aDevolver=scan.nextInt();
		//scan.close();
		return aDevolver;
	}
	
	
	public static String pedirString() {
		Scanner scan=new Scanner(System.in);
		String aDevolver= new String(scan.next());
		//scan.close();
		return aDevolver;
	}
	
	
	public static char pedirChar() {
		Scanner scan=new Scanner(System.in);
		char aDevolver=scan.next().charAt(0);
		//scan.close();
		return aDevolver;
	}
	
	public static boolean pedirBooleano() {
		Scanner scan=new Scanner(System.in);
		boolean aDevolver=scan.hasNext();
		//scan.close();
		return aDevolver;
	}
}
