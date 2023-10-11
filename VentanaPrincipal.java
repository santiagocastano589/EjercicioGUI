import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame implements ActionListener{
	Procesos misProcesos=new Procesos();
	JPanel miPanel;
	JLabel miTitulo, miNombre, miEstrato, miSalario, miResultado;
	JButton miBoton , miBotonLimpiar;
	JTextField miCampoNombre, miCampoEstrato, miCampoSalario;
	
	public VentanaPrincipal() {
		iniciarComponentes();
		setTitle("ventana principal");
		setSize(600, 400);
		setLocationRelativeTo(null);
	}
	private void iniciarComponentes() {
		miPanel=new JPanel();
		miPanel.setLayout(null);
		miPanel.setBackground(Color.white);
		
		miTitulo=new JLabel();
		miTitulo.setText("DESCUENTO NOMINA EMPRESA");
		miTitulo.setBounds(200, 10, 300, 30);
		
		miNombre=new JLabel();
		miNombre.setText("Nombre");
		miNombre.setBounds(50, 50, 150, 30);
		
		miCampoNombre = new JTextField();
		miCampoNombre.setBounds(100, 50, 150, 30);
		
		miEstrato=new JLabel();
		miEstrato.setText("Estrato Social");
		miEstrato.setBounds(300, 50, 150, 30);
		
		miCampoEstrato = new JTextField();
		miCampoEstrato.setBounds(420, 50, 150, 30);
		
		
		miSalario=new JLabel();
		miSalario.setText("salario");
		miSalario.setBounds(200, 100, 70, 30);
		
		miCampoSalario = new JTextField();
		miCampoSalario.setBounds(260, 100, 170, 30);
		
		
		miResultado=new JLabel();
		miResultado.setText("Resultado: ");
		miResultado.setBounds(20, 150, 500, 50);
		
		
		
		
		miBoton=new JButton();
		miBoton.setText("Calcular");
		miBoton.setBounds(70, 200, 150, 30);
		miBoton.addActionListener(this);
		
		
		miBotonLimpiar=new JButton();
		miBotonLimpiar.setText("Limpiar");
		miBotonLimpiar.setBounds(300, 200, 150, 30);
		miBotonLimpiar.addActionListener(this);
		
		
		miPanel.add(miTitulo);
		
		miPanel.add(miNombre);
		miPanel.add(miCampoNombre);
		
		miPanel.add(miEstrato);
		miPanel.add(miCampoEstrato);

		miPanel.add(miSalario);
		miPanel.add(miCampoSalario);

		miPanel.add(miResultado);
		miPanel.add(miBoton);
		miPanel.add(miBotonLimpiar);
		
		
		add(miPanel);
	}
	
	
	public void iniciar() {

		int estrato=Integer.parseInt(miCampoEstrato.getText());
		double salario=Double.parseDouble(miCampoSalario.getText());
		double resultado=misProcesos.calcularDescuento(salario, estrato);
		miResultado.setText("Resultado: "+"Hola "+miCampoNombre.getText()+" su descuento es de: "+resultado);

	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==miBoton) {
			iniciar();
		}else if (e.getSource()==miBotonLimpiar) {
			miCampoNombre.setText(null);
			miCampoEstrato.setText(null);
			miCampoSalario.setText(null);
		}	
	}

}