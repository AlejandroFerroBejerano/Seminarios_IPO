package Presentacion;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JFormattedTextField;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.text.MaskFormatter;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Seminario2 {

	private JFrame frame;
	private JPanel pnlFicha;
	private JLabel lblExpediente;
	private JTextField txtExpediente;
	private JButton btncargarFoto;
	private JLabel lblCheck;
	private JScrollPane scrollPane;
	private JLabel lblFoto;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblDNI;
	private JLabel lblTelefono;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JFormattedTextField ftxtDNI;
	private JFormattedTextField ftxtTelefono;
	private JButton btnGuardar;
	private JScrollPane scrollPane_1;
	private JTextArea taComentarios;
	private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
	private Border bordeVerde = BorderFactory.createLineBorder(Color.GREEN);
	private JButton btnCargarComentarios;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnEdicion;
	private JMenu mnAyuda;
	private JMenuItem mntmAbrir;
	private JMenuItem mntmCargarFoto;
	private JMenuItem mntmCargarComentarios;
	private JMenuItem mntmGuardar;
	private JSeparator separator;
	private JMenu mnTamaoFuente;
	private JRadioButtonMenuItem rdbtnmntmPequea;
	private JRadioButtonMenuItem rdbtnmntmNormal;
	private JRadioButtonMenuItem rdbtnmntmGrande;
	private JMenuItem mntmAyuda;
	private JMenuItem mntmAcercaDe;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JMenuItem mntmSalir;
	private JSeparator separator_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seminario2 window = new Seminario2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Seminario2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new FrameWindowListener());
		frame.setBounds(100, 100, 552, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			pnlFicha = new JPanel();
			pnlFicha.setBorder(new TitledBorder(null, "Ficha Alumno", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			frame.getContentPane().add(pnlFicha, BorderLayout.CENTER);
			GridBagLayout gbl_pnlFicha = new GridBagLayout();
			gbl_pnlFicha.columnWidths = new int[]{0, 0, 0, 113, 0, 0};
			gbl_pnlFicha.rowHeights = new int[]{0, 0, 42, 41, 40, 46, 0, 0, 0, 0};
			gbl_pnlFicha.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_pnlFicha.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
			pnlFicha.setLayout(gbl_pnlFicha);
			{
				lblExpediente = new JLabel("Núm. expediente:");
				GridBagConstraints gbc_lblExpediente = new GridBagConstraints();
				gbc_lblExpediente.insets = new Insets(0, 0, 5, 5);
				gbc_lblExpediente.anchor = GridBagConstraints.WEST;
				gbc_lblExpediente.gridx = 0;
				gbc_lblExpediente.gridy = 0;
				pnlFicha.add(lblExpediente, gbc_lblExpediente);
			}
			{
				txtExpediente = new JTextField();
				txtExpediente.addFocusListener(new MyFocusListener());
				txtExpediente.addKeyListener(new TxtExpedienteKeyListener());
				GridBagConstraints gbc_txtExpediente = new GridBagConstraints();
				gbc_txtExpediente.gridwidth = 2;
				gbc_txtExpediente.insets = new Insets(0, 0, 5, 5);
				gbc_txtExpediente.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtExpediente.gridx = 1;
				gbc_txtExpediente.gridy = 0;
				pnlFicha.add(txtExpediente, gbc_txtExpediente);
				txtExpediente.setColumns(10);
			}
			{
				btncargarFoto = new JButton("Cargar Foto ...");
				btncargarFoto.setIcon(new ImageIcon(Seminario2.class.getResource("/recursos/cargarFoto.png")));
				btncargarFoto.addActionListener(new BtncargarFotoActionListener());
				{
					lblCheck = new JLabel("");
					GridBagConstraints gbc_lblCheck = new GridBagConstraints();
					gbc_lblCheck.anchor = GridBagConstraints.WEST;
					gbc_lblCheck.insets = new Insets(0, 0, 5, 5);
					gbc_lblCheck.gridx = 3;
					gbc_lblCheck.gridy = 0;
					pnlFicha.add(lblCheck, gbc_lblCheck);
				}
				GridBagConstraints gbc_btncargarFoto = new GridBagConstraints();
				gbc_btncargarFoto.fill = GridBagConstraints.HORIZONTAL;
				gbc_btncargarFoto.gridwidth = 2;
				gbc_btncargarFoto.insets = new Insets(0, 0, 5, 5);
				gbc_btncargarFoto.gridx = 0;
				gbc_btncargarFoto.gridy = 1;
				pnlFicha.add(btncargarFoto, gbc_btncargarFoto);
			}
			{
				scrollPane = new JScrollPane();
				scrollPane.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				GridBagConstraints gbc_scrollPane = new GridBagConstraints();
				gbc_scrollPane.gridwidth = 2;
				gbc_scrollPane.gridheight = 4;
				gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane.fill = GridBagConstraints.BOTH;
				gbc_scrollPane.gridx = 0;
				gbc_scrollPane.gridy = 2;
				pnlFicha.add(scrollPane, gbc_scrollPane);
				{
					lblFoto = new JLabel("");
					lblFoto.setAlignmentX(Component.CENTER_ALIGNMENT);
					scrollPane.setViewportView(lblFoto);
				}
			}
			{
				lblNombre = new JLabel("Nombre:");
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.anchor = GridBagConstraints.WEST;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 2;
				gbc_lblNombre.gridy = 2;
				pnlFicha.add(lblNombre, gbc_lblNombre);
			}
			{
				txtNombre = new JTextField();
				txtNombre.addFocusListener(new MyFocusListener());
				GridBagConstraints gbc_txtNombre = new GridBagConstraints();
				gbc_txtNombre.gridwidth = 2;
				gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
				gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtNombre.gridx = 3;
				gbc_txtNombre.gridy = 2;
				pnlFicha.add(txtNombre, gbc_txtNombre);
				txtNombre.setColumns(10);
			}
			{
				lblApellidos = new JLabel("Apellidos:");
				GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
				gbc_lblApellidos.anchor = GridBagConstraints.WEST;
				gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
				gbc_lblApellidos.gridx = 2;
				gbc_lblApellidos.gridy = 3;
				pnlFicha.add(lblApellidos, gbc_lblApellidos);
			}
			{
				txtApellidos = new JTextField();
				txtApellidos.addFocusListener(new MyFocusListener());
				GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
				gbc_txtApellidos.gridwidth = 2;
				gbc_txtApellidos.insets = new Insets(0, 0, 5, 0);
				gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtApellidos.gridx = 3;
				gbc_txtApellidos.gridy = 3;
				pnlFicha.add(txtApellidos, gbc_txtApellidos);
				txtApellidos.setColumns(10);
			}
			{
				lblDNI = new JLabel("DNI:");
				GridBagConstraints gbc_lblDNI = new GridBagConstraints();
				gbc_lblDNI.anchor = GridBagConstraints.WEST;
				gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
				gbc_lblDNI.gridx = 2;
				gbc_lblDNI.gridy = 4;
				pnlFicha.add(lblDNI, gbc_lblDNI);
			}
			{
				//ftxtDNI = new JFormattedTextField();
				MaskFormatter formatoDNI;
				try {
				formatoDNI = new MaskFormatter("########'-U");
				formatoDNI.setPlaceholderCharacter('_');
				ftxtDNI = new JFormattedTextField(formatoDNI);
				} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				ftxtDNI.addFocusListener(new MyFocusListener());
				GridBagConstraints gbc_ftxtDNI = new GridBagConstraints();
				gbc_ftxtDNI.insets = new Insets(0, 0, 5, 5);
				gbc_ftxtDNI.fill = GridBagConstraints.HORIZONTAL;
				gbc_ftxtDNI.gridx = 3;
				gbc_ftxtDNI.gridy = 4;
				pnlFicha.add(ftxtDNI, gbc_ftxtDNI);
			}
			{
				lblTelefono = new JLabel("Teléfono:");
				GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
				gbc_lblTelefono.anchor = GridBagConstraints.WEST;
				gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelefono.gridx = 2;
				gbc_lblTelefono.gridy = 5;
				pnlFicha.add(lblTelefono, gbc_lblTelefono);
			}
			{
				//ftxtTelefono = new JFormattedTextField();
				MaskFormatter formatoTlfno;
				try {
				formatoTlfno = new MaskFormatter("'(###')' ###' ###' ###");
				formatoTlfno.setPlaceholderCharacter('*');
				ftxtTelefono = new JFormattedTextField(formatoTlfno);
				} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				ftxtTelefono.addFocusListener(new MyFocusListener());
				GridBagConstraints gbc_ftxtTelefono = new GridBagConstraints();
				gbc_ftxtTelefono.insets = new Insets(0, 0, 5, 5);
				gbc_ftxtTelefono.fill = GridBagConstraints.HORIZONTAL;
				gbc_ftxtTelefono.gridx = 3;
				gbc_ftxtTelefono.gridy = 5;
				pnlFicha.add(ftxtTelefono, gbc_ftxtTelefono);
			}
			{
				btnCargarComentarios = new JButton("Cargar Comentarios");
				btnCargarComentarios.addActionListener(new BtnCargarComentariosActionListener());
				btnCargarComentarios.setIcon(new ImageIcon(Seminario2.class.getResource("/Recursos/cargarComentarios.png")));
				GridBagConstraints gbc_btnCargarComentarios = new GridBagConstraints();
				gbc_btnCargarComentarios.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnCargarComentarios.gridwidth = 2;
				gbc_btnCargarComentarios.insets = new Insets(0, 0, 5, 5);
				gbc_btnCargarComentarios.gridx = 0;
				gbc_btnCargarComentarios.gridy = 6;
				pnlFicha.add(btnCargarComentarios, gbc_btnCargarComentarios);
			}
			{
				scrollPane_1 = new JScrollPane();
				GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
				gbc_scrollPane_1.gridwidth = 5;
				gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
				gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_1.gridx = 0;
				gbc_scrollPane_1.gridy = 7;
				pnlFicha.add(scrollPane_1, gbc_scrollPane_1);
				{
					taComentarios = new JTextArea();
					taComentarios.setLineWrap(true);
					taComentarios.setBorder(new TitledBorder(null, "Comentarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					scrollPane_1.setViewportView(taComentarios);
				}
			}
			{
				btnGuardar = new JButton("Guardar");
				btnGuardar.addActionListener(new BtnGuardarActionListener());
				btnGuardar.setIcon(new ImageIcon(Seminario2.class.getResource("/recursos/guardar.png")));
				GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
				gbc_btnGuardar.anchor = GridBagConstraints.EAST;
				gbc_btnGuardar.gridx = 4;
				gbc_btnGuardar.gridy = 8;
				pnlFicha.add(btnGuardar, gbc_btnGuardar);
			}
		}
		{
			menuBar = new JMenuBar();
			frame.setJMenuBar(menuBar);
			{
				mnArchivo = new JMenu("Archivo");
				mnArchivo.addActionListener(new MnArchivoActionListener());
				mnArchivo.setMnemonic('A');
				menuBar.add(mnArchivo);
				{
					mntmAbrir = new JMenuItem("Abrir");
					mntmAbrir.addActionListener(new MntmAbrirActionListener());
					mntmAbrir.setIcon(new ImageIcon(Seminario2.class.getResource("/Recursos/abrir.png")));
					mnArchivo.add(mntmAbrir);
				}
				{
					mntmCargarFoto = new JMenuItem("Cargar Foto");
					mntmCargarFoto.addActionListener(new BtncargarFotoActionListener());
					mntmCargarFoto.setIcon(new ImageIcon(Seminario2.class.getResource("/Recursos/cargarFoto.png")));
					mnArchivo.add(mntmCargarFoto);
				}
				{
					mntmCargarComentarios = new JMenuItem("Cargar Comentarios");
					mntmCargarComentarios.addActionListener(new BtnCargarComentariosActionListener());
					mntmCargarComentarios.setIcon(new ImageIcon(Seminario2.class.getResource("/Recursos/cargarComentarios.png")));
					mnArchivo.add(mntmCargarComentarios);
				}
				{
					separator = new JSeparator();
					mnArchivo.add(separator);
				}
				{
					mntmGuardar = new JMenuItem("Guardar");
					mntmGuardar.setIcon(new ImageIcon(Seminario2.class.getResource("/Recursos/guardar.png")));
					mnArchivo.add(mntmGuardar);
				}
				{
					separator_1 = new JSeparator();
					mnArchivo.add(separator_1);
				}
				{
					mntmSalir = new JMenuItem("Salir");
					mntmSalir.addActionListener(new MntmSalirActionListener());
					mntmSalir.setIcon(new ImageIcon(Seminario2.class.getResource("/Recursos/salir.png")));
					mnArchivo.add(mntmSalir);
				}
			}
			{
				mnEdicion = new JMenu("Edición");
				mnEdicion.setMnemonic('E');
				menuBar.add(mnEdicion);
				{
					mnTamaoFuente = new JMenu("Tamaño Fuente");
					mnEdicion.add(mnTamaoFuente);
					{
						rdbtnmntmPequea = new JRadioButtonMenuItem("Pequeña");
						rdbtnmntmPequea.addActionListener(new RdbtnmntmPequeaActionListener());
						buttonGroup.add(rdbtnmntmPequea);
						mnTamaoFuente.add(rdbtnmntmPequea);
					}
					{
						rdbtnmntmNormal = new JRadioButtonMenuItem("Normal");
						rdbtnmntmNormal.addActionListener(new RdbtnmntmNormalActionListener());
						buttonGroup.add(rdbtnmntmNormal);
						mnTamaoFuente.add(rdbtnmntmNormal);
					}
					{
						rdbtnmntmGrande = new JRadioButtonMenuItem("Grande");
						rdbtnmntmGrande.addActionListener(new RdbtnmntmGrandeActionListener());
						buttonGroup.add(rdbtnmntmGrande);
						mnTamaoFuente.add(rdbtnmntmGrande);
					}
				}
			}
			{
				mnAyuda = new JMenu("Ayuda");
				mnAyuda.setMnemonic('H');
				menuBar.add(mnAyuda);
				{
					mntmAyuda = new JMenuItem("Ayuda");
					mnAyuda.add(mntmAyuda);
				}
				{
					mntmAcercaDe = new JMenuItem("Acerca de...");
					mntmAcercaDe.addActionListener(new MntmAcercaDeActionListener());
					mnAyuda.add(mntmAcercaDe);
				}
			}
		}
	}

	private class BtncargarFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new ImageFilter());
			int valorDevuelto = fcAbrir.showOpenDialog(frame);
			//Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
			File file = fcAbrir.getSelectedFile();
			//En este punto la aplicación se debería encargar de realizar la operación sobre el fichero
			System.out.println("Fichero seleccionado: " +
			file.getName());
			lblFoto.setIcon(new ImageIcon(file.getAbsolutePath()));
			}
		}
	}
	private class TxtExpedienteKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent arg0) {
			if (String.valueOf(txtExpediente.getText()).equals("Exp345"))
			{
				txtExpediente.setBorder(bordeVerde);
				lblCheck.setIcon(new ImageIcon(Seminario2.class.getResource("/Recursos/tick.PNG")));
			} else
			{
				txtExpediente.setBorder(bordeRojo);
				lblCheck.setIcon(new ImageIcon(Seminario2.class.getResource("/Recursos/cross.PNG")));
			}
		}
		@Override
		public void keyPressed(KeyEvent e) {
		}
	}
	private class MyFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,170));
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,250));
		}
	}
	private class BtnCargarComentariosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {	
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new CommentFilter());
			int valorDevuelto = fcAbrir.showOpenDialog(frame);
			//Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
			File file = fcAbrir.getSelectedFile();
			System.out.println("Fichero seleccionado: " + file.getName());
			try{
			taComentarios.setText("");
			// Apertura del fichero y creacion de BufferedReader
			FileReader fr = new FileReader (file.getAbsolutePath());
			BufferedReader br = new BufferedReader(fr);
			// Lectura del fichero linea a linea
			String linea;
			while((linea=br.readLine())!=null)
			{
			System.out.println(linea);
			taComentarios.append(linea+"\n");
			}
			br.close();
			System.out.println("Fichero leído : " + file.getName() + ".");
			}
			catch (IOException ioe){
			System.out.println("Problemas mientras se leía el archivo");
			}
			}else
			System.out.println("El usuario ha cancelado el proceso de lectura.");
		}
	}
	private class RdbtnmntmPequeaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			taComentarios.setFont(new Font(taComentarios.getFont().getFontName(),taComentarios.getFont().getStyle(), 8));
		}
	}
	private class RdbtnmntmNormalActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			taComentarios.setFont(new Font(taComentarios.getFont().getFontName(),taComentarios.getFont().getStyle(), 12));
		}
	}
	private class RdbtnmntmGrandeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			taComentarios.setFont(new Font(taComentarios.getFont().getFontName(),taComentarios.getFont().getStyle(), 16));
		}
	}
	private class FrameWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent arg0) {
			JOptionPane.showMessageDialog(frame, "Gracias por utilizar nuestra aplicación", "Cerrar la aplicación", JOptionPane.PLAIN_MESSAGE);
		}
	}
	private class MnArchivoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser selecArchivo=new JFileChooser();
			selecArchivo.setFileFilter(new AlumnoFilter());
			int valorDevuelto = selecArchivo.showSaveDialog(frame);
			
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = selecArchivo.getSelectedFile();
				
				try{
					// Apertura del fichero y creacion de BufferedReader
					FileWriter fw = new FileWriter (file.getAbsolutePath());
					BufferedWriter bw = new BufferedWriter(fw);
					
					bw.write(txtExpediente.getText());
					bw.newLine();
					bw.write(txtNombre.getText());
					bw.newLine();
					bw.write(txtApellidos.getText());
					bw.newLine();
					bw.write(ftxtDNI.getText());
					bw.newLine();
					bw.write(ftxtTelefono.getText());
					bw.newLine();
					bw.write(taComentarios.getText());
					bw.newLine();
									
					bw.close();
					JOptionPane.showMessageDialog(frame, "Archivo guardado correctamente.", "Seminario 2", JOptionPane.PLAIN_MESSAGE);
				}
				catch (IOException ioe){
					JOptionPane.showMessageDialog(frame, "No se ha podido guardar el archivo.", "Seminario 2", JOptionPane.ERROR_MESSAGE);
				}
			}else
				System.out.println("Se ha cancelado la acci�n.");
			}

	}
	private class MntmAbrirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new AlumnoFilter());
			int lectura = fcAbrir.showOpenDialog(frame);
			
			//Recoger el nombre del fichero seleccionado por el usuario
			if (lectura== JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				System.out.println("Fichero seleccionado: " + file.getName());
				try{
					txtExpediente.setText("");
					txtNombre.setText("");
					txtApellidos.setText("");
					ftxtDNI.setText("");
					ftxtTelefono.setText("");
					taComentarios.setText("");
					// Apertura del fichero y creacion de BufferedReader
					FileReader fr = new FileReader (file.getAbsolutePath());
					BufferedReader br = new BufferedReader(fr);
					// Lectura del fichero linea a linea
					String linea;					
					txtExpediente.setText(br.readLine());
					txtNombre.setText(br.readLine());
					txtApellidos.setText(br.readLine());
					ftxtDNI.setText(br.readLine());
					ftxtTelefono.setText(br.readLine());
					
					while((linea=br.readLine())!=null)
					{
						System.out.println(linea);
						taComentarios.append(linea+"\n");
					}
					br.close();
					System.out.println("Fichero " + file.getName() + " leido con exito.");
				}
				catch (IOException ioe){
					JOptionPane.showMessageDialog(frame, "Se ha producido un error.", "Seminario 2", JOptionPane.ERROR_MESSAGE);
				}
			}else
				JOptionPane.showMessageDialog(frame, "No se ha cargado el archivo.", "Seminario 2", JOptionPane.WARNING_MESSAGE);
			}
		}
	private class MntmAcercaDeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frame, "Realizado por: Alejandro Julián Ferro Bejerano", "Seminario 2",JOptionPane.PLAIN_MESSAGE);
		}
	}
	private class MntmSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(frame, "Gracias por utilizar nuestra aplicación", "Cerrar la aplicación", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
	}

}
