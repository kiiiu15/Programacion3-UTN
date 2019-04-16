package paquete;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			InAndOut.mostrarMensaje("ESCRIBAS LA HARCODEADA CONCHA DE TU MADRE!!!");
			MaquinaExprendedora mime=new MaquinaExprendedora(10,3,1000);
			Boleto AA=mime.comprarBoleto();
			InAndOut.mostrarMensaje("Aca esta tu boleto de: "+AA.obtenerPrecio());
			
			InAndOut.scan.close();
	}

}
