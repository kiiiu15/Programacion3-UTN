package cuentav2;

import interacionConElUsuario.InAndOut;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cuentaBancariav2 miCuenta=new cuentaBancariav2(10000,2000,"Agustin", "Bulzomi", "tinbulzomi@hotmail.com",'m',"123456", "77hq");
		miCuenta.mostrarDatos();
		miCuenta.retirarSaldo();
		InAndOut.mostrarMensaje(""+miCuenta.obtenerSaldo());
		InAndOut.scan.close();
	}

}
