import javax.swing.*;
	import java.awt.event.*;

public class Ventana1 extends JFrame implements ActionListener{
	private JButton botonV1;
	private JTextField textfield1;
	private JTextField textfield2;
    private JLabel label1;
    private JLabel label2;
    
	public Ventana1() {
		ventanaArmado();
	}
	JFrame f=new JFrame();
	public void ventanaArmado() {
		component();
		f.setLayout(null);
        f.setSize(400,500);   
        f.setVisible(true);
        f.setTitle("primera");
        f.add(botonV1);
        f.add(label1);
        f.add(label2);
        f.add(textfield1);
        f.add(textfield2);
        botonV1.addActionListener(this);
        
	}
	
	public void component() {
		botonV1 = new JButton("Sumar");
        botonV1.setBounds(125,80,100,30);
        botonV1.setSize(150,80);
        label1=new JLabel("Primer numero");
        label1.setBounds(10,10,100,30);
        textfield1=new JTextField();
        textfield1.setBounds(120,10,150,20);
        label2=new JLabel("Segundo numero");
        label2.setBounds(10,50,100,30);
        textfield2=new JTextField();
        textfield2.setBounds(120,50,150,20);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == botonV1) {
			String cad=textfield1.getText();
			String cad2=textfield2.getText();
			int num1 = Integer. parseInt(cad);
			int num2 = Integer. parseInt(cad2);
			int suma = num1+num2;
			JOptionPane.showMessageDialog(null,"La suma da: "+suma);
		}
	}
}
