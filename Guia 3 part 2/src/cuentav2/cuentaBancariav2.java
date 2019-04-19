package cuentav2;

import Persona.Persona;
import paquete.Cuenta;
import interacionConElUsuario.InAndOut;

public class cuentaBancariav2 {
	private Cuenta cuenta;
	private Titular titularDeLaCuenta;
	private String idDeCuenta;
	
	
	
	
	
	
	private String getIdDeCuenta() {
		return idDeCuenta;
	}
	private void setIdDeCuenta(String idDeCuenta) {
		this.idDeCuenta = idDeCuenta;
	}
	private Cuenta getCuenta() {
		return cuenta;
	}
	private void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	private Titular getTitularDeLaCuenta() {
		return titularDeLaCuenta;
	}
	private void setTitularDeLaCuenta(Titular titularDeLaCuenta) {
		this.titularDeLaCuenta = titularDeLaCuenta;
	}
	
	public cuentaBancariav2 () {
		setCuenta(new Cuenta ());
		setTitularDeLaCuenta(new Titular());
		setIdDeCuenta("");
	}
	
	public cuentaBancariav2 (float saldoInicial, String nombreDelTitular, String apellidoDelTitular, String emailDelTitular, char generoDelTitular,String idDeltitular, String idDeCuenta) {
		setCuenta(new Cuenta(saldoInicial));
		setTitularDeLaCuenta(new Titular (nombreDelTitular,apellidoDelTitular,emailDelTitular, generoDelTitular, idDeltitular));
		setIdDeCuenta(idDeCuenta);
	}
	
	
	public cuentaBancariav2 (float saldoInicial, float descubiertoPermitido, String nombreDelTitular, String apellidoDelTitular, String emailDelTitular, char generoDelTitular,String idDeltitular, String idDeCuenta) {
		setCuenta(new Cuenta(saldoInicial, descubiertoPermitido));
		setTitularDeLaCuenta(new Titular (nombreDelTitular,apellidoDelTitular,emailDelTitular, generoDelTitular, idDeltitular));
		setIdDeCuenta(idDeCuenta);
	}
	
	public void mostrarDatos () {
		InAndOut.mostrarMensaje("Esta cuenta, cuyo id de cuetna es: " + getIdDeCuenta() + "tiene un saldo de " + getCuenta().obtenerSaldo()+ "y los datos de sutitular son: ");
		getTitularDeLaCuenta().mostrarDatos();
	}
	
	public float obtenerSaldo () {
		return getCuenta().obtenerSaldo();
	}
	
	public void ingresarSaldo(float cantidad) {
		getCuenta().ingresarSaldo(cantidad);
	}
	
	public float retirarSaldo () {
		return getCuenta().retirarSaldo();
	}
}
