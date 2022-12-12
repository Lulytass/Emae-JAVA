import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana  extends JFrame implements ActionListener{
	private JButton boton;
	private JButton boton1;
	private JLabel label;
	JFrame f=new JFrame();
	public Ventana() {
		armadoVentana();
		
	}
	public void armadoVentana() {
		component();
		f.setLayout(null);
        f.setSize(400,500);   
        f.setVisible(true);
        f.setTitle("Cuenta Regresiva");
        f.add(boton);
        f.add(boton1);
        f.add(label);
        boton.addActionListener(this);
        boton1.addActionListener(this);
	}
	
	public void component() {
		boton = new JButton("Iniciar");
        boton.setBounds(140,80,100,30);
        boton.setSize(100,50);
		boton1 = new JButton("Nuevo");
        boton1.setBounds(140,200,100,30);
        boton1.setSize(100,50);
        label = new JLabel("60");
        label.setBounds(190,10,50,10);
       
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == boton) {
			for(int i=60;i>=0;i--) {
				String iString = Integer.toString(i);
				label.setText(iString);
			}
		}
		if (e.getSource() == boton1) {
				label.setText("60");
			}
		}
	}
	

