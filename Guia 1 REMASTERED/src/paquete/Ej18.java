package paquete;

public class Ej18 {
	private float cateto1;
	private float cateto2;
	private float hipotenusa;
	
	//getter & setters 
	
	private float getCateto1() {
		return cateto1;
	}
	private void setCateto1(float cateto1) {
		this.cateto1 = cateto1;
	}
	private float getCateto2() {
		return cateto2;
	}
	private void setCateto2(float cateto2) {
		this.cateto2 = cateto2;
	}
	private float getHipotenusa() {
		return hipotenusa;
	}
	private void setHipotenusa(float hipotenusa) {
		this.hipotenusa = hipotenusa;
	}
	
	// constructor
	
	public Ej18 () {
		setCateto1(0);
		setCateto2(0);
		
	}
	
	
	//metodos 
	
	public float calculaHipotenusa (float catetoA, float catetoB) {
		setCateto1(catetoA);
		setCateto2(catetoB);
		
		return (float)(Math.sqrt( (Math.pow(getCateto1(), 2)+ Math.pow(getCateto2(), 2))));
	}
	
	
	
	
}
