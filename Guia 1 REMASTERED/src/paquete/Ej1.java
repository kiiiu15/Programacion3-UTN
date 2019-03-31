package paquete;
import java.util.Random;
public class Ej1 {
	private static Random rand = new Random();
	private static int dimension;
	private int arreglo [];
	private int validos;
	
	//getters & setters
	private void setDimension (int dimensionRecibida) {
		dimension=dimensionRecibida;
	}
	
	private void setValidos (int validosRecibidos) {
		validos=validosRecibidos;
	}
	
	private void setArreglo (int arregloRecibido[]) {
		arreglo=arregloRecibido;
	}
	
	private  void setArreglo (int dimension) {
		arreglo=new int [dimension];
		cargarArreglo();
	}
	
	
	private int  getDimension () {
		return dimension;
	}
	
	private int getValidos() {
		return validos;
	}
	
	public int [] getArreglo() {
		return arreglo;
	}
	
	//constructores
	
	public Ej1() {
		setValidos(0);
		setDimension(0);
		setArreglo(getDimension());
	}
	
	public Ej1 (int dimensionRecibida) {
		setValidos(0);
		setDimension(dimensionRecibida);
		setArreglo(getDimension());
		
	}
	
	public Ej1 (int arregloRecibido [], int validos) {
		setValidos(validos);
		setDimension(arregloRecibido.length);
		setArreglo(arregloRecibido);
		
	}
	
	//metodos...
	
	public  void cargarArreglo () {
		for (int i =0; i<getDimension();i++) {
			arreglo[i]=(int) Math.pow((double) rand.nextInt(50), (double) 2)%10; // la potenciua es para hacerlopsoitvo y el % para que no supere 10
			setValidos(getValidos()+1);
		}
	}
	
	private  int  sumatoriaElementosArreglo() {
		int sumatoria =0;
		for (int i=0;i<getValidos();i++) {
			sumatoria += arreglo[i];
		}
		return sumatoria;
	}
	
	public float promedioElementosArreglo() {
		return (float)sumatoriaElementosArreglo()/(float)getValidos();
	}
	
	
	public  void mostrarArreglo () {
		for (int i =0; i< getValidos();i++) {
			System.out.print( "|" + arreglo[i] + "|");
			
		}
		System.out.println(" ");
	}
	
	
}
