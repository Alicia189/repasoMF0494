package repaso1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaGimnasio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDNI;
	private JTextField txtTelefono;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox comboBox;
	private JLabel lblPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGimnasio frame = new VentanaGimnasio();
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
	public VentanaGimnasio() {
		setTitle("Gimnasio Heroes!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][][grow]", "[][][][][][grow][]"));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		contentPane.add(lblNewLabel, "cell 1 0,alignx trailing");
		
		txtNombre = new JTextField();
		contentPane.add(txtNombre, "cell 2 0,growx");
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos:");
		contentPane.add(lblNewLabel_1, "cell 3 0,alignx trailing");
		
		txtApellidos = new JTextField();
		contentPane.add(txtApellidos, "cell 4 0,growx");
		txtApellidos.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DNI:");
		contentPane.add(lblNewLabel_2, "cell 1 1,alignx trailing");
		
		txtDNI = new JTextField();
		contentPane.add(txtDNI, "cell 2 1,growx");
		txtDNI.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tel\u00E9fono:");
		contentPane.add(lblNewLabel_3, "cell 3 1,alignx trailing");
		
		txtTelefono = new JTextField();
		contentPane.add(txtTelefono, "cell 4 1,growx");
		txtTelefono.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo abono:");
		contentPane.add(lblNewLabel_4, "cell 1 2,alignx trailing");
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				calculaPrecio();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Gym Basic!", "Gym Family Plus!", "Gym Extreme Hero!"}));
		contentPane.add(comboBox, "cell 2 2 3 1,growx");
		
		JLabel lblNewLabel_5 = new JLabel("Descuento:");
		contentPane.add(lblNewLabel_5, "cell 1 3");
		
		JRadioButton rdbSin = new JRadioButton("Sin descuento");
		rdbSin.setSelected(true);
		buttonGroup.add(rdbSin);
		contentPane.add(rdbSin, "cell 2 3");
		
		JRadioButton rdbFamiliar = new JRadioButton("Familiar");
		buttonGroup.add(rdbFamiliar);
		contentPane.add(rdbFamiliar, "cell 3 3");
		
		JRadioButton rdbJoven = new JRadioButton("Joven");
		buttonGroup.add(rdbJoven);
		contentPane.add(rdbJoven, "cell 4 3");
		
		JLabel lblNewLabel_6 = new JLabel("Precio:");
		contentPane.add(lblNewLabel_6, "cell 1 4");
		
		lblPrecio = new JLabel("30");
		contentPane.add(lblPrecio, "cell 2 4");
		
		JLabel lblNewLabel_8 = new JLabel("\u20AC");
		contentPane.add(lblNewLabel_8, "cell 3 4");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 5 5 1,grow");
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				muestraResultado();
			}
		});
		contentPane.add(btnNewButton, "cell 0 6 5 1,alignx center,aligny center");
	}

	protected void muestraResultado() {
		
	}

	protected void calculaPrecio() {
		String seleccionado = (String) comboBox.getSelectedItem();
		if (seleccionado.equals("Gym Basic!")) {
			lblPrecio.setText("30");
		} else if (seleccionado.equals("Gym Family Plus!")) {
			lblPrecio.setText("35");
		} else {
			lblPrecio.setText("45");
		}
	}

}
