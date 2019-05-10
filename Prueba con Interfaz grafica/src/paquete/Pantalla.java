package paquete;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.Event.*;
import java.awt.Toolkit;
import java.util.EventListener;
import java.util.ArrayList;

public class Pantalla extends JFrame implements EventListener{
	private ArrayList<JButton> botonesDelFormulario;
	private ArrayList<JTextField> lineasDeTextoDelFormulario;//cambiar nombre por favor! o no.......
	private ArrayList<JTextArea> cuadrosDeTextosDelFormulario;
	private ArrayList<JLabel> checksDelFormulario;
	private ArrayList<JCheckBox>  checkBoxsDelFormulario;
	
	
	
	//setters & getters 
	private ArrayList<JButton> getBotonesDelFormulario() {
		return botonesDelFormulario;
	}
	private void setBotonesDelFormulario(ArrayList<JButton> botonesDelFormulario) {
		this.botonesDelFormulario = botonesDelFormulario;
	}
	private ArrayList<JTextField> getLineasDeTextoDelFormulario() {
		return lineasDeTextoDelFormulario;
	}
	private void setLineasDeTextoDelFormulario(ArrayList<JTextField> lineasDeTextoDelFormulario) {
		this.lineasDeTextoDelFormulario = lineasDeTextoDelFormulario;
	}
	private ArrayList<JTextArea> getCuadrosDeTextosDelFormulario() {
		return cuadrosDeTextosDelFormulario;
	}
	private void setCuadrosDeTextosDelFormulario(ArrayList<JTextArea> cuadrosDeTextosDelFormulario) {
		this.cuadrosDeTextosDelFormulario = cuadrosDeTextosDelFormulario;
	}
	private ArrayList<JLabel> getChecksDelFormulario() {
		return checksDelFormulario;
	}
	private void setChecksDelFormulario(ArrayList<JLabel> checksDelFormulario) {
		this.checksDelFormulario = checksDelFormulario;
	}
	private ArrayList<JCheckBox> getCheckBoxsDelFormulario() {
		return checkBoxsDelFormulario;
	}
	private void setCheckBoxsDelFormulario(ArrayList<JCheckBox> checkBoxsDelFormulario) {
		this.checkBoxsDelFormulario = checkBoxsDelFormulario;
	}
	
	//constructor
	
	
	public Pantalla () {
		setBotonesDelFormulario(new ArrayList<JButton>(0));
		setLineasDeTextoDelFormulario(new ArrayList <JTextField>(0));
		setCuadrosDeTextosDelFormulario(new ArrayList <JTextArea>(0));
		setChecksDelFormulario(new ArrayList<JLabel>(0));
		setCheckBoxsDelFormulario(new ArrayList<JCheckBox>(0));
		asignarCaracteristicasALaPantalla();
	}

	
	public Pantalla (int cantidadDeBotones, int cantidadDeLineasDeTexto, int cantidadDeCuadrosDeTexto, int cantidadDeChecks, int cantidadDeCheckBox) {
		setBotonesDelFormulario(new ArrayList<JButton>(0));
		setLineasDeTextoDelFormulario(new ArrayList <JTextField>(0));
		setCuadrosDeTextosDelFormulario(new ArrayList <JTextArea>(0));
		setChecksDelFormulario(new ArrayList<JLabel>(0));
		setCheckBoxsDelFormulario(new ArrayList<JCheckBox>(0));
		asignarCaracteristicasALaPantalla();
		//vale la pena crear posiciones vaciaqs en un  arrylist; tal vez comviene hace un for de new Jbotton
	}
	
	
	
	
	public void asignarCaracteristicasDeLosElementos (JFrame elemento) {
		elemento.setLayout(null);// quiero saber que recorcholis es esto.... TODO ESTO...	
		elemento.setBounds(10, 20, 10, 20);
	}
	
	public void asignarCaracteristicasALaPantalla () {	
		this.setLayout(null);// quiero saber que recorcholis es esto.... TODO ESTO...	
		this.setBounds(300,400 ,300 ,400 );
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	
	public void asignarCaracteristicasALaPantallaCompleta () {	
	this.setLayout(null);// quiero saber que recorcholis es esto.... TODO ESTO...	
	String anchoAltpoPantalla=obtenerAnchoAltoDeLaPantalla();
	String datosParaLaPantalla[]=anchoAltpoPantalla.split("-");
	this.setBounds(Integer.parseInt(datosParaLaPantalla[0]), Integer.parseInt(datosParaLaPantalla[0]), Integer.parseInt(datosParaLaPantalla[0]), Integer.parseInt(datosParaLaPantalla[0]));
	this.setVisible(true);
	this.setLocationRelativeTo(null);
	}
	
	
	public void asignarCaracteristicasALaPantalla (int alto, int ancho) {	
		this.setLayout(null);// quiero saber que recorcholis es esto.... TODO ESTO...	
		setBounds(ancho, alto, ancho, alto);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	
	
	private String obtenerAnchoAltoDeLaPantalla(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		return screenSize.width+"-"+screenSize.height;
	}

}
