package paquete;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta=null;
		float auxiliar=0;
		char continuar='s';
		do {
			InAndOut.mostrarMensaje("1. Crear cuenta vacía\r\n" + 
					"2. Crear cuenta saldo inicial\r\n" + 
					"3. Ingresar dinero\r\n" + 
					"4. Sacar dinero\r\n" + 
					"5. Ver saldo\r\n" + 
					"6. Salir\r\n" + 
					"");
			switch (InAndOut.pedirEntero()) {
			case 1:
				cuenta=new Cuenta ();
				break;
			case 2:
				InAndOut.mostrarMensaje("Indique su saldo inicial");
				cuenta=new Cuenta (InAndOut.pedirFloat());
				break;
			case 3:
				if (cuenta != null && cuenta instanceof Cuenta ) {
					InAndOut.mostrarMensaje("Indique la cantidad de dinero a ingresar");
					cuenta.ingresarSaldo(InAndOut.pedirFloat());
				}else {
					InAndOut.mostrarMensaje("La cuenta no existe");
				}
				break;
			case 4:
				if (cuenta != null && cuenta instanceof Cuenta ) {
					auxiliar=cuenta.retirarSaldo();
					InAndOut.mostrarMensaje("He aqui su dinero: "+auxiliar);
				}else {
					InAndOut.mostrarMensaje("La cuenta no existe");
				}
				break;
			case 5:
				if (cuenta != null && cuenta instanceof Cuenta ) {
					cuenta.consultarSaldo();
				}else {
					InAndOut.mostrarMensaje("La cuenta no existe");
				}
				
				break;
			case 6:
				continuar='n';
				break;

			default:
				InAndOut.mostrarMensaje("Opcion correcta por favor reingrese.");
				break;
			}
		}while (continuar!= 'n');
		InAndOut.mostrarMensaje("Adios!");
		InAndOut.scan.close();

	}
	

}
