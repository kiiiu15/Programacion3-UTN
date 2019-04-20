package Persona;

import interaccionConElUsuario.InAndOut;

public class Empleado extends Persona{
	private float salario;

	private float getSalario() {
		return salario;
	}

	private void setSalario(float salario) {
		this.salario = salario;
	}
	
	public Empleado () {
		super();
		setSalario(0);
	}
	
	public Empleado (String nombre, String apellido, String dni, char genero, float salario) {
		super(nombre, apellido, "",genero, dni);
		setSalario(salario);
	}
	
	public void mostrarDatos() {
		InAndOut.mostrarMensaje("Empleado{");
		super.mostrarDatos();
		InAndOut.mostrarMensaje(", salario: "+getSalario()+" }");
		
	}
	
	public float calcularSalarioAnual() {
		return 12*getSalario();
	}
	
	public void aumentarSalarioEnPorcentaje (float porcentaje) {
		if (porcentaje>=0) {
			setSalario(getSalario()+getSalario()*porcentaje/100);
		}
	}
}
