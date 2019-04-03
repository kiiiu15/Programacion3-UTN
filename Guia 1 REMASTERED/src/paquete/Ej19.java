package paquete;

public class Ej19 extends Ej1 {
	
	private int maxTemp;
	private int minTemp;
	
	// getters & setters 

	private int getMaxTemp() {
		return maxTemp;
	}
	private void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}
	private int getMinTemp() {
		return minTemp;
	}
	private void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}
	
	//constructor 
	
	public Ej19() {
		super(30);
		setMaxTemp(0);
		setMinTemp(0);
		
	}
	
	
	public Ej19(int cantTempBuscadas) {
		super(cantTempBuscadas);
		setMaxTemp(0);
		setMinTemp(0);
	}
	
	//metodos.....
	

	
	private void cargarArreglo() {
		InAndOut.mostrarMensaje("Ingrese una temp, ENTER, otra temp y asi sucesiavemente hastas copmpletar las " + getDimension()+ " temperaturas");
		for (int i=0; i<getDimension();i++) {
			getArreglo()[i]=InAndOut.pedirEntero();
		}
	}
	
	public StringBuffer maxMinPromMes () {
		StringBuffer respuesta=new StringBuffer();
		cargarArreglo();
		setMaxTemp(encontrarMaximo(getArreglo(), getDimension()));
		setMinTemp(encontrarMinimo(getArreglo(), getDimension()));
		respuesta.append(getMinTemp()+" - " + promedioElementosArreglo()+" - " + getMaxTemp());
		
		return respuesta;
	}
	
	protected int encontrarMinimo (int arreglo[], int validos) {
		int minimo=arreglo[0];
		for (int i=0;i<validos;i++) {
			if (arreglo[i]<minimo) {
				minimo=arreglo[i];
			}
		}
		
		return minimo;
	}
	
	protected int encontrarMaximo (int arreglo[], int validos) {
		int maximo=arreglo[0];
		for (int i=0;i<validos;i++) {
			if (arreglo[i]>maximo) {
				maximo=arreglo[i];
			}
		}
		
		return maximo;
	}
	
	
	
	
}
