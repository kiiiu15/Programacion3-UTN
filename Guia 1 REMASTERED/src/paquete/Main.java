package paquete;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej1 hola=new Ej1(0);
		Ej3 como=new Ej3(1);
		int arreglin []= como.encontrarPrimos();
		hola.mostrarArreglo( arreglin, arreglin.length);
		//System.out.println("El promedio de este arreglo es de " + hola.promedioElementosArreglo());
		
	}

}
