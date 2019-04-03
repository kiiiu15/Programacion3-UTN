package paquete;
import java.util.Random;
public class Ej1 {
	private  Random rand = new Random();
	private  int dimension;
	private int arreglo [];
	private int validos;
	
	//getters & setters
	protected void setDimension (int dimensionRecibida) {
		dimension=dimensionRecibida;
	}
	
	protected void setValidos (int validosRecibidos) {
		validos=validosRecibidos;
	}
	
	protected  void setArreglo (int arregloRecibido[]) {
		arreglo=arregloRecibido;
	}
	
	protected  void setArreglo (int dimension) {
		arreglo=new int [dimension];
		cargarArregloAuto();
	}
	
	
	protected int  getDimension () {
		return dimension;
	}
	
	protected int getValidos() {
		return validos;
	}
	
	public  int [] getArreglo() {
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
	
	public  void cargarArregloAuto () {
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
	
	
	public  void mostrarArreglo (int arregloRecibido[], int validos) {
		setArreglo(arregloRecibido);
		setValidos(validos);
		for (int i =0; i< getValidos();i++) {
			System.out.print( "|" + arreglo[i] + "|");
			
		}
		System.out.println(" ");
	}
	
}
