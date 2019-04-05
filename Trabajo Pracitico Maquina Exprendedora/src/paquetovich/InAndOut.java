package paquetovich;
import java.util.Scanner;
public class InAndOut {
	
	private static Scanner scan=new Scanner(System.in);
	
	public static Scanner getScan() {
		return scan;
	}

	public static void mostrarMensaje (String mensaje) {
		System.out.println(mensaje);
	}
	
	public static int pedirEntero() {
		int aDevolver=scan.nextInt();
		//scan.close();
		return aDevolver;
	}
	
	
	public static String pedirString() {
		String aDevolver= new String(scan.next());
		//scan.close();
		return aDevolver;
	}
	
	
	public static char pedirChar() {
		char aDevolver=scan.next().charAt(0);
		//scan.close();
		return aDevolver;
	}
	
	public static boolean pedirBooleano() {
		boolean aDevolver=scan.hasNext();
		//scan.close();
		return aDevolver;
	}
	
	public static float pedirFloat() {
		float aDevolver=scan.nextFloat();
		//scan.close();
		return aDevolver;
	}
	
	public static double pedirDoble() {
		double aDevolver=scan.nextDouble();
		//scan.close();
		return aDevolver;
	}
	
	
}