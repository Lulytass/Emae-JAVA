import javax.swing.*;
import java.awt.event.*;

public class VentanaTitulos extends JFrame implements ActionListener {
	private JLabel label1;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton btnCerrar;
	//CONSTRUCTOR
	public VentanaTitulos() {
		ventana();
	}

	public void ventana() {		//JFrame f = new JFrame();// instanciamos el Jframe y le ponemos titulo a la ventana
		setSize(400, 400);
		setLayout(null);
		setVisible(true);

		//TITULO DE LA VENTA
		label1 = new JLabel("Elegi el titulo para la ventana");
		label1.setBounds(100, 10, 350, 30);
		add(label1);
		//BOTONES PARA CAMBIAR TITULO
		boton1 = new JButton("Titulo 1");
		boton1.setBounds(100, 100, 150, 30);
		add(boton1);
		boton1.addActionListener(this);
		boton2 = new JButton("Titulo 2");
		boton2.setBounds(100, 150, 150, 30);
		add(boton2);
		boton2.addActionListener(this);
		boton3 = new JButton("Titulo 3");
		boton3.setBounds(100,200, 150, 30);
		add(boton3);
		boton3.addActionListener(this);
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(125,250, 100, 30);
		add(btnCerrar);
		btnCerrar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			String cad1 = boton1.getText();
			setTitle(cad1);
		}
		if(e.getSource() == boton2) {
			String cad2 = boton2.getText();
			setTitle(cad2);
		}
		if(e.getSource() == boton3){
			String cad3 = boton3.getText();
			setTitle(cad3);
		}
		if(e.getSource() == btnCerrar){
			System.exit(0);
		}
	}
}
