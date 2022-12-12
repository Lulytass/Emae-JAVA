import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaPreguntas extends JFrame implements ActionListener {
	private JButton boton;
	private JButton boton1;
	private JButton boton2;
	private JLabel label;
	private JLabel labelVidas;
	String[] respuestas = { "1969", "476 d.C.", "116 años", "1945", "Santa María", "Manila", "Pablo Picasso",
			"Camilo José Cela", "Ron Weasley", "Dulcinea" };
	String[] respuestasMalas1 = { "1971", "477 d.C.", "120 años", "1950", "Pinta", "Borácay", "Paul Gaugin",
			"Leopoldo Marechal", "Rubeus Hagrid", "Carlota" };
	String[] respuestasMalas2 = { "1960", "470 d.C.", "106 años", "1947", "Niña", "Cebú", "Claude Monet",
			"Alexander Abrámov", "Luna Lovegood", "Aldonza" };
	String[] preguntas = { "¿En qué año el hombre pisó la Luna por primera vez?",
			"En que año termina la Edad Antigua y empieza la Edad Media", "¿Cuánto duró la Guerra de los Cien Años?",
			" ¿En qué año se creó la Organización de las Naciones Unidas?",
			"¿Qué carabela no volvió del viaje en el que Colón arribó a América por primera vez?",
			"¿Cuál es la capital de Filipinas?", "¿Quién pintó el Guernica?", "¿Quién escribió “La colmena”?",
			"¿Qué personaje del universo literario de Harry Potter tiene una rata llamada Scabbers?",
			"¿De qué personaje ficticio estaba enamorado el Quijote?" };
	String[] corazones = { "", "❤️", "❤️❤️", "❤️❤️❤️" };
	String respuestaElegida = "", msj = "";
	int vidas = 3, i = 0, j = 0, acertadas = 0;

	JFrame f = new JFrame();

	public VentanaPreguntas() {
		armadoDeVentana();
	}

	public void componentes() {
		boton = new JButton();
		boton.setBounds(140, 80, 100, 30);
		boton.setSize(400, 50);
		boton1 = new JButton();
		boton1.setBounds(140, 160, 100, 30);
		boton1.setSize(400, 50);
		boton2 = new JButton();
		boton2.setBounds(140, 240, 100, 30);
		boton2.setSize(400, 50);
		label = new JLabel();
		label.setBounds(150, 20, 100, 30);
		label.setSize(600, 50);
		labelVidas = new JLabel("❤️❤️❤️");
		labelVidas.setBounds(20, 5, 100, 30);
		labelVidas.setSize(600, 50);
	}

	public void armadoDeVentana() {
		componentes();
		preguntasYRespuestas();
		f.setLayout(null);
		f.setSize(750, 500);
		f.setVisible(true);
		f.setTitle("Ventana Preguntas");
		f.add(boton);
		f.add(boton1);
		f.add(boton2);
		f.add(label);
		f.add(labelVidas);
		boton.addActionListener(this);
		boton1.addActionListener(this);
		boton2.addActionListener(this);
	}
	
	public void preguntasYRespuestas() {
		label.setText(preguntas[0]);
		boton.setText(respuestas[0]);
		boton1.setText(respuestasMalas1[0]);
		boton2.setText(respuestasMalas2[0]);
	}
	//Al detectar el evento capturamos la respuesta a evaluar y cambiamos los textos
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == boton) {
			respuestaElegida = boton.getText();
			i++;
			if (i < 10 && vidas > 0) {				
				label.setText(preguntas[i]);
				boton.setText(respuestas[i]);
				boton1.setText(respuestasMalas1[i]);
				boton2.setText(respuestasMalas2[i]);
			}
		}
		if (e.getSource() == boton1) {
			respuestaElegida = boton1.getText();
			i++;
			if (i < 10 && vidas > 0) {				
				label.setText(preguntas[i]);
				boton.setText(respuestasMalas1[i]);
				boton1.setText(respuestas[i]);
				boton2.setText(respuestasMalas2[i]);
			}
		}
		if (e.getSource() == boton2) {
			respuestaElegida = boton2.getText();
			i++;
			if(i < 10 && vidas > 0) {				
				label.setText(preguntas[i]);
				boton.setText(respuestasMalas1[i]);
				boton1.setText(respuestasMalas2[i]);
				boton2.setText(respuestas[i]);
			}	
		}
		//vemos si la respuesta es correcta para modificar las vidas o no
		if (respuestaElegida == respuestas[j] && vidas > 0) {
			acertadas++;
			j++;
		} else {
			vidas--;
			j++;
			labelVidas.setText(corazones[vidas]);
		}
		if (i == 10 || vidas == 0) {
			if (acertadas > 7) {
				msj = "Gano el juego!!";
			} else if (acertadas > 5) {
				msj = "Volve a intentarlo!";
			} else {
				msj = "Perdió el juego";
			}
			JOptionPane.showMessageDialog(null, msj);
		}
	}

}
