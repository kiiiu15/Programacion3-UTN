package paquete;

public class Ej21 {
	
	//con structor 
	
	public Ej21 () {
		
	}
	
	//metodos
	
	private boolean  diaEsLaboral () {
		boolean respuesta=false;
		int opcion;
		do {
			InAndOut.mostrarMensaje("Ingrese un dia de la semana 1. Lunes 2. Martes 3. Miercoles 4. Jueves 5. Viernes 6. Sabado 7. Domingo");
			opcion=InAndOut.pedirEntero();
		
		
			switch (opcion) {
			case 1:
				respuesta=true;
				opcion=0;
				break;
			case 2:
				respuesta=true;
				opcion=0;
				break;
			case 3:
				respuesta=true;
				opcion=0;
				break;
			case 4:
				respuesta=true;
				opcion=0;
				break;
			case 5:
				respuesta=true;
				opcion=0;
				break;
			case 6:
				respuesta=false;
				opcion=0;
				break;
			case 7:
				respuesta=false;
				opcion=0;
				break;

			default:
				InAndOut.mostrarMensaje("El dia ingresado no es valido. Reingrese");
				opcion=1;
				break;
			
			}
		} while (opcion !=0);
		
		return respuesta;
	}
	
	private int otraVez() {
		InAndOut.mostrarMensaje("Desea verificar otro dia? s/n ");
		int retorno=1;
		if (InAndOut.pedirChar()=='n') {
			retorno=0;
		}
		return retorno;
	} 
	
	public void diaLaboral() {
		do {
			if (diaEsLaboral()) {
				InAndOut.mostrarMensaje("Es dia laboral");
			} else {
				InAndOut.mostrarMensaje("No es dia laboral");
			}
		} while (otraVez()!=0);
	}
	
	
}
