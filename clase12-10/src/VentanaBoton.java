import javax.swing.*;

public class VentanaBoton {
	public VentanaBoton() {
		ventana();
	}

	JFrame f;

	public void ventana() {
		f = new JFrame();

		JButton b = new JButton("clock");
		b.setBounds(130, 100, 100, 40);

		f.add(b);// adding button in JFrame

		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
