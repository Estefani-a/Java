package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Almacen;
import logica.Producto;

import java.awt.List;
import java.awt.TextField;
import java.awt.Canvas;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AlmacenInterfaz extends JFrame {

	private JPanel contentPane;
	private Almacen miAlmacen;
	private List lista;
	private TextField textoNombre;
	private TextField textoPrecio;
	private Canvas cuadroImg;
	private Button btAgregar;
	private JCheckBox checkEditar;
	private Button btQuitar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlmacenInterfaz frame = new AlmacenInterfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AlmacenInterfaz() {
		
		miAlmacen = new Almacen();
		contentPane = new JPanel();
		textoNombre = new TextField(); 
		lista = new List();
		lista.addMouseListener(new MouseAdapter() {
		@Override
			public void mouseClicked(MouseEvent e) {
			mostrarDatos();
			}
		});
		textoPrecio = new TextField();
		cuadroImg = new Canvas();
		btAgregar = new Button("Agregar");
		checkEditar = new JCheckBox("Modo edicion");//Tiene un Boolean interno
		btQuitar = new Button("Quitar");
		
		setTitle("Almacen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 530);
		contentPane.setBackground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//setBounds tamaño del texto(largo y ancho) y pos en la ventana
		lista.setBounds(34, 48, 139, 358);
		textoNombre.setBounds(194, 62, 167, 22);
		textoPrecio.setBounds(200, 106, 106, 22);
		cuadroImg.setBounds(381, 50, 187, 247);
		btAgregar.setBounds(498, 384, 70, 22);
		btQuitar.setBounds(200, 384, 70, 22);
		checkEditar.setBounds(38, 461, 97, 23);
		cuadroImg.setBackground(new Color(51, 0, 255));
		
		//Añade elemento lista al lienzo o ventana
		contentPane.add(lista);
		contentPane.add(textoNombre);
		contentPane.add(textoPrecio);
		contentPane.add(cuadroImg);
		contentPane.add(btAgregar);
		contentPane.add(btQuitar);
		contentPane.add(checkEditar);
		
		//Todo lo que este dentro se ejecuta al utilizar el boton agregar en este caso
		btAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			agregarProducto();
			}
		});
		
		btQuitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quitarProducto();
			}
		});
		
	}
	private void agregarProducto() {
		if (podemosAgregarProducto()) {
			miAlmacen.insertarProducto(new Producto(textoNombre.getText(), Integer.parseInt(textoPrecio.getText())));
			actualizarLista();
			vaciarCampos();
		}
	}
	
	private boolean podemosAgregarProducto() {
		boolean exitoso = false;
		if (!textoNombre.getText().isEmpty()) {
			if (!textoPrecio.getText().isEmpty()) {
				if (esNumerico(textoPrecio.getText())) {
					if (estaEnModoEdit()) {
						exitoso = true;
					}
				}
			}
		}
		return exitoso;
	}
	
	private void actualizarLista() {
		lista.clear();
		for (int i = 0; i < miAlmacen.cantidadProductos(); i++) {
			lista.add(miAlmacen.obtenerProducto(i).toString());
			
		}

	}
	
	private boolean esNumerico(String texto) {//Try (intentar) y catch (capturar)
		try { //Intenta convertir a entero, si lo logra retorna true, si no va al catch
			Integer.parseInt(texto);
			return true;
			
		}catch(NumberFormatException nfe) { //Error de excepcion,
			return false;
		}
		
		
	}
	
	private boolean estaEnModoEdit() {
		if (checkEditar.isSelected()) {
			return true;
		}else {
			return false;
		}
			
	}
	
	private void vaciarCampos() {
		textoNombre.setText("");
		textoPrecio.setText("");
	}
	
	private void quitarProducto() {
		if (estaEnModoEdit()) {	
			if(lista.getSelectedIndex() > -1) {
				miAlmacen.eliminarProducto(lista.getSelectedIndex());
			    actualizarLista();
			}
		}
	}
	
	private void mostrarDatos() {
		if (!estaEnModoEdit()) {
			if(lista.getSelectedIndex() > -1) {
				textoNombre.setText(miAlmacen.consultarNombre(lista.getSelectedIndex()));
				textoPrecio.setText("" + miAlmacen.consultarPrecio(lista.getSelectedIndex()));
			}
		}
	
		
	}
	
	
	
}
