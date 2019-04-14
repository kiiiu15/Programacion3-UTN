package paquete;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			InAndOut.mostrarMensaje("ESCRIBAS LA HARCODEADA CONCHA DE TU MADRE!!!");
			MaquinaExprendedora mime=new MaquinaExprendedora(10,1000,3);
			Boleto AA=mime.comprarBoleto();
			InAndOut.mostrarMensaje("Aca esta tu boleto de: "+AA.obtenerPrecio());
			InAndOut.mostrarMensaje("AAA");
			 AA=mime.comprarBoleto();
			InAndOut.mostrarMensaje("Aca esta tu boleto de: "+AA.obtenerPrecio());
			InAndOut.mostrarMensaje("Este es su vuelto"+ mime.solicitarVuelto() );
			InAndOut.mostrarMensaje("La ganancia fue de: " + mime.retirarGanancia());
			InAndOut.mostrarMensaje("La ganancia fue de: " + mime.retirarGanancia());
			
			InAndOut.scan.close();
	}

}
