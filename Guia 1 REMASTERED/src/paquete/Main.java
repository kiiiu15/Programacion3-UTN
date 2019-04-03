package paquete;

public class Main {

	public static void main(String[] args) {
			int opcion;
			InAndOut.mostrarMensaje("Biernvenido!!!!!!!\n okey pido discuppas por el menu pobre pero ya estaba hasta las *******\n ingresa lo que quieras  y apreta enter para continuar");
			InAndOut.pedirString();
			do {
				InAndOut.mostrarMensaje("Elija que ejercico quiere emular.... SI ASI NOMAS Y QUE!?");
				for (int i=1; i<=24;i++) {
					InAndOut.mostrarMensaje(""+i);
				}
				
				opcion=InAndOut.pedirEntero();
				
				switch (opcion) {
				case 1:
					Ej1 A = new Ej1(10);
					InAndOut.mostrarMensaje("El promedio de los Elementos del sig arreglo: ");
					A.mostrarArreglo(A.getArreglo(), A.getArreglo().length);
					InAndOut.mostrarMensaje(""+A.promedioElementosArreglo());
					break;
					
				case 2:
					Ej2 B = new Ej2();
					InAndOut.mostrarMensaje("Ingrese un numero");
					if (B.esPar(InAndOut.pedirEntero())){
						InAndOut.mostrarMensaje("Es par");
					} else {
						InAndOut.mostrarMensaje("No es par");
					}
					break;
				case 3:
					int arregloide [];
					Ej3 C = new Ej3(); 
					arregloide= C.encontrarPrimos(100);
					Ej1 Z = new Ej1(arregloide, arregloide.length);
					Z.mostrarArreglo(arregloide, arregloide.length);
					break;
				case 4:
					int arregloide2 [];
					Ej3 D = new Ej3();
					InAndOut.mostrarMensaje("Ingrese cantidad de primos que quiere obtener");
					arregloide2= D.encontrarPrimos(InAndOut.pedirEntero());
					Ej1 Y = new Ej1(arregloide2, arregloide2.length);
					Y.mostrarArreglo(arregloide2, arregloide2.length);
					break;
				case 5:
					InAndOut.mostrarMensaje("NO HABIA EJ5 JAJAA SALUDOS");
					break;
				case 6:
					Ej6 F = new Ej6();
					F.sonPrimos();
					break;
				case 7:
					Ej7 G = new Ej7();
					InAndOut.mostrarMensaje("La sumatoria de los primeros 10 numeros naturales equivales a "+G.sumatoriaprimerosXNumerosNaturalesConsecutivos(10));
					break;
	
				case 8:
					Ej8 H = new Ej8();
					H.cuantosPositivos();
					break;
				case 9:
					Ej9 I = new Ej9();
					InAndOut.mostrarMensaje("Ingresar anio para verificar si es biciesto");
					I.esBiciesto(InAndOut.pedirEntero());
					break;
				case 10:
					Ej10 J = new Ej10();
					InAndOut.mostrarMensaje("Ingresarcaracetr para verificar su codigo Ascii");
					InAndOut.mostrarMensaje("El codigo ascii del caracter ingresado equivale a "+J.codigoAsciiDelCaracter(InAndOut.pedirChar()));
					break;
				case 11:
					Ej11 K = new Ej11();
					InAndOut.mostrarMensaje("Ingrese numero, enter, numero, enter para multiplicarlos");
					InAndOut.mostrarMensaje(""+K.multiplicar(InAndOut.pedirEntero(), InAndOut.pedirEntero()));
					break;
				case 12:
					Ej12 L = new Ej12();
					InAndOut.mostrarMensaje(""+L.calcularArea());
					break;
				case 13:
					Ej13 M = new Ej13();
					M.saludador();
					break;
				case 14:
					Ej14 N =new Ej14();
					N.insertFunctionNameHere();
					break;
				case 15:
					Ej15 O = new Ej15();
					InAndOut.mostrarMensaje("Farentheit: "+O.PasarCaF());
					break;
				case 16:
					Ej16 P = new Ej16();
					P.AreaYPerimetroCirculo();
					break;
				case 17:
					Ej17 Q = new Ej17();
					InAndOut.mostrarMensaje("Ingrese velocidad en KM/H para pasarla a MM/H");
					Q.pasaKMaMM(InAndOut.pedirFloat());
					break;
				case 18:
					Ej18 R = new Ej18(); 
					InAndOut.mostrarMensaje("Ingrese cateto1, enter, cateto2, enter para calcular la hipotenusa");
					InAndOut.mostrarMensaje("La hipotenusa tenda un largo de " + R.calculaHipotenusa(InAndOut.pedirFloat(), InAndOut.pedirFloat()));
					break;
				case 19:
					Ej19 S = new Ej19(7);
					InAndOut.mostrarMensaje("todo bien pero ni yo  te pongo 30 temp, pone 7 pero para 30 tmb sirve ;) (formato de salida min - promedio - max)");
					InAndOut.mostrarMensaje(""+ S.maxMinPromMes());
					break;
				case 20:
					Ej20 T = new Ej20();
					InAndOut.mostrarMensaje("El numero generado es: "+T.numeroRandom());
					break;
				case 21:
					Ej21 U = new Ej21();
					U.diaLaboral();
					break;
				case 22:
					Ej22 V = new Ej22();
					V.cifrasDeUnNumero();
					break;
				case 23:
					Ej23 W = new Ej23();
					W.calculadoraPolacaInversaApp();
					break;
				case 24:
					Ej23bis X = new Ej23bis();
					X.calcularSalario();
					break;
				default:
					InAndOut.mostrarMensaje("En serio!? 23 numerios y pones cualquier otro? Opcion Invalida");
					break;
				}
				
				InAndOut.mostrarMensaje("Desea realizar otra operacion? s/n");
			} while (InAndOut.pedirChar()!='n');
			InAndOut.mostrarMensaje("Hasta la vista. BABY!!!!!!");
		
	}

}
