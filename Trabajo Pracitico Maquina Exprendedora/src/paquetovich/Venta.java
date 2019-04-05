package paquetovich;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.omg.PortableServer.ServantRetentionPolicyValue;

public class Venta {
	private int cantidadDeBoletosComprados;
	private enum metodoDePago{tarjetaDeCredito, tarjetaDeDebito, Efectivo, NoEspecificado }
	private enum estado {Cerrada, Cancelada, EnProceso};
	private String fechaYHora;
	private estado estadoDElaventa;
	private metodoDePago comoPagoElCliente;
	private String nombreYApellidoDelComprador;
	private float saldo; 
	private float  vuelto;
	private int precio;
	
	
	private float getSaldo() {
		return saldo;
	}


	private float getVuelto() {
		return vuelto;
	}


	private void setVuelto(float vuelto) {
		this.vuelto = vuelto;
	}


	private void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	private estado getEstadoDElaventa() {
		return estadoDElaventa;
	}


	private void setEstadoDElaventa(estado estadoDElaventa) {
		this.estadoDElaventa = estadoDElaventa;
	}


	public  metodoDePago getComoPagoElCliente() {
		return comoPagoElCliente;
	}


	private  void setComoPagoElCliente(metodoDePago comoPagoElCliente) {
		this.comoPagoElCliente = comoPagoElCliente;
	}


/// getters & setters
	
	private int getCantidadDeBoletosComprados() {
		return cantidadDeBoletosComprados;
	}


	private void setCantidadDeBoletosComprados(int cantidadDeBoletosComprados) {
		this.cantidadDeBoletosComprados = cantidadDeBoletosComprados;
	}


	private String getFechaYHora() {
		return fechaYHora;
	}


	private int getPrecio() {
		return precio;
	}


	private void setPrecio(int precio) {
		this.precio = precio;
	}
	

//constructor 
	private String getNombreYApellidoDelComprador() {
		return nombreYApellidoDelComprador;
	}


	private void setNombreYApellidoDelComprador(String nombreYApellidoDelComprador) {
		this.nombreYApellidoDelComprador = nombreYApellidoDelComprador;
	}


	public Venta () {
		setCantidadDeBoletosComprados(0);
		setPrecio(0);
		setEstadoDElaventa(estadoDElaventa.EnProceso);
		setComoPagoElCliente(metodoDePago.NoEspecificado);
		setNombreYApellidoDelComprador(" ");
		setSaldo(0);
		setVuelto(0);
		
		
		
	}

	
	//metodos
	
	private boolean saldoSuficiente () {return getSaldo()>= getPrecio();}
	private   String obtenerFechaYHora () {
			StringBuffer devolver=new StringBuffer();
			Date date = new Date();
			DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
			devolver.append(hourdateFormat.format(date));
			return devolver.toString();
	}
	
	public float realizarVenta () {
		preguntarMetodoDePago();
		
		
	}
	
	
	private void recibirPago () {
		switch (getComoPagoElCliente()) {
		case Efectivo:
			InAndOut.mostrarMensaje("Ingrese un billete, ENTER, otro billete y asi sucesiamente ingrese 0 para terminar");
			break;
		case tarjetaDeDebito:
			InAndOut.mostrarMensaje("Ingrese su tarjeta");
			recibirDinero(pagoConTarjeta());
			break; 
		case tarjetaDeCredito: 
			InAndOut.mostrarMensaje("Ingrese su tarjeta");
			recibirDinero(pagoConTarjeta());
			break;
		default:
			
			break;
		}
	}
	
	private float pagoConTarjeta () {
		return (float) getPrecio();
	}
	private float  recibirDinero (float dineroRecibido) {
		setSaldo(dineroRecibido);
			if (getSaldo() > getPrecio()) {
				setVuelto(getSaldo()-getPrecio());
				setSaldo(getPrecio());
			} 
			
			return getVuelto(); 

	}
	
	private  void preguntarMetodoDePago () {
		InAndOut.mostrarMensaje("Indique su metododo de Pago: 1. Efectivo 2. Debito 3. Credito");
		do {
			switch (InAndOut.pedirEntero()) {
			case 1: 
				setComoPagoElCliente(metodoDePago.Efectivo);
				break;
			case 2: 
				setComoPagoElCliente(metodoDePago.tarjetaDeDebito);
				break;
			case 3: 
				setComoPagoElCliente(metodoDePago.tarjetaDeCredito);
				break;
			default: 
				InAndOut.mostrarMensaje("Opcion ingresada incorrecta. Reingrese");
				break;
			}
		} while (getComoPagoElCliente()==metodoDePago.NoEspecificado);
		
	}
}


