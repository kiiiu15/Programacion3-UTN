package paquete;
import javax.swing.*;
import java.util.ArrayList;

import org.w3c.dom.events.EventListener;

import java.awt.Color;
import java.awt.Event;


public class PantallaDeJuego extends JFrame /*implements EventListener*/{
	
	private ArrayList<JPanel> secciones= new ArrayList<JPanel>();
	private int cantidadDeSecciones;
	
	private ArrayList<JPanel> getSecciones() {
		return secciones;
	}

	private void setSecciones(ArrayList<JPanel> secciones) {
		this.secciones = secciones;
	}
	

	public PantallaDeJuego () {
		super();
		cantidadDeSecciones=3;
        this.setTitle("Cap vs Thanos");                   
        this.setExtendedState(MAXIMIZED_BOTH);                     
        this.setLocationRelativeTo(null);                       
        this.setLayout(null);                                  
        this.setResizable(true);
        this.setVisible(true);
        
        armarSectores();

        agregarSectores(this.getHeight(),this.getWidth());
        
	}
	
	public void armarSectores () {
		for (int i = 0; i < cantidadDeSecciones; i++) {
			JPanel seccionParaAgregar = new JPanel();
			if (i%2==0) {
				
				seccionParaAgregar.setBackground(Color.RED);
			}else {
				seccionParaAgregar.setBackground(Color.BLUE);
			}
			seccionParaAgregar.setOpaque(true);
			seccionParaAgregar.setLayout(null);
			seccionParaAgregar.setVisible(true);
			
			getSecciones().add(seccionParaAgregar);
			
			
			}
		
		}
	
	public void agregarSectores (int alto, int ancho) {
		for (int i = 0; i < getSecciones().size(); i++) {
			JPanel seccion=getSecciones().get(i);
			int desplazamientoDerecha=0;
			try {
				desplazamientoDerecha=getSecciones().get(i-1).getX()+getSecciones().get(i-1).getWidth();
			} catch (Exception e){
				desplazamientoDerecha=0;
			}
			seccion.setBounds(desplazamientoDerecha, 0, alto, ancho);
			this.add(seccion);
			}
	}
	
	public void agregarImagenes() {
		String link="C:/Users/PC/Desktop/Imagen para el Juego/CapitanAmerica.PNG";
		Imagen imagen=new Imagen();
		getSecciones().get(0).add(imagen);
	}
	
	
}

