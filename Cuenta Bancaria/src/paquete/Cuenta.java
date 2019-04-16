package paquete;
import java.util.concurrent.Semaphore;

public class Cuenta {
	private float saldo;
	private Semaphore mutualExclusion;
	
	//getter & setter
	
	private float getSaldo() {
		return saldo;
	}
	private void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	private Semaphore getMutualExclusion() {
		return mutualExclusion;
	}
	private void setMutualExclusion(Semaphore mutualExclusion) {
		this.mutualExclusion = mutualExclusion;
	}
	
	
	
	//constructor
	
	public Cuenta () {
		setSaldo(0);
		setMutualExclusion(new Semaphore(1));
	}
	
	public Cuenta (float saldoInicial) {
		setSaldo(saldoInicial);
		setMutualExclusion(new Semaphore(1));
	}
	
	//metodos..
	
	public float  obtenerSaldo() {
		float saldito=0;
		try {
			getMutualExclusion().acquire();
			saldo=getSaldo();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			InAndOut.mostrarMensaje("A ocurrido un error por favor intente de nuevo.");
		}
		
		
		getMutualExclusion().release();
		return saldito;
	}
	
	
	public void ingresarSaldo(float saldo_a_ingresar) {
		try {
			getMutualExclusion().acquire();
			acumularSaldo(saldo_a_ingresar);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			InAndOut.mostrarMensaje("A ocurrido un error por favor intente de nuevo.");
		}
		getMutualExclusion().release();
		
	}
	
	
	private void acumularSaldo (float saldo_a_acumular) {
		setSaldo(getSaldo()+saldo_a_acumular);
	}
	
	public void consultarSaldo () {
		InAndOut.mostrarMensaje("Su saldo es de "+getSaldo());
	}
	
	public float retirarSaldo() {
		float aRetirar=0;
		InAndOut.mostrarMensaje("Cuanto dinero desea retirar?");
		aRetirar=InAndOut.pedirFloat();
		try {
			getMutualExclusion().acquire();
			if (getSaldo()<aRetirar) {
				InAndOut.mostrarMensaje("Su saldo es insuficiente");
				aRetirar=0;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			InAndOut.mostrarMensaje("A ocurrido un error por favor intente de nuevo.");
		}
		
		
		getMutualExclusion().release();
		return aRetirar;
		
	}
	
	
	
	
}
