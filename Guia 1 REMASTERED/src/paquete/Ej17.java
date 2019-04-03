package paquete;

public class Ej17 {
	private int pasajeDeUnidades;
	private float unidadA;
	private float unidadB;
	
	//getter & setters
	protected int getPasajeDeUnidades() {
		return pasajeDeUnidades;
	}
	protected void setPasajeDeUnidades(int pasajeDeUnidades) {
		this.pasajeDeUnidades = pasajeDeUnidades;
	}
	protected float getUnidadA() {
		return unidadA;
	}
	protected void setUnidadA(float unidadA) {
		this.unidadA = unidadA;
	}
	protected float getUnidadB() {
		return unidadB;
	}
	protected void setUnidadB(float unidadB) {
		this.unidadB = unidadB;
	}
	
	//constructor 
	public Ej17() {
		setPasajeDeUnidades(1000);
		setUnidadA(0);
		setUnidadB(0);
	}
	//metodos
	
	private float deKMaMM () {
		setPasajeDeUnidades(1000);
		setUnidadB(getUnidadA()*getPasajeDeUnidades());
		return getUnidadB();
	}
	
	public void pasaKMaMM(float velocidad) {
		setUnidadA(velocidad);
		InAndOut.mostrarMensaje(getUnidadA()+ " KM son " + deKMaMM() + " Mts");
	}
	
}
