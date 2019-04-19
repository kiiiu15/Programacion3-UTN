package paquete;

import interacionConElUsuario.InAndOut;

public class EjemplarLiterario extends Ejemplar {
	private String nombreDeLaObra;
	private Autor autorDelEjemplar;
	private int cantidadDeHojas;
	private int cantidadDeCopias;
	private String getNombreDeLaObra() {
		return nombreDeLaObra;
	}
	private void setNombreDeLaObra(String nombreDeLaObra) {
		this.nombreDeLaObra = nombreDeLaObra;
	}
	private Autor getAutorDelEjemplar() {
		return autorDelEjemplar;
	}
	private void setAutorDelEjemplar(Autor autorDelEjemplar) {
		this.autorDelEjemplar = autorDelEjemplar;
	}
	private int getCantidadDeHojas() {
		return cantidadDeHojas;
	}
	private void setCantidadDeHojas(int cantidadDeHojas) {
		this.cantidadDeHojas = cantidadDeHojas;
	}
	private int getCantidadDeCopias() {
		return cantidadDeCopias;
	}
	private void setCantidadDeCopias(int cantidadDeCopias) {
		this.cantidadDeCopias = cantidadDeCopias;
	}
	
	public EjemplarLiterario () {
		super(10);
		setCantidadDeCopias(0);
		setCantidadDeHojas(0);
		setNombreDeLaObra("");
		setAutorDelEjemplar(new Autor());
	}
	
	public EjemplarLiterario (String nombrePasado, int cantidadDeHojasIndicados, int cantidadDeCopiasInidicadas, float precioDeLaObra, String nombreDelAutor, String apellidoDelAutor, String emailDelAutor, char genero, int cantidadDeObrasEscritas) {
		super(precioDeLaObra);
		setCantidadDeCopias(cantidadDeCopiasInidicadas);
		setCantidadDeHojas(cantidadDeHojasIndicados);
		setNombreDeLaObra(nombrePasado);
		setAutorDelEjemplar(new Autor(nombreDelAutor, apellidoDelAutor, emailDelAutor, genero, cantidadDeObrasEscritas));
	}
	
	
	
	public void mostrarDatos () {
		InAndOut.mostrarMensaje("El nombre del ejemplar es : " + getNombreDeLaObra()+ "los datos del autor son: ");
		getAutorDelEjemplar().mostarDatos();
		InAndOut.mostrarMensaje("tiene " + getCantidadDeHojas() + "hojas y declaradas tiene aproximadamente "+ getCantidadDeCopias() +"copias" );
	}
	
	public void mostrarDatosDelAutor() {
		getAutorDelEjemplar().modificaDatos();
	}
	
	public void modificarDatos() {
		//para pedirle al usuario
	}
	
	public void modificarDatos(int nuevaCantidadDeHojas) {
		setCantidadDeHojas(nuevaCantidadDeHojas);	}
	
	public void modificarDatos(int nuevaCantidadDeHojas, int nuevaCantidadDeCopias) {
		modificarDatos(nuevaCantidadDeHojas);
		setCantidadDeCopias(nuevaCantidadDeCopias);
		
	}
	
	public void modificarDatos(int nuevaCantidadDeHojas, int nuevaCantidadDeCopias, String nuevoNombre ) {
		modificarDatos(nuevaCantidadDeHojas,nuevaCantidadDeCopias);
		setNombreDeLaObra(nuevoNombre);
	}
	
	public void modificarDatos (Autor nuevoAutor) {
		setAutorDelEjemplar(nuevoAutor);
	}
	
	public void modificarDatos (int nuevaCantidadDeHojas, int nuevaCantidadDeCopias, String nuevoNombre, Autor nuevoAutor) {
		modificarDatos(nuevaCantidadDeHojas,nuevaCantidadDeCopias, nuevoNombre);
		modificarDatos(nuevoAutor);
	}
	
	public void modificarDatos(int nuevaCantidadDeHojas, int nuevaCantidadDeCopias, String nuevoNombre, String nuevoNombreDelAutor, String nuevoApellidoDelAutor, String nuevoEmailDelAutor, char nuevoGeneroDelAutor) {
		modificarDatos(nuevaCantidadDeHojas, nuevaCantidadDeCopias, nuevoNombre);
		getAutorDelEjemplar().modificaDatos(nuevoNombreDelAutor, nuevoApellidoDelAutor, nuevoEmailDelAutor, nuevoGeneroDelAutor);
	}
	
	public void modificarDatos(String nuevoNombreDeAutor, String nuevoApellidoDelAutor, String nuevoEmailDelAutor, char nuevoGeneroDelAuor) {
		getAutorDelEjemplar().modificaDatos(nuevoNombreDeAutor, nuevoApellidoDelAutor, nuevoEmailDelAutor, nuevoGeneroDelAuor);
	}
	
	public void modificarDatos(int nuevaCantidadDeCopias, float nuevoPrecio) {
		super.modificarDatos(nuevoPrecio);
		setCantidadDeCopias(nuevaCantidadDeCopias);
	}
	
	public void mostrarNombreDelEjemplar () {
		InAndOut.mostrarMensaje(getNombreDeLaObra());
	}
	
	public void mostrarNombreDelAutorDelEjemplar() {
		getAutorDelEjemplar().mostrarNombreDelAutor();
	}
	
}
