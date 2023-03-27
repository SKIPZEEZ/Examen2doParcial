


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.text.Collator;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	public Ventana() {
		// TODO Auto-generated constructor stub
		this.setVisible(true);
		this.setSize(500,700);
		this.setLayout(null);
		this.setTitle("Demo Menu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(100,100);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.decode("#188343"));
		
		JMenuBar jmb = new JMenuBar();
		jmb.setVisible(true);
		jmb.setSize(this.getWidth(), 20);
		//this.add(jmb);
		this.setJMenuBar(jmb);
		//correccion de jmenu
		JMenu jm1 = new JMenu("Cuenta");
		JMenu jm2 = new JMenu("Menu");
		JMenu jm3 = new JMenu("Ayuda");
		
		
		//añadiendo items
		
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		
		JMenuItem jmi1 = new JMenuItem("Mi Cuenta");
		JMenuItem jmi2 = new JMenuItem("Cerrar Sesion");
		
		jm1.add(jmi1);
		jm1.add(jmi2);
		
		JMenuItem jmi11 = new JMenuItem("Lista Usuario");
		JMenuItem jmi21 = new JMenuItem("Crear Usuario");
		
		jm2.add(jmi11);
		jm2.add(jmi21);
		
		JMenuItem jmi111 = new JMenuItem("Como Crear Cuenta");
		JMenuItem jmi211 = new JMenuItem("Bloquear Cuenta");
		
		jm3.add(jmi111);
		jm3.add(jmi211);
		
		//Paneles
		
		
		JPanel login = new JPanel();
		login.setVisible(true);
		login.setSize(500,700);
		login.setBackground(Color.decode("#188343"));
		login.setLayout(null);
		
		JLabel lb1 = new JLabel("Acceder a tu cuenta");
		lb1.setBackground(Color.white);
		lb1.setSize(400, 50);
		lb1.setLocation(160, 20);
		login.add(lb1);
		
		JLabel nomusuario = new JLabel("Ingrese su Correo");
		nomusuario.setBackground(Color.white);
		nomusuario.setSize(200, 40);
		nomusuario.setLocation(160, 50);
		login.add(nomusuario);
		
		JTextField usuario =  new JTextField("");
		usuario.setSize(150, 30);
		usuario.setLocation(160, 80);
		usuario.setOpaque(true);
		usuario.setBackground(Color.white);
		login.add(usuario);
		
		JLabel contra = new JLabel("Ingrese su contrasena");
		contra.setBackground(Color.white);
		contra.setSize(200, 40);
		contra.setLocation(160, 120);
		login.add(contra);
		
		JPasswordField contrasena = new JPasswordField();
		contrasena.setSize(150, 30);
		contrasena.setLocation(160, 150);
		contrasena.setOpaque(true);
		contrasena.setBackground(Color.white);
		login.add(contrasena);
		
		JButton boton1= new JButton("Iniciar Sesion");
		boton1.setSize(120, 40);
		boton1.setLocation(170, 210);
		boton1.setOpaque(true);
		boton1.setBackground(Color.white);
		boton1.setForeground(Color.black);
		login.add(boton1);
	
				
		
		JPanel registro = new JPanel();
		registro.setVisible(true);
		registro.setSize(500,700);
		registro.setBackground(Color.decode("#188343"));
		registro.setLayout(null);
		
		JLabel t1 = new JLabel ("panel de registro",JLabel.CENTER);
		t1.setSize(200,40);
		t1.setLocation(150,40);
		t1.setOpaque(true);
		t1.setBackground(Color.white);
		registro.add(t1);
		
		JLabel t2 = new JLabel ("ingrese sus nombre");
		t2.setBackground(Color.white);
		t2.setSize(300,30);
		t2.setLocation(50,105);
		registro.add(t2);
		 
		JTextField nombre = new JTextField();
		nombre.setSize(300,30);
		nombre.setLocation(50,130);
		registro.add(nombre);
		 
		JLabel t3 = new JLabel ("ingrese sus apellidos");
		t3.setBackground(Color.white);
		t3.setSize(300,30);
		t3.setLocation(50,165);
		registro.add(t3);
		
		JTextField apellidos = new JTextField();
		apellidos.setSize(300,30);
		apellidos.setLocation(50,190);
		registro.add(apellidos);
		
		JLabel t4 = new JLabel ("ingrese su correo");
		t4.setBackground(Color.white);
		t4.setSize(300,30);
		t4.setLocation(50,225);
		registro.add(t4);
		 
		JTextField correo = new JTextField();
		correo.setSize(300,30);
		correo.setLocation(50,250);
		registro.add(correo);
		
		JLabel t5 = new JLabel ("ingrese su contraseña");
		t5.setBackground(Color.white);
		t5.setSize(300,30);
		t5.setLocation(50,285);
		registro.add(t5);
		 
		JPasswordField pwd = new JPasswordField();
		pwd.setSize(300,30);
		pwd.setLocation(50,310);
		registro.add(pwd);
		
		JLabel t6 = new JLabel ("ingrese nuevamente su contraseña");
		t6.setBackground(Color.white);
		t6.setSize(300,30);
		t6.setLocation(50,345);
		registro.add(t6);
		 
		JPasswordField pwd2 = new JPasswordField();
		pwd2.setSize(300,30);
		pwd2.setLocation(50,370);
		registro.add(pwd2);
		
		JCheckBox mi_check = new JCheckBox();
		mi_check.setText("Aceptas Terminos y condiciones");
		mi_check.setSize(230, 30);
		mi_check.setLocation(50, 430);
		mi_check.setOpaque(true);
		mi_check.setForeground(Color.BLACK);
		registro.add(mi_check);
		
		JButton boton2= new JButton("Registrar cuenta");
		boton2.setSize(130, 40);
		boton2.setLocation(160, 490);
		boton2.setOpaque(true);
		boton2.setBackground(Color.white);
		boton2.setForeground(Color.black);
		registro.add(boton2);
		
		
		//Acciones
		jmi11.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				remove(registro);
				add(login);
				
				repaint();
			}});
		
		jmi21.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				remove(login);
				add(registro);
				
				repaint();
				
			}});
		
		boton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String email= usuario.getText();
				char[]pwChrs= contrasena.getPassword();
				String password = new String(pwChrs);
				
				System.out.println(email);
				System.out.println(password);
				
				BufferedReader reader;
				try {					
					reader = new BufferedReader(new FileReader("Untitled 1"));
					String line = reader.readLine();
					System.out.println(line);
					while(line!=null){
						String[] datos = null;
						datos = line.split(",");
						System.out.println(datos[2]);
						
						if(datos[2].equals(email)) {
							if(datos[3].equals(password)) {
								JOptionPane.showMessageDialog(null, "Acceso correcto");
								break;
							}
						}
						line=reader.readLine();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}});
		
		boton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String email= usuario.getText();
				char[]pwChrs= contrasena.getPassword();
				String password = new String(pwChrs);
				
				System.out.println(email);
				System.out.println(password);
				
				BufferedReader reader;
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Untitled 1"));
					reader = new BufferedReader(new FileReader("Untitled 1"));
					String line = reader.readLine();
					System.out.println(line);
					System.out.println("prueba01");
					while(line!=null){
						String[] datos = null;
						datos = line.split(",");
						System.out.println(datos[2]);
						
						if(datos[2].equals(email)) {
							if(datos[3].equals(password)) {
								JOptionPane.showMessageDialog(null, "Acceso correcto");
								break;
							}
						}
						line=reader.readLine();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}});
		
		this.revalidate();
		this.repaint();
	}

}

