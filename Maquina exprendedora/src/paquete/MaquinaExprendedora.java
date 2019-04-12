package paquete;

public class MaquinaExprendedora {
	private float saldo;
	private float vuelto;
	private int boletosMaximos;
	private float gananciaMaxima;
	private int boletosVendidos;
	private float ganacia;
	private Boleto boleto;
	private String contraseña;
	
	
///Constructor	
	

	public MaquinaExprendedora() {

		setBoletosMaximos(1000);
		setBoletosVendidos(0);
		setGananciaMaxima(10000);
		setSaldo(0);
		setVuelto(0);
		setGanacia(0);
		setBoleto(new Boleto(10));
	}
	
	public MaquinaExprendedora(float precio) {
		
		setBoletosMaximos(1000);
		setBoletosVendidos(0);
		setGananciaMaxima(10000);
		setSaldo(0);
		setVuelto(0);
		setGanacia(0);
		setBoleto(new Boleto(precio));
		setContraseña("123456");
	}
	
	
	public MaquinaExprendedora(float precio, int boletosEsperados) {

		setBoletosMaximos(boletosEsperados);
		setBoletosVendidos(0);
		setGananciaMaxima(10000);
		setSaldo(0);
		setVuelto(0);
		setGanacia(0);
		setBoleto(new Boleto(precio));
		setContraseña("123456");
	}

	public MaquinaExprendedora(float precio, int boletosEsperados, float gananciaEsperada) {
		setBoletosMaximos(boletosEsperados);
		setBoletosVendidos(0);
		setGananciaMaxima(gananciaEsperada);
		setSaldo(0);
		setVuelto(0);
		setGanacia(0);
		setBoleto(new Boleto(precio));
		setContraseña("123456");
	}

///getters & setters

	private String getContraseña() {
		return contraseña;
	}

	private void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	private float getGanacia() {
		return ganacia;
	}




	private void setGanacia(float ganacia) {
		this.ganacia = ganacia;
	}




	private Boleto getBoleto() {
		return boleto;
	}




	private void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}




	private float getSaldo() {
		return saldo;
	}




	private void setSaldo(float saldo) {
		this.saldo = saldo;
	}




	private float getVuelto() {
		return vuelto;
	}




	private void setVuelto(float vuelto) {
		this.vuelto = vuelto;
	}




	private int getBoletosMaximos() {
		return boletosMaximos;
	}




	private void setBoletosMaximos(int boletosMaximos) {
		this.boletosMaximos = boletosMaximos;
	}




	private float getGananciaMaxima() {
		return gananciaMaxima;
	}




	private void setGananciaMaxima(float gananciaMaxima) {
		this.gananciaMaxima = gananciaMaxima;
	}




	private int getBoletosVendidos() {
		return boletosVendidos;
	}




	private void setBoletosVendidos(int boletosVendidos) {
		this.boletosVendidos = boletosVendidos;
	}
	
	
	
///metodos 
	
	private void acumularSaldo(float saldoIngresado) {
		setSaldo(getSaldo()+saldoIngresado);
	}
 	
	public Boleto comprarBoleto () 
	{
		float ingreso = 0;
		Boleto aDevoler = getBoleto();
		if (getBoletosVendidos()< getBoletosMaximos() && getGanacia()<getGananciaMaxima()) {
			if (getVuelto()>0) {
				acumularSaldo(getVuelto());
				setVuelto(0);
			}
			ingreso=ingresarDinero();
			acumularSaldo(ingreso);
			setBoleto(new Boleto(getBoleto().obtenerPrecio()));
			while (getSaldo()<getBoleto().obtenerPrecio()) {
				InAndOut.mostrarMensaje("Su saldo es insuficinte. El precio del boleto es de: "+ getBoleto().obtenerPrecio() + " y el saldo que ingreso es de: " + getSaldo() + "\n Ingrese mas dinero para continuar o ingrese 0 para cancelar la operacion.\n RECUERDE RETIRAR SU DINERO SOLICITANDO EL VUELTO ANTES DE RETIRARSE DE LÑA MAQUINA; SINO YA NO PODRA SALICITAR SU DINERO");
				ingreso=ingresarDinero();
				if (ingreso==0) {
					setVuelto(getSaldo());
					setSaldo(0);
				}
				acumularSaldo(ingreso);
			}
			
			if (getSaldo()>getBoleto().obtenerPrecio()) {
				setVuelto(getSaldo()-getBoleto().obtenerPrecio());
			}
			
			setSaldo(0);
			 
			
			if (ingreso==0) {
				aDevoler=null;
			}else {
				acumularGanacia(getBoleto().obtenerPrecio());
				acumularBoletos(1);
				aDevoler=getBoleto();
			}
		}else {
			InAndOut.mostrarMensaje("OUT OF ORDER");
		}

		
		return aDevoler;
	}
	
	
	private float ingresarDinero() {
		//por el moemnto solo efectivo de numero con la consola	
		float dineroIngresado=0;
		InAndOut.mostrarMensaje("Ingrese dinero");
		dineroIngresado=InAndOut.pedirFloat();
		return dineroIngresado;
	}
	
	public float solicitarVuelto () {
		float aDevolver;
		if (getVuelto()<= 0) {
			InAndOut.mostrarMensaje("No hay vuelto para devoler");
			setVuelto(0);
		} else {
			InAndOut.mostrarMensaje("Retire su vuelto");
		}
		
		
		
		aDevolver= getVuelto();
		setVuelto(0);
		
		return aDevolver;
	}
	
	
	private void acumularGanacia (float ingreso) {
		setGanacia(getGanacia()+ingreso);
	}
	
	private void acumularBoletos (int cantidadIngresada) {
		setBoletosVendidos(getBoletosVendidos()+cantidadIngresada);
	}
	
	
	
	public float  retirarGanancia () {
		float ganancia=0;
		InAndOut.mostrarMensaje("Ingrese su contraseña");
		if (InAndOut.pedirString().equals(getContraseña())){
			ganancia=resetearMaquina();
		}else {
			InAndOut.mostrarMensaje("Contraseña Incorrecta");
		}
		return ganancia;
	}
	
	
	private float resetearMaquina () {
		float  aDevolver=getGanacia();
		setGanacia(0);
		setBoletosVendidos(0);
		setVuelto(0);
		setBoleto(new Boleto(getBoleto().obtenerPrecio()));
		return aDevolver;
	}
}
