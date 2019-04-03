package paquete;

public class Ej23bis {
	private int edad;
	private String nombre;
	private float salario;
	private float porcentajeAumentoPorEdad;
	
	// getter & setters
	private int getEdad() {
		return edad;
	}
	private void setEdad(int edad) {
		this.edad = edad;
	}
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private float getSalario() {
		return salario;
	}
	private void setSalario(float salario) {
		this.salario = salario;
	}
	private float getPorcentajeAumentoPorEdad() {
		return porcentajeAumentoPorEdad;
	}
	private void setPorcentajeAumentoPorEdad(float porcentajeAumentoPorEdad) {
		this.porcentajeAumentoPorEdad = porcentajeAumentoPorEdad;
	}
	
//constructor 
	
	public Ej23bis () {
		setEdad(0);
		setNombre(" ");
		setSalario(0);
		setPorcentajeAumentoPorEdad(0);
	}
	
	
	public Ej23bis (int edadRecibida, String nombreRecbido, int salarioRecibido) {
		setEdad(edadRecibida);
		setNombre(nombreRecbido);
		setSalario(salarioRecibido);
		calcularProcentajeDeAumento();
	}
	
	//metodos
	
	private void pedirDatosPersona() {
		InAndOut.mostrarMensaje("Ingrese edad,ENTER, nombre, ENTER, salario, ENTER ");
		setEdad(InAndOut.pedirEntero());
		setNombre(InAndOut.pedirString());
		setSalario(InAndOut.pedirFloat());
		
	}
	
	private void calcularProcentajeDeAumento() {
		if (getEdad()<16) {
			setPorcentajeAumentoPorEdad(0);
		}else {
			if (16 <=getEdad()&& getEdad()<=50) {
				setPorcentajeAumentoPorEdad((float) 0.05);
			}else {
				if (51<=getEdad()&& getEdad()<=60) {
					setPorcentajeAumentoPorEdad((float) 0.1);
				}else {
					setPorcentajeAumentoPorEdad((float) 0.15);
				}
			}
		}
	}
	
	public void calcularSalario() {
		pedirDatosPersona();
		calcularProcentajeDeAumento();
		InAndOut.mostrarMensaje("El salrio correspondiente del trabajador es de " + (getSalario()+getSalario()*getPorcentajeAumentoPorEdad()));
	}
	
	
	
	
	
}



