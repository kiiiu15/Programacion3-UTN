package Main;
import Persona.*;
import interaccionConElUsuario.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado miEmpleado = new Empleado("Carlos", "Guti�rrez", "23456345", 'm', 100);
		Empleado miEmpleado2 = new Empleado("Ana", "S�nchez", "34234123", 'f', 27500);
		
		miEmpleado.mostrarDatos();
		miEmpleado2.mostrarDatos();
		miEmpleado.aumentarSalarioEnPorcentaje(15);
		miEmpleado.mostrarDatos();
		InAndOut.mostrarMensaje("El salario anual seria de: "+miEmpleado.calcularSalarioAnual());
	}

}
