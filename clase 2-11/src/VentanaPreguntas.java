import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaPreguntas extends JFrame implements ActionListener{
	private JButton boton;
	private JButton boton1;
	private JButton boton2;
	private JLabel label;
	String resp;
	JFrame f=new JFrame();
	
	public VentanaPreguntas() {
		armadoDeVentana();
	}
	public void componentes() {
		boton = new JButton("18");
        boton.setBounds(140,80,100,30);
        boton.setSize(100,50);
		boton1 = new JButton("28");
        boton1.setBounds(140,160,100,30);
        boton1.setSize(100,50);
		boton2 = new JButton("16");
        boton2.setBounds(140,240,100,30);
        boton2.setSize(100,50);
        label = new JLabel("Cuanto es 3 X 6");
        label.setBounds(150,20,100,30);
	}
	public void armadoDeVentana() {
		componentes();
		f.setLayout(null);
        f.setSize(400,500);   
        f.setVisible(true);
        f.setTitle("Ventana Preguntas");
        f.add(boton);
        f.add(boton1);
        f.add(boton2);
        f.add(label);
        boton.addActionListener(this);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == boton) {
			resp = "Muy Bien!!!";
		}
		if (e.getSource() == boton1) {
			resp = "Segui ententando";
		}
		if (e.getSource() == boton2) {
			resp = "Segui ententando";
		}
		JOptionPane.showMessageDialog(null,resp);
	}
}
