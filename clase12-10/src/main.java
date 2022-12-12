import javax.swing.*;

public class main {

	
	public static void main(String args[]) {
		// VENTANA 1
		
		JFrame frame = new JFrame("Mi primera GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		JButton Botón = new JButton("Presionar");
		frame.getContentPane().add(Botón); // Agrega el botón al panel de contenido del marco
		frame.setVisible(true);
		// VENTANA 2
		
		JFrame f = new JFrame();// creating instance of JFrame
		JButton b = new JButton("click");
		b.setBounds(130, 100, 100, 40);
		f.add(b);// adding button in JFrame
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
		// VENTANA 3
		
		new VentanaBoton();
		// VENTANA 4
		
		Formulario formulario1=new Formulario();
        formulario1.setBounds(0,0,350,170);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
