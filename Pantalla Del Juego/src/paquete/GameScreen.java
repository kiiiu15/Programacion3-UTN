package paquete;

import java.awt.Color;
import java.util.HashMap;
import javax.swing.*;


public class GameScreen  extends JFrame {
	private HashMap<String , JPanel> screenSeccion;

	private HashMap<String, JPanel> getScreenSeccion() {
		return screenSeccion;
	}

	private void setScreenSeccion(HashMap<String, JPanel> screenSeccion) {
		this.screenSeccion = screenSeccion;
	}
	
	public GameScreen() {
		super();
		setScreenSeccion(new HashMap<String, JPanel>());
		this.setSize(getMaximumSize());
		this.setVisible(true);
		this.setLayout(null);
		generateScreenSeccions(3);
		addPanelsToScreen();
		
	}
	
	
	private void generateScreenSeccions( int quantityOfPanelsToGenerate) {
		for (int i = 0; i < quantityOfPanelsToGenerate; i++) {
			JPanel newPanel=new JPanel();
			newPanel.setVisible(true);
			if (i%2==0) {
				newPanel.setBackground(Color.red);
				}else {
					newPanel.setBackground(Color.blue);
				}
			getScreenSeccion().put("Seccion"+i, newPanel);
		}
	}
	
	private void addPanelsToScreen () {
		for (int i = 0; i < getScreenSeccion().size(); i++) {
			if (getScreenSeccion().containsKey("Seccion"+i)) {
				System.out.println("AAA");
				JPanel panelToAdd=getScreenSeccion().get("Seccion"+i);
				panelToAdd.setBounds(this.getWidth()/getScreenSeccion().size()*(i), 0, this.getWidth()/getScreenSeccion().size(), this.getHeight());
				this.add(panelToAdd);
			}
		}
	}
	
}
