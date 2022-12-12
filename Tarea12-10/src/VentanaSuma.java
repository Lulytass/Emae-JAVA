import javax.swing.*;
import java.awt.event.*;

	public class VentanaSuma extends JFrame implements ActionListener{
	    private JTextField textfield1;
	    private JLabel label1;
	    private JTextField textfield2;
	    private JLabel label2;
	    private JButton boton1;
	    private JLabel label4;
	    private JLabel label3;
	    private JTextField textfieldresult;
	    //constructor
	    public VentanaSuma() {
	        ventana();
	    }
	    
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource()==boton1) {
	            Integer num1=Integer.parseInt(textfield1.getText());
	            Integer num2=Integer.parseInt(textfield2.getText());
	            Integer result=num1+num2;
	            textfieldresult.setText(Integer.toString(result));
	        }
	    }
	    
	   public void ventana() {
		   JFrame f = new JFrame("Sumador");// instanciamos el Jframe y le ponemos titulo a la ventana
			f.setSize(350, 300);
			f.setLayout(null);
			f.setVisible(true);
		   setLayout(null);
		  
		   //TITULO
		   
	        label4= new JLabel("Ingrese dos numeros para sumar");
	        label4.setBounds(60,0,200,40);
	        f.add(label4);
	        //label y field de numeros a ingresar
	        label1=new JLabel("Primer Nro:");
	        label1.setBounds(10,40,100,30);
	        f.add(label1);
	        
	        textfield1=new JTextField();
	        textfield1.setBounds(120,45,100,20);
	        f.add(textfield1);
	        
	        label2=new JLabel("Segundo Nro:");
	        label2.setBounds(10,100,100,30);
	        f.add(label2);
	        
	        textfield2=new JTextField();
	        textfield2.setBounds(120,105,100,20);
	        f.add(textfield2);
	        //label y field de resultado
	        label3=new JLabel("RESULTADO:");
	        label3.setBounds(10,160,100,30);
	        f.add(label3);
	        textfieldresult=new JTextField();
	        textfieldresult.setBounds(120,165,100,20);
	        f.add(textfieldresult);
	        //BOTON
	        boton1=new JButton("Sumar");
	        boton1.setBounds(120,200,100,30);
	        f.add(boton1);
	        boton1.addActionListener(this);	   
	   }
}
